/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: This class serves as the entry point for the application and contains test scenarios.
 */

 package edu.bu.met.cs665;

 import edu.bu.met.cs665.example1.CustomerData_HTTPS;
 import edu.bu.met.cs665.example1.adaptee.LegacySystemDataRetriever;
 import edu.bu.met.cs665.example1.adapter.LegacyCustomerDataAdaptor;
 import edu.bu.met.cs665.example1.target.NewSystemDataRetriever;
 
 /**
  * The Main class serves as the entry point for the application and contains test scenarios.
  */
 public class Main {
 
   /**
    * A main method to run examples.
    * You may use this method for development purposes as you start building your
    * assignments/final project.  This could prove convenient to test as you are developing.
    * However, please note that every assignment/final projects requires JUnit tests.
    */
   public static void main(String[] args) {
     System.out.println("This is a test message from the Main class (Main.java file)");
 
     // Testing legacy system data retrieval
     LegacySystemDataRetriever myOldSystem = new LegacySystemDataRetriever();
     myOldSystem.getCustomer_USB(94);
 
     // Testing new system data retrieval
     NewSystemDataRetriever myNewSystem = new NewSystemDataRetriever();
     myNewSystem.getCustomer_HTTPS(154);
 
     // Testing legacy system data retrieval with an adapter
     LegacyCustomerDataAdaptor myOldSystemAdaptor = new LegacyCustomerDataAdaptor(myOldSystem);
     test_HTTP_DataRetrival(myOldSystemAdaptor, 89);
   }
 
   /**
    * Helper method to test HTTP data retrieval.
    *
    * @param httpData The HTTP data retriever to be tested.
    * @param customerID The ID of the customer whose data is to be retrieved.
    */
   static void test_HTTP_DataRetrival(CustomerData_HTTPS httpData, int customerID) {
     httpData.getCustomer_HTTPS(customerID);
     httpData.printCustomer(customerID);
   }
 }
 