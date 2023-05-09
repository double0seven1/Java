package Handle1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;
import java.util.ResourceBundle;

public class Text {
    public static void main(String[] args) throws ClassNotFoundException, IOException {

        // 玩一下获取Class对象的三种方式
        // 1.Class类中的forName方法
        // Class<?> c1 = null;
        // try {
        // c1 = Class.forName("java.lang.String");
        // } catch (ClassNotFoundException e) {
        // e.printStackTrace();
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
        // // 注:这里的newInsetance方法底层调用Man的无参构造.
        // m = c.newInstance();
        // } catch (InstantiationException | IllegalAccessException e) {
        // e.printStackTrace();
        // }
        // System.out.println(m);
        // Man m1 = new Man();
        // Class<?> c = m1.getClass();
        // try {
        // c.newInstance();
        // } catch (InstantiationException | IllegalAccessException e) {
        // e.printStackTrace();
        // }

        // // 玩一下IO和properties（从文件到哈希表集合）
        // // 弄一个文件输入流
        // FileInputStream fis = null;
        // try {
        // fis = new FileInputStream("example");
        // } catch (FileNotFoundException e) {
        // e.printStackTrace();
        // }
        // // properties集合
        // Properties p = new Properties();
        // try {
        // 把文件的内容加载到p集合
        // p.load(fis);
        // } catch (IOException e) {
        // e.printStackTrace();
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
        // Properties p = new Properties();
        // FileInputStream fis = null;
        // try {
        // fis = new FileInputStream("example");
        // } catch (FileNotFoundException e) {
        // e.printStackTrace();
        // }
        // try {
        // p.load(fis);
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        // 先获取.class文件
        // Class<?> c = null;
        // try {
        // c = Class.forName(p.getProperty("1"));
        // } catch (ClassNotFoundException e) {
        // // e.printStackTrace();
        // System.out.println("这里有问题111");
        // }

        // // 获取了.class文件之后，再转成.java文件
        // try {
        // Object o = c.newInstance();
        // System.out.println(o);
        // } catch (InstantiationException | IllegalAccessException e) {
        // e.printStackTrace();
        // }

        // try {
        // Class.forName("Handle.Man");
        // } catch (ClassNotFoundException e) {
        // e.printStackTrace();
        // }

        // 获取src底下的文件的绝对路径
        // 妈的，终于搞出哪里有问题了，既然getResource方法是类加载器的，那肯定是找bin目录下的东西（bin目录放的都是.class文件）
        // String path =
        // Thread.currentThread().getContextClassLoader().getResource("Handle1/Man.class").getPath();
        // System.out.println(path);///
        // E:/JAVA%20PROJECT/HandleClsss/bin/Handle1/example

        // IO流与类加载器的方法结合（因为IO流需要文件的路径，而类加载器恰好可以获得文件的绝对路径）
        // 创建一个流，这个流连接了properties文件和内存里面的properties集合
        // InputStream inputStream = Thread.currentThread().getContextClassLoader()
        // .getResourceAsStream("Handle1/example.properties");
        // Properties properties = new Properties();
        // try {
        // properties.load(inputStream);
        // System.out.println(properties.getProperty("1"));
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        // 以上的代码作用是读取.properties文件里面的东西，其实还有更简单的实现方法：资源绑定器
        // ResourceBundle bundle = ResourceBundle.getBundle("example");
        // System.out.println(bundle.getString("1"));

        // 获取文件的绝对路径(在Mac和window也可行)
        // String path = Thread.currentThread().getContextClassLoader().getResource("example").getPath();
        // System.out.println(path);

        // // 获取.Class里的属性
        // // 先获取整个.class文件
        // Class<?> c = Class.forName("Handle1.Man");
        // System.out.println(c.getSimpleName());

        // // 然后再获取.Class里面的属性
        // Field field[] = c.getDeclaredFields();
        // for (Field field2 : field) {

        //     System.out.print(Modifier.toString(field2.getModifiers()) + " ");
        //     System.out.print(field2.getType().getSimpleName() + " = ");
        //     System.out.println(field2.getName());
        //     // private int = age
        //     // private String = name
        // }

        
        // 两个线程交叉打印奇偶数
        // Man m = new Man();
        // Thread t1 = new Thread(new A(m),"t1");
        // Thread t2 = new Thread(new B(m),"t2");
        // t1.start();
        // t2.start();



        /**
         * 通过类加载器获取文件的具体的地址，这个地址可以配合IO流。如果是连接.propeities文件就用资源管理器.
         */
        // 这个IO流指向了girl这个文件
        // InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("girl.properties");
        // // 读取文件的东西
        // byte arr[] = new byte[4];
        // int ret = 0;
        // while ((ret = stream.read(arr)) != -1) {
        //     // 如何读取arr里面的东西呢？
        //     System.out.print(new String(arr,0,ret));
        // }

        // // 养成好习惯，用完流之后，就关一下
        // stream.close();
        
        // 
    }
}