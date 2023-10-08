package PersonalAssessments;

public class MyAccount {
    private  int balance;
    private  String name;
    private String accountNumber;


    public MyAccount(String name, String accountNumber){
        this.name = name;
        this.accountNumber = accountNumber;
    }
    public String getName(){
        return name;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getBalance(){
        return balance;
    }
    public void deposit(int amount){
        if (amount > 0){
            balance += amount;
        }
        else{
        }
    }


    public void setName(String name) {
        this.name = name;
    }
}
