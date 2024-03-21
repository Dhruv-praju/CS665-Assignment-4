package edu.bu.met.cs665.example1.adapter;

import edu.bu.met.cs665.example1.CustomerData_HTTPS;
import edu.bu.met.cs665.example1.CustomerData_USB;

public class LegacyCustomerDataAdaptor implements CustomerData_HTTPS{
    private CustomerData_USB legacySystem;

    public LegacyCustomerDataAdaptor(CustomerData_USB legacySystem){
        this.legacySystem = legacySystem;
    }

    @Override
    public void printCustomer(int customerID) {
        legacySystem.printCustomer(customerID);
    }
    @Override
    public void getCustomer_HTTPS(int customerID) {
        this.legacySystem.getCustomer_USB(customerID);
    }

}
