package PersonalAssessments;

public class MyAccountTest {
    public static void main(String[] args) {
        MyAccount  thisAccount = new MyAccount("Toby","2462463");
        thisAccount.deposit(2000);
        System.out.println(thisAccount.getBalance());
        thisAccount.deposit(-1000);
        System.out.println(thisAccount.getBalance());
    }
}
