package Thread;

public class ThreadTest0 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "———>" + i);
        }

    }

    // public void doSome() {
    //     Thread.currentThread().
    //     this.
    // }
}
