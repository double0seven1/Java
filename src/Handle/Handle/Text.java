package Handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;

public class Text {
    public static void main(String[] args) {

        // 玩一下获取Class对象的三种方式
        // 1.Class类中的forName方法
        // Class<?> c1 = null;
        // try {
        //     c1 = Class.forName("java.lang.String");
        // } catch (ClassNotFoundException e) {
        //     e.printStackTrace();
        // }

        // 2.每个类都有getClass方法
        // String s1 = new String("abc");
        // Class<?> c2 = s1.getClass();

        // System.out.println(c1 == c2);

        // 3.每个类都有自己的Class属性
        // Class<String> c3 = String.class;
        // System.out.println(c2 == c3);

        // // 从.class文件到.java文件
        // Class<Man> c = Man.class;
        // Man m = null;
        // try {
        //     // 注:这里的newInsetance方法底层调用Man的无参构造.
        //     m = c.newInstance();
        // } catch (InstantiationException | IllegalAccessException e) {
        //     e.printStackTrace();
        // }
        // System.out.println(m);
        // Man m1 = new Man();
        // Class<?> c = m1.getClass();
        // try {
        //     c.newInstance();
        // } catch (InstantiationException | IllegalAccessException e) {
        //     e.printStackTrace();
        // }

        // // 玩一下IO和properties（从文件到哈希表集合）
        // // 弄一个文件输入流
        // FileInputStream fis = null;
        // try {
        //     fis = new FileInputStream("example");
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }
        // // properties集合
        // Properties p = new Properties();
        // try {
        // 把文件的内容加载到p集合
        //     p.load(fis);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        // p.setProperty("4", "IU");

        // 尝试写一个死锁
        // Object o1 = new Object();
        // Object o2 = new Object();
        // Thread t1 = new Thread(new DeadLock0(o1, o2));
        // Thread t2 = new Thread(new DeadLock1(o1, o2));

        // t1.start();
        // t2.start();

        // 反射机制的灵活性（通过修改属性配置文件，去实现不同代码效果）
        Properties p = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("example");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            p.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 先获取.class文件
        Class<?> c = null;
        try {
            c = Class.forName(p.getProperty("1"));
        } catch (ClassNotFoundException e) {
            // e.printStackTrace();
            System.out.println("这里有问题111");
        }

        // 获取了.class文件之后，再转成.java文件
        try {
            Object o = c.newInstance();
            System.out.println(o);
        } catch (InstantiationException | IllegalAccessException e) {
            // e.printStackTrace();
            System.out.println("3这里有问题");
        }

        // 
        // try {
        //     Class.forName("Handle.Man");
        // } catch (ClassNotFoundException e) {
        //     e.printStackTrace();
        // }
    }
}