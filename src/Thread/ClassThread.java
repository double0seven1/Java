package Thread;

public class ClassThread implements Runnable {
    private Class myClass;

    
    public ClassThread(Class myClass) {
        this.myClass = myClass;
    }


    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("t1")) {
            Class.doSome();
        }
        if (Thread.currentThread().getName().equals("t2")) {
            Class.doOther();
        }
    }
    
}