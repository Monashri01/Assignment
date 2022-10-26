public class SavingAccount extends Bank {

     int balance=10000;

    public void deposite(int i) {

        int amount = 500;
        this.balance += amount;
            System.out.println("cash:" + this.balance);

        }
    }


