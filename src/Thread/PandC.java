package Thread;

public class PandC {
    int adsub;

    // 生产
    public synchronized void Add() {
        while (adsub < 10) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("这是在生产,结果是" + adsub);
            this.adsub++;
        }

        // wait为什么会有异常，wait要在synchronize的环境下存在
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 消费
    public synchronized void Sub() {
        while (adsub > 0) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("这是在消费,结果是" + adsub);
            this.adsub--;
        }

        // 调用notify，开始生产
        this.notify();
    }
}