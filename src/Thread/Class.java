package Thread;

public class Class {
    public static synchronized void doSome() {
        System.out.println("doSome方法执行");
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome方法结束");
    }

    // 没有synchronized修饰，锁关我屁事。
    // public static void doOther() {
    //     System.out.println("doOher方法执行");
    //     System.out.println("doOher方法结束");
    // }

    public static synchronized void doOther() {
        System.out.println("doOher方法执行");
        System.out.println("doOher方法结束");
    }
}
