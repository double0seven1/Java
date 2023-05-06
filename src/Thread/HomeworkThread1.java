package Thread;

public class HomeworkThread1 implements Runnable {

    Homework numble;

    public HomeworkThread1(Homework numble) {
        this.numble = numble;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (numble) {
                if (numble.numble % 2 == 0) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "->" + numble.numble);
                    numble.numble++;
                }
                try {
                    numble.notify();
                    numble.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
