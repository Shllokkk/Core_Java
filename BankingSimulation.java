class Customer {
    private int amount;

    Customer() {
        this.amount=10000;
    }

    synchronized void withdraw(int amount) throws InterruptedException{
        while(this.amount<amount) {
            System.out.println("Insufficient balance!Cannot withdraw!Need to wait");
            System.out.println("Current balance: "+this.amount);
            wait();
        }
        System.out.println("Balance before withdrawal: "+this.amount);
        this.amount-=amount;
        System.out.println("Balance after withdrawal: "+this.amount);
    }
    synchronized void deposit(int amount) throws InterruptedException{
        System.out.println("Amount to be deposited: "+amount);
        this.amount+=amount;
        System.out.println("Balance after deposit: "+this.amount);  
        notifyAll();    
    }
    int getBalance() {
        return this.amount;
    }
}

class WithdrawThread extends Thread {
    Customer target;
    int amount;

    WithdrawThread(Customer ref,int amount) {
        this.target=ref;
        this.amount=amount;
        start();
    }
    public void run() {
        try {
            target.withdraw(amount);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class depositThread extends Thread {
    Customer target;
    int amount;

    depositThread(Customer ref,int amount) {
        this.target=ref;
        this.amount=amount;
        start();
    }
    public void run() {
        try {
            target.deposit(amount);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class BankingSimulation {
    public static void main(String[] args) throws InterruptedException{
        Customer obj=new Customer();

        new WithdrawThread(obj,15000);
        new WithdrawThread(obj, 17000);

        Thread.sleep(5000);
        new depositThread(obj, 200000);
    }
}