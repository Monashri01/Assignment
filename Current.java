public class Current extends Bank {


     int balance=10000;

    public void deposite(int amount) {

        this.balance -= amount;
        System.out.println("cash:" + this.balance);
    }
}
