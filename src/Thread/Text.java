package Thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// 直接面对各种困难，各种分心的事。
public class Text {
    public static void main(String[] args) throws InterruptedException, ParseException, ExecutionException {
        // 一个类继承Thread，重写run（main）方法，在main方法中new对象，调用start方法

        // ThreadTest0 myThread = new ThreadTest0();
        // myThread.start();
        // for (int i = 0; i < 10; i++) {
        // System.out.println("主分支线程——>" + i);
        // }

        // 玩一下多线程第二种表现
        // 自定义类实现Runnable接口，实现run方法，然后作为参数传进去
        // Thread myThread = new Thread(new ThreadTest1());
        // myThread.start();
        // for (int i = 0; i < 10; i++) {
        // System.out.println("主分支线程——>" + i);
        // }

        // Thread的参数是runnable接口，可以用一下匿名内部类（假如你要马上启动线程去运行run方法）
        // Thread myThread = new Thread(new Runnable() {
        // @Override
        // public void run() {
        // for (int i = 0; i < 10; i++) {
        // System.out.println("分支线程———>" + i);
        // }
        // }
        // });
        // myThread.start();
        // for (int i = 0; i < 10; i++) {
        // System.out.println("主分支线程——>" + i);
        // }

        // 玩一下thread中的Sleep方法
        // Text t1 = new Text();
        // t1.sleep(5000);
        // System.out.println("命运就像大厦");

        // 玩一下Thread的setName和getName方法
        // Text t2 = new Text();
        // t2.setName("This is a Thread");
        // System.out.println(t2.getName());

        // System.out.println(Thread.currentThread().getName());
        // Thread.currentThread().run();
        // System.out.println("hello");

        // // 玩一下Thread中的currentThread方法
        // System.out.println(Thread.currentThread().getName()); // 指向主线程

        // Thread th = new Thread(new ThreadTest1());
        // th.setName("第一个线程");
        // th.start(); //准备开始抢CPU时间片

        // Thread th2 = new Thread(new ThreadTest1());
        // th2.setName("第二个线程");
        // th2.start(); //准备开枪CPU时间片

        // Thread th3 = new Thread(new ThreadTest1());
        // th3.setName("第三个线程");
        // th3.start(); // 准备开枪CPU时间片

        // currentThread与this这两个指针有什么区别呢？
        // Thread.currentThread().

        // 玩一下Thread中的interrupt方法
        // Thread myThread = new Thread(new ThreadTest1());
        // myThread.setName("线程for Interrupt");
        // myThread.start();

        // 主线程停5秒之后，对myThread的sleep方法实行interrupt
        // try {
        // Thread.sleep(1000);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }

        // // 中断myThread中的sleep方法:
        // myThread.interrupt();
        // Thread myThread = new Thread(new ThreadTest1());
        // myThread.start();
        // try {
        // Thread.sleep(2000);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // myThread.interrupt();

        // 玩一下间接setName方法，new Runnable的时候，在后面加个逗号，然后命名
        // Thread t = new Thread(new ThreadTest1(), "t");
        // t.start();

        // 想中断某个线程——中断标记
        // 五秒之后，结束进程
        // ThreadTest1 t = new ThreadTest1();
        // Thread myThread = new Thread(t);
        // myThread.start();
        // Thread.sleep(5000);
        // t.isrun = false;

        // // 下面这是在玩synchronized这个能线程同步的关键字
        // Account myAccount = new Account(1, 10000);
        // // Account myAccount2 = new Account(2, 20000);

        // Thread thread1 = new AccountThread(myAccount);
        // Thread thread2 = new AccountThread(myAccount);
        // // Thread thread3 = new AccountThread(myAccount2);

        // thread1.setName("1号线程");
        // thread2.setName("2号线程");
        // // // thread3.setName("3号线程");

        // thread1.start(); 
        // thread2.start();
        // thread3.start();

        // StringBuffer sb = new StringBuffer();
        // sb.append("abcdefg");
        // char arr[] = {'1','2','3','4','5'};
        // sb.append(arr, 0, arr.length);
        // System.out.println(sb);

        // synchronized的面试题1
        // Class myClass = new Class();
        // Thread t1 = new Thread(new ClassThread(myClass),"t1");
        // Thread t2 = new Thread(new ClassThread(myClass), "t2");
        // t1.start();
        // Thread.sleep(1000);
        // t2.start();

        // 试着写一个死锁出来（通过嵌套synchronized）
        // Object o1 = new Object();
        // Object o2 = new Object();

        // Thread t1 = new MyObjectThread(o1,o2);
        // Thread t2 = new MyObjectThread1(o1, o2);

        // t1.start();
        // t2.start();


        // 玩一下计时器（java.util.Timer）
        // 计时器第一次运行的时间
        // SimpleDateFormat china = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        // Date nowDate = china.parse("2023/5/5 13:02:00");

        // Timer myTimer = new Timer();
        // myTimer.schedule(new timerTask(), nowDate, 5000);



        // 实现线程的第三种方式，new Thread的参数传入FutureTask
        // FutureTask:new FutureTask的参数传入Callable
        // FutureTask<Object> futureTask = new FutureTask<>(new Callable<Object>(){
        //     @Override
        //     public Object call() throws Exception {
        //         Thread.sleep(5000);
        //         return new Object();
        //     }
        // });
        // Thread myThread = new Thread(futureTask);
        // myThread.start();
        // System.out.println(futureTask.get());


        // 对一个数进行生产者消费者式的操作
        PandC pandc = new PandC();
        Thread produce = new Thread(new PandCThread0(pandc));
        Thread consume = new Thread(new PandCThread1(pandc));

        produce.start();
        Thread.sleep(5000);
        consume.start();
    }
}
