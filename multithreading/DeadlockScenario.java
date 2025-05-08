class BankAccount{
    private final String accountName;
    private float balance;

    public BankAccount(String name){
        accountName=name;
        balance = 0;
    }

    public synchronized void deposit(float amount){
        balance+=amount;
        System.out.println(accountName+" Deposited "+ amount + " New Balance " + balance);
    }
    public synchronized void withdraw(float amount){
        balance-=amount;
        System.out.println(accountName+" Withdrew "+ amount + " New Balance " + balance);
    }
    public synchronized void transfer(float amount, BankAccount target){
        System.out.println("Lock Acquired on "+ accountName + "by" +  Thread.currentThread().getName());
        withdraw(amount);
        synchronized(target){
            System.out.println("Lock Acquired on "+ target + accountName + "by" + Thread.currentThread().getName());
            target.deposit(amount);
            System.out.println("Transferred "+ amount + "from" + accountName + "to" + target.accountName);
        }
    }
}

class MoneyTransfer implements Runnable {
    private BankAccount source, target;
    private float amount;

    public MoneyTransfer(BankAccount source, BankAccount target, float amount) {
        this.source = source;
        this.target = target;
        this.amount = amount;
    }

    public void run() {
        source.transfer(amount, target);
    }
}

public class DeadlockScenario {
    public static void main(String[] args) {
        BankAccount Account1 = new BankAccount("AliceAccount");
        BankAccount Account2 = new BankAccount("BobAccount");

        Runnable transaction1 = new MoneyTransfer(Account1, Account2, 1200);
        Thread t1 = new Thread(transaction1);
        t1.start();

        Runnable transaction2 = new MoneyTransfer(Account2, Account1, 700);
        Thread t2 = new Thread(transaction2);
        t2.start();
    }
}

