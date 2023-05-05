package Thread;

public class Main {
        public static void main(String[] args) {
            Thread myThread = new Thread(new ThreadTest1());
            myThread.setName("线程for Interrupt");
            myThread.start();

            // 主线程停5秒之后，对myThread的sleep方法实行interrupt
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 中断myThread中的sleep方法:
            myThread.interrupt();
        }
    }
