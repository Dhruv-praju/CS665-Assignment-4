/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date : 03/20/2024
 * Package: edu.bu.met.cs665.example1.adapter
 * File Name: LegacyCustomerDataAdaptor.java
 * Description: This class adapts the legacy system's interface to the new system's interface.
 */

 package edu.bu.met.cs665.example1.adapter;

 import edu.bu.met.cs665.example1.CustomerData_HTTPS;
 import edu.bu.met.cs665.example1.CustomerData_USB;
 
 /**
  * The LegacyCustomerDataAdaptor class adapts the legacy system's interface to the new system's interface.
  */
 public class LegacyCustomerDataAdaptor implements CustomerData_HTTPS {
     private CustomerData_USB legacySystem;
 
     /**
      * Constructor to create a LegacyCustomerDataAdaptor instance with a specified legacy system.
      *
      * @param legacySystem The legacy system to be adapted.
      */
     public LegacyCustomerDataAdaptor(CustomerData_USB legacySystem) {
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
 