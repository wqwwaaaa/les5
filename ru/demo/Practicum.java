package ru.demo;

public class Practicum {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setMoneyAmount(1000);
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
        bankAccount.takeMoney();
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
    }
}

class BankAccount {
    private long moneyAmount;

    public long getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(long newMoneyAmount) {
        this.moneyAmount = newMoneyAmount;
    }

    public void takeMoney(){
        System.out.println("Со счета снято " + moneyAmount +"p.");
        moneyAmount = 0;
    }


}