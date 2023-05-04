package Thread;

public class AccountThread extends Thread{
    private Account account;

    // 通过构造方法访问同一个账号
    public AccountThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        // 扩大同步范围，效率变低
        // synchronized (this) {
        account.getMonney(5000);
        // }
        System.out.println("这是" + Thread.currentThread().getName() + "在操作，余额还有:" + account.getBalance());
    }
}