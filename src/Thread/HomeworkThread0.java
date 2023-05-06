package Thread;

public class HomeworkThread0 implements Runnable {

    Homework numble;

    public HomeworkThread0(Homework numble) {
        this.numble = numble;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (numble) {
                if (numble.numble % 2 != 0) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "->" + numble.numble);
                    numble.numble++;
                }
                try {
                    // 叫醒其他线程
                    numble.notify();
                    // 让当前线程先挂起来，释放当前锁
                    numble.wait();
                   
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
