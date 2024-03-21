/**
 * Name: Dhruv Prajapati
 * Course : CS-665 Software Designs & Patterns
 * Date : 03/20/2024
 * File Name: Client.java
 * Description: This class represents a client that uses the new system's interface to fetch customer data.
 */

 package edu.bu.met.cs665.example1;

 /**
  * The Client class represents a client that uses the new system's interface to fetch customer data.
  */
 public class Client {
     CustomerData_HTTPS dataRetriever;
 
     /**
      * Constructor to create a Client instance with a specified data retriever.
      *
      * @param dataRetriever The data retriever to be used by the client.
      */
     public Client(CustomerData_HTTPS dataRetriever){
         this.dataRetriever = dataRetriever;
     }
 
     /**
      * Setter method to set the data retriever for the client.
      *
      * @param dataRetriever The data retriever to be set for the client.
      */
     public void setDataRetriever(CustomerData_HTTPS dataRetriever) {
         this.dataRetriever = dataRetriever;
     }
 
     /**
      * Method to fetch customer data using the data retriever.
      *
      * @param customerId The ID of the customer whose data is to be fetched.
      */
     public void fetchCustomerData(int customerId){
         dataRetriever.getCustomer_HTTPS(customerId);
     }
 }
 