package com.content.java.oops.abstraction;

class BankDetails {
    private String accno;
    private String name;
    private String balance;

    public BankDetails(String acc, String naam, String bal) {
        accno = acc;
        name = naam;
        balance = bal;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String newBalance) {
        balance = newBalance;
    }

    public void showBankDetails() {
        System.out.println("Accno = " + accno);
        System.out.println("Name = " + name);
        System.out.println("Balance = " + balance);
    }

    public static void main(String[] args) {
        BankDetails bank = new BankDetails("251203020617", "Aditya", "1000");
        bank.showBankDetails();
        bank.setBalance("10000");
        System.out.println("New Balance: " + bank.getBalance());
    }
}
