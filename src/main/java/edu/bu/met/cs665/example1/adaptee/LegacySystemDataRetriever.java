/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date : 03/20/2024
 * Package: edu.bu.met.cs665.example1.adaptee
 * File Name: LegacySystemDataRetriever.java
 * Description: This class implements the CustomerData_USB interface to retrieve customer data from the legacy system.
 */

 package edu.bu.met.cs665.example1.adaptee;

 import edu.bu.met.cs665.example1.CustomerData_USB;
 
 /**
  * The LegacySystemDataRetriever class implements the CustomerData_USB interface to retrieve customer data from the legacy system.
  */
 public class LegacySystemDataRetriever implements CustomerData_USB {
 
     @Override
     public void printCustomer(int customerID) {
         System.out.println("The customer id is " + customerID);
     }
 
     @Override
     public void getCustomer_USB(int customerID) {
         System.out.println("Fetched customer with id " + customerID + " from USB connection");
     }
 }
 