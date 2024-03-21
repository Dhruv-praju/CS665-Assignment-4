package edu.bu.met.cs665.example1;

public class NewSystem implements CustomerData_HTTPS{
    @Override
    public void printCustomer(int customerID) {
        System.out.println("The customer id is "+ customerID);
    }
    @Override
    public void getCustomer_HTTPS(int customerID) {
        System.out.println("Fetched customer with id "+ customerID+" from HTTPS connection");
    }
}
