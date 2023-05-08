package Handle1;

public class DeadLock0 implements Runnable {

    Object o1;
    Object o2;

    public DeadLock0(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1) {
            System.out.println("我锁了o1");
            synchronized (o2) {
                ;
            }
        }
    }
    
}
