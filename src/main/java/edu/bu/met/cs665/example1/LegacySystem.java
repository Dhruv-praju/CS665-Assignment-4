package edu.bu.met.cs665.example1;

public class LegacySystem implements CustomerData_USB{
    @Override
    public void printCustomer(int customerID) {
        System.out.println("The customer id is "+ customerID);
    }
    @Override
    public void getCustomer_USB(int customerID) {
        System.out.println("Fetched customer with id "+ customerID+" from USB connection");
    }
}
