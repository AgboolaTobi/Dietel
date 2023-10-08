package Dietelchapter3;

public class Account {
        private String name;
        private double balance;

        public Account(String name, double balance) {
            this.name = name;
            this.balance = balance;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public double checkBalance() {
            return balance;
        }

        public void deposit(int amount) {
            balance = balance + amount;
        }

        public void withdraw(double amount) {
            if (balance > amount && amount > 0) {
                balance = balance - amount;
            }
        }

}
