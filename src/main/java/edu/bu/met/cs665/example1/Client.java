package edu.bu.met.cs665.example1;

public class Client {
    CustomerData_HTTPS dataRetriever;

    public Client(CustomerData_HTTPS dataRetriever){
        this.dataRetriever = dataRetriever;
    }
    public void setDataRetriever(CustomerData_HTTPS dataRetriever) {
        this.dataRetriever = dataRetriever;
    }
    public void fetchCustomerData(int customerId){
        dataRetriever.getCustomer_HTTPS(customerId);
    }
}
