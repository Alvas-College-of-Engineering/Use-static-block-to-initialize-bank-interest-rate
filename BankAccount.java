package model;

public class BankAccount {

    private int accountNumber;
    private String customerName;
    private double balance;

    static double interestRate;

    // Static Block
    static {
        interestRate = 5.0;
    }

    // Parameterized Constructor
    public BankAccount(int accountNumber,
                       String customerName,
                       double balance) {

        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    public static double getInterestRate() {
        return interestRate;
    }
}