package Thread;

public class Account {

    private int number;
    private double balance;
    Object obj1 = new Object();

    public Account() {  
    }

    public Account(int number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    // 取钱
    // synchronized修饰实例方法，只有锁this
    public synchronized void getMonney(double get) {

        // "a"的话，所有的线程同步
        // synchronized ("a") { 
            // synchronized (this) {
            // double before = this.balance;
            // double after = before - get;
            // // 模拟网络延迟：
            // try {
            //     Thread.sleep(1000);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
            // // 更新余额:
            // this.balance = after;
            // System.9out.println(this.balance);
        // }
    }
}