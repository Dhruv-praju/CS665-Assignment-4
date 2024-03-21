package edu.bu.met.cs665;

import org.junit.Test;

import edu.bu.met.cs665.example1.LegacySystem;
import edu.bu.met.cs665.example1.NewSystem;
import edu.bu.met.cs665.example1.adapter.LegacyCustomerDataAdaptor;

public class TestSystem {
    public TestSystem() {
    }

    @Test
    public void testLegacySystem(){
        System.out.println("LEGACY TEST : ");
        LegacySystem myOldSystem = new LegacySystem();
        int customerID = 94;

        myOldSystem.getCustomer_USB(customerID);
        myOldSystem.printCustomer(customerID);
    }
    
    @Test
    public void testNewSystem(){
        System.out.println("NEW SYSTEM TEST : ");
        NewSystem myNewSystem = new NewSystem();
        int customerID = 94;

        myNewSystem.getCustomer_HTTPS(customerID);
        myNewSystem.printCustomer(customerID);
    }

    @Test
    public void testLegacyAdaptor(){
        System.out.println("ADAPTOR TEST : ");
        
        LegacySystem myOldSystem = new LegacySystem();
        int customerID = 94;

        LegacyCustomerDataAdaptor myOldSystemAdaptor = new LegacyCustomerDataAdaptor(myOldSystem);
        myOldSystemAdaptor.getCustomer_HTTPS(customerID);
        myOldSystemAdaptor.printCustomer(customerID);
    }
}
