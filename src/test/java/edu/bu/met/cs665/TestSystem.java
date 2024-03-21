package edu.bu.met.cs665;

import org.junit.Test;

import edu.bu.met.cs665.example1.Client;
import edu.bu.met.cs665.example1.adaptee.LegacySystemDataRetriever;
import edu.bu.met.cs665.example1.adapter.LegacyCustomerDataAdaptor;
import edu.bu.met.cs665.example1.target.NewSystemDataRetriever;

public class TestSystem {
    public TestSystem() {
    }

    @Test
    public void testClient(){
        System.out.println("CLIENT TEST : ");

        NewSystemDataRetriever newSystemDataRetriever = new NewSystemDataRetriever();
        Client client = new Client(newSystemDataRetriever);

        int customerID = 40;
        client.fetchCustomerData(customerID);
    }
    @Test
    public void testClientWithAdaptor(){
        System.out.println("CLIENT TEST : ");

        LegacySystemDataRetriever myLegacyRetriever = new LegacySystemDataRetriever();
        LegacyCustomerDataAdaptor myLegacyDataAdaptor = new LegacyCustomerDataAdaptor(myLegacyRetriever);

        Client client = new Client(myLegacyDataAdaptor);
        int customerID = 75;
        client.fetchCustomerData(customerID);
    }
    @Test
    public void testLegacySystemDataRetriever(){
        System.out.println("LEGACY RETRIEVER TEST : ");
        LegacySystemDataRetriever myOldSystem = new LegacySystemDataRetriever();
        int customerID = 94;

        myOldSystem.getCustomer_USB(customerID);
        myOldSystem.printCustomer(customerID);
    }
    
    @Test
    public void testNewSystemDataRetriever(){
        System.out.println("NEW SYSTEM RETRIEVER TEST : ");
        NewSystemDataRetriever myNewSystem = new NewSystemDataRetriever();
        int customerID = 31;

        myNewSystem.getCustomer_HTTPS(customerID);
        myNewSystem.printCustomer(customerID);
    }
    @Test
    public void testLegacyAdaptor(){
        System.out.println("ADAPTOR TEST : ");
        
        LegacySystemDataRetriever myOldSystem = new LegacySystemDataRetriever();
        int customerID = 59;

        LegacyCustomerDataAdaptor myOldSystemAdaptor = new LegacyCustomerDataAdaptor(myOldSystem);
        myOldSystemAdaptor.getCustomer_HTTPS(customerID);
        myOldSystemAdaptor.printCustomer(customerID);
    }
}
