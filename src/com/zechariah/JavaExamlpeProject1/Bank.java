package com.zechariah.JavaExamlpeProject1;

public class Bank {
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public void deposit(double amountDeposited){
        balance += amountDeposited;
        System.out.println("Deposit of " + amountDeposited + " was Made into the Account. New Balance is " + balance);
    }

    public void withdraw(double amountWithdraw){
        if ((balance - amountWithdraw) <= 0){
            System.out.println("Withdrawal Was not Possible, You were trying to withdraw " + amountWithdraw + " from an Account of " + balance);
        } else {
            System.out.println(amountWithdraw + " Was Withdrawn from Your Account. New Balance is " + balance);
        }
    }

    public void printBalance(){
        System.out.println("Your Account Balance is " + balance);
    }
}
