//package ObjectsPackage;
//
//import ObjectsPackage.Shopping.Account;
//
//import java.util.ArrayList;
//
//public class Bank {
//    private int totalNumberOfAccountCreated;
//    private ArrayList<Account> accounts = new ArrayList<>();
//    private int balance;
//    public int getTotalAccount(){
//        return totalNumberOfAccountCreated;
//    }
//
//    public Account createAccountFor(String firstName, String secondName, String pin) {
//        totalNumberOfAccountCreated++;
//        String accountNumber = generateAccountNumber();
//        String fullName = generateFullName(firstName, secondName);
//        Account account = new Account(accountNumber,fullName, pin);
//        accounts.add(account);
//        return account;
//    }
//
//    private String generateFullName(String firstName, String secondName) {
//        return firstName + " " + secondName;
//    }
//
//
//    private String generateAccountNumber() {
//        return totalNumberOfAccountCreated+"";
//    }
//
//    public Account findAccount(String number) {
//        for (Account account: accounts) {
//            if (account.getAccountNumber().equals(number)) return account;
//        }
//        throw new InvalidAccount("Account not found");
//    }
//
//    public int checkBalance(String pin) {
//        return balance;
//    }
//}
