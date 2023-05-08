package Handle1;

public class DeadLock1 implements Runnable {
    Object o1;
    Object o2;

    public DeadLock1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o2) {
            System.out.println("我锁了o2");
            synchronized (o1) {
                ;
            }
        }
    }
}
