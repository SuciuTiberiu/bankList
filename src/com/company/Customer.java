package com.company;

import java.util.ArrayList;

public class Customer {

    private ArrayList<Double> transactions;
    private String name;

    public Customer( String name, double initialAmount) {
        this.transactions = new ArrayList<Double>();
        this.name = name;
        addTransactions(initialAmount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransactions(double amount) {
        this.transactions.add(amount);
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }
}
