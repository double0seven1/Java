package Thread;

public class MyObjectThread extends Thread {
    Object o1;
    Object o2;

    public MyObjectThread(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2) {
                ;
            }
        }
        System.out.println("0结束");
    }

    
}
