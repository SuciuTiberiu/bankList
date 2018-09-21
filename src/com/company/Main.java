package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Natonal Romanian Bank");

        bank.addBranch("Cluj-Napoca");

        bank.addCustomer("Cluj-Napoca","Tibi", 50.05);
        bank.addCustomer("Cluj-Napoca","Mihai",175.35);
        bank.addCustomer("Cluj-Napoca","Adrian",220.15);

        bank.addBranch("Dej");
        bank.addCustomer("Dej","Denis",150.65);

        bank.addCustomerTransation("Cluj-Napoca","Tibi",44.65);
        bank.addCustomerTransation("Cluj-Napoca","Tibi",12.22);
        bank.addCustomerTransation("Cluj-Napoca","Mihai",4.11);

        bank.listCustomers("Cluj-Napoca",true);
        bank.listCustomers("Dej",true);

    }
}
