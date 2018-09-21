package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Branch {

    private String name;
    private  ArrayList<Customer> customers;
    private  ArrayList<Customer> Branches;
    private double transaction;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }


    public  boolean addNewCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addTransaction(String customerName, double amount){
        Customer existingCustomer = (findCustomer(customerName));
        if(existingCustomer!=null){
            existingCustomer.addTransactions(amount);
        }return true;
    }

    private  Customer findCustomer(String customerName){
        for(int i=0; i<this.customers.size();i++){
            Customer checkCustomer = this.customers.get(i);
            if(checkCustomer.getName().equals(customerName)){
                return checkCustomer;
            }
        }
        return null;
    }

}
