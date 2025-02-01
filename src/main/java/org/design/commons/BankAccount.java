package org.design.commons;

import org.design.enums.AccountType;
import org.design.exceptions.InsufficientBalanceException;

import java.math.BigDecimal;

public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private BigDecimal balance;
    private AccountType accountType;

    public BankAccount() {

    }

    public BankAccount(String accountNumber, String accountHolderName, BigDecimal balance, AccountType accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.isEmpty()) throw new IllegalArgumentException("accountNumber cannot be null");
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName == null || accountHolderName.isEmpty()) throw new IllegalArgumentException("accountHolderName cannot be null");
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(BigDecimal balance) throws Exception {
        if(balance ==  null || balance.compareTo(BigDecimal.valueOf(100L)) <= -1) throw new InsufficientBalanceException("balance cannot be less than 100");
        this.balance = balance;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public String deposit(BigDecimal amount) {
        balance = balance.add(amount);
        return String.format("deposited %s to %s", amount, accountNumber);
    }

    public String withdrawn(BigDecimal amount) {
        if(amount == null || amount.compareTo(balance) >= 0) throw new IllegalArgumentException("Insufficient balance");
        balance = balance.subtract(amount);
        return String.format("Withdrawn %s from %s", amount, accountNumber);
    }

    public String checkBalance() {
        return String.format("Rs %s Balance available", balance);
    }

    @Override
    public String toString() {
        return String.format("Account Name :: %s \nAccount Number :: %s \nAccountType :: %s \nAccount Balance :: %s"
        , accountHolderName, accountNumber, accountType.getType(), balance);
    }


}
