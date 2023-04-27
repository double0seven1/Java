package Thread;

public class Text extends Thread{
    public static void main(String[] args) throws InterruptedException {
        // 玩一下多线程第一种表现
        // 一个类继承Thread，重写run（main）方法，在main方法中new对象，调用start方法

        // ThreadTest0 myThread = new ThreadTest0();
        // myThread.start();
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("主分支线程——>" + i);
        // }

        // 玩一下多线程第二种表现
        // 自定义类实现Runnable接口，实现run方法，然后作为参数传进去
        // Thread myThread = new Thread(new ThreadTest1());
        // myThread.start();
        // for (int i = 0; i < 10; i++) {
        // System.out.println("主分支线程——>" + i);
        // }

        // Thread的参数是runnable接口，可以用一下匿名内部类
        // Thread myThread = new Thread(new Runnable() {
        //     @Override
        //     public void run() {
        //         for (int i = 0; i < 10; i++) {
        //     System.out.println("分支线程———>" + i);
        // }
        //     }
        // });
        // myThread.start();
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("主分支线程——>" + i);
        // }

    
        // 玩一下thread中的Sleep方法
        // Text t1 = new Text();
        // t1.sleep(5000);
        // System.out.println("命运就像大厦");


        // 玩一下Thread的setName和getName方法
        // Text t2 = new Text();
        // t2.setName("This is a Thread");
        // System.out.println(t2.getName());


        
    }
}
