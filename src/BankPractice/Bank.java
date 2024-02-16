package BankPractice;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private int totalNumberOfAccounts;
    private ArrayList<Account> accounts = new ArrayList<>();

    public void bankName(String bankName) {
        this.bankName = bankName;
    }

    public String checkBankName() {
        return bankName;
    }



    public Account createAccountFor(String firstName, String lastName, String pin) {
        totalNumberOfAccounts++;
        Account account = new Account(generateAccountName(firstName,lastName),generateAccountNumber(),pin);
        accounts.add(account);
        return account;
    }
    public String generateAccountName(String firstName,String lastName){
        return firstName + " " + lastName;
    }

    public String generateAccountNumber(){
        return "011325567" + totalNumberOfAccounts;
    }



    public int getNumberOfAccounts() {
        return totalNumberOfAccounts;
    }

    public Account findAccount(String number) {
        for(Account account : accounts){
            if (account.getAccountNumber().equals(number)){
                return account;
            }
        }
        throw new AccountNotFoundException("Account does not exist. Kindly create contact our customer care service...");
    }


    public void deposit(String accountNumber, int amount) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);
    }

    public void withdraw(String accountNumber,int amount,String pin) {
        Account account = findAccount(accountNumber);
        account.withdraw(amount,pin);
    }

    public void transfer(String accountNumber1, String accountNumber2, int amount, String pin) {
        Account account1 = findAccount(accountNumber1);
        Account account2 = findAccount(accountNumber2);
        account1.withdraw(amount,pin);
        account2.deposit(amount);
    }

    public void closeAccount(String accountNumber) {
        accounts.remove(findAccount(accountNumber));
    }
}
