/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date : 03/20/2024
 * Package: edu.bu.met.cs665.example1
 * File Name: CustomerData_USB.java
 * Description: This interface defines methods for accessing customer data through a USB connection.
 */

 package edu.bu.met.cs665.example1;

 /**
  * The CustomerData_USB interface defines methods for accessing customer data through a USB connection.
  */
 public interface CustomerData_USB {
     /**
      * Method to print customer information for a given customer ID.
      *
      * @param customerID The ID of the customer whose information is to be printed.
      */
     void printCustomer(int customerID);
 
     /**
      * Method to get customer data for a given customer ID through a USB connection.
      *
      * @param customerID The ID of the customer whose data is to be retrieved.
      */
     void getCustomer_USB(int customerID);
 }
 