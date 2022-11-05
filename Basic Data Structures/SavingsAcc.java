public class SavingsAcc {
    double balance = 15000;
    long id;

    SavingsAcc(long id,double balance){
        this.balance = balance;
        this.id = id;
    }

    public double withdraw(double amt) {
        if(balance==0 || balance<amt) {
            throw new RuntimeException("InsuffficientBalanceException");
        }
        else if(amt<0) {
            throw new RuntimeException("IllegalBankTransactionException");
        }
        return amt;
    }

    public double deposit(double amt) {
        balance += amt;
        return balance;
    }
    public static void main(String args[]) {
        SavingsAcc s1 = new SavingsAcc(12703, 28000);
        double availBal = s1.deposit(5000);
        System.out.println("Available Balance after deposit: "+availBal);
        double withdrawAmt = s1.withdraw(35000);
        System.out.println("Available Balance after withdraw: "+ (availBal-withdrawAmt));
    }

}

