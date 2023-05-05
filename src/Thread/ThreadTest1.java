package Thread;

public class ThreadTest1 implements Runnable {

    public boolean isrun = true;
    int coumt;
    @Override
    public void run() {
        // 常识：子类抛出的异常不能比父类的要多
        // 通过捕捉异常来结束sleep方法
        // System.out.println(Thread.currentThread().getName() + "--> begin！");
        // try {
        //     Thread.sleep(1000);
        // } catch (InterruptedException e) {
        //     System.out.println(Thread.currentThread().getName() + " has been interrupted!");

        // }
        // System.out.println(Thread.currentThread().getName() + "--> end！");

        // 玩一下interrupted方法
        // while (!Thread.interrupted()) {
        //     System.out.print("1 ");
        // }
        // System.out.println(Thread.interrupted());
        // for (int i = 0; i < 10; i++) {
        //     System.out.println(i);
        // }
        // System.out.println("interrupt方法只是把中断标志位这个属性改为true");
        // 通过打标记去结束进程
        // while (isrun) {
        //     try {
        //         Thread.sleep(1000);
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        //     System.out.println(coumt++);
        //    }

    }
} 