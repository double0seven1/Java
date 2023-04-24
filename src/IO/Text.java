// -*- coding: utf-8 -*-
package IO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Properties;

import javax.swing.plaf.TreeUI;

public class Text {
    public static void main(String[] args) throws Exception {
        // FileInputStream fis = null;
        // try {
        //     fis = new FileInputStream("example.txt");

        //     // 改良版的while语句去读取文件的内容
        //     int ret = 0;
        //     while ((ret = fis.read()) != -1) {
        //         System.out.println(ret);
        //     }
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // } finally {
        //     if (fis != null) {
        //         try {
        //             fis.close();
        //         } catch (IOException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // }

        // 数组会帮你初始化为0.
        // byte arr[] = new byte[10];
        // for (byte b : arr) {
        //     System.out.println(b);
        // }// 0 0 0 0 0 0 0 0 0 0 0 

        // 往FileInputStream中的read方法，传入byte数组(一次最多从文件中读取byte.lenth个字节)
        // FileInputStream fis = null;
        // try {
        //     fis = new FileInputStream("example.txt");
        //     // 为什么要定义四个字节？CPU一次操作是四个字节
        //     byte arr[] = new byte[4];
        //     int ret = 0;
        //     while ((ret = fis.read(arr)) != -1) {
        //     // 不好意思，String中有一个构造方法可以让byte数组转成字符串.
        //         System.out.print(new String(arr,0,ret));
        //     }
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // } finally {
        //     if (fis != null) {
        //         try {
        //             fis.close();
        //         } catch (IOException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // }

        // 内存往硬盘中放东西write
        // FileOutputStream fos = null;
        // try {
        //     fos = new FileOutputStream("example.txt", true);
        //     String s = "我爱孔芷娴";
        //     byte arr[] = s.getBytes();
        //     fos.write(arr);
        //     fos.flush();

        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // } finally {
        //     try {
        //         fos.close();
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }
        // }

        // 我为什么建议你入文件的时候，使用write(arr,0,arr.lengh)?
        // 读到了多少的字节，就输入多少，不然就会多输出
        // FileOutputStream fos = null;
        // fos =

        // 玩一下文件复制的操作
        // FileInputStream fis = null;
        // FileOutputStream fos = null;
        // try {
        //     fos = new FileOutputStream("E:\\picture.jpg"); //输入流
        //     fis = new FileInputStream(
        //             "C:\\Users\\10934\\Desktop\\下载的壁纸\\Wallpaper\\6498-2022-11-23105817-1669172297241.jpg");//输入流
        //     // 定义byte数组，一次选择读取几个字节？
        //     byte arr[] = new byte[512 * 1024];
        //     int ret = 0;
        //     while ((ret = fis.read(arr)) != -1) {
        //         fos.write(arr,0,ret); //读到了多少，就写多少，如果不这样，就会直接读取整个1MB的数组
        //     }
        //     fos.flush();
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // } finally {
        //     // 为啥要分别关闭这两个流？
        //     // 如果有一个流出现了问题，就不能关闭他了！
        //     try {
        //         fis.close();
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }
        //     try {
        //         fos.close();
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }
        // }

        // 往文件中追加东西
        // FileOutputStream fos = null;
        // try {
        //     fos = new FileOutputStream("example.txt", true);
        //     String secret = "follow me , follow my heart";
        //     byte arr[] = secret.getBytes();
        //     fos.write(arr, 0, arr.length);
        //     fos.flush();
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // } finally {
        //     if (fos != null) {
        //         try {
        //             fos.close();
        //         } catch (IOException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // }

        // // 冲着BufferedReader中的readLine方法：
        // FileReader reader = new FileReader("example.txt");
        // // 起名：1.当一个流是参数的时候，就称这个流叫节点流
        // // 2.外部负责处理的这个流叫做包装流、处理流
        // BufferedReader buf = new BufferedReader(reader);
        // while (buf.ready()) {
        //     System.out.println(buf.readLine());
        // }
        // buf.close();//这里源代码自动帮你关闭节点流

        // ----------==========--------====---====--------========----=====-=====--
        // ---====--------=====---==[][][]]]]]]]]][[][]]--====---=
        // 玩一下转换流(InputSteamReader)
        // InputStream input = new InputStream("example.txt");
        // FileInputStream in = new FileInputStream("example.txt");
        // // BufferedReader buf = new BufferedReader(in);
        // InputStreamReader change = new InputStreamReader(in);
        // BufferedReader buf = new BufferedReader(change);
        // String s;
        // while ((s = buf.readLine()) != null) {
        //     System.out.println(s);
        // }
        // buf.close();

        // 合并代码
        // BufferedReader buf = new BufferedReader(new InputStreamReader(new FileInputStream("example.txt")));
        // while (buf.ready()) {
        //     System.out.println(buf.readLine());
        // }
        // buf.close();

        // 修改System.out.println的输出方向

        // 标准输出流的构造方法是传一个OutputStream(FileOutStream)

        // System.setOut(new PrintStream(new FileOutputStream("example.txt")));
        // System.out.println("今天今天星闪闪");
        // System.setOut()
        // System.out.println("大风吹");

        // 写一个简单的日志
        // Log.log("早知道伤心总是难免的");
        // Log.log("直接面对困难");

        // FileInputStream的read方法其实是把内存的东西放在自定义的数组上来托管！！
        // FileInputStream fis = null;
        // try {
        //     fis = new FileInputStream("example.txt");
        //     int ret = 0;
        //     byte arr[] = new byte[5];
        //     while ((ret = fis.read(arr)) != -1) {
        //         System.out.print(new String(arr,0,ret));
        //     }
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // } finally {
        //     try {
        //         fis.close();
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }
        // }

        // FileOutputStream fos = null;
        // FileInputStream fis = null;
        // try {
        //     // 读文件（放在byte数组里面）
        //     fis = new FileInputStream("Log.txt");
        //     byte arr[] = new byte[fis.available()];
        //     fis.read(arr);
        //     System.out.println(new String(arr, 0, arr.length));
        //     // 写文件 （byte数组里面的东西写去example中）
        //     fos = new FileOutputStream("example", true);
        //     fos.write(arr);

        //     fos.flush();
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // } finally {
        //     try {
        //         fos.close();
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }
        // }

        // BufferedReader
        // FileInputStream fis = new FileInputStream("Log.txt");
        // FileReader fr = new FileReader("Log.txt");
        // BufferedReader buf = new BufferedReader(fr);
        // while (buf.ready()) {
        //     System.out.println(buf.readLine());
        // }
        // System.out

        // FileOutputStream建议使用write(arr ,  ,) 
        // byte arr[] = {'a','b','c','d','e','f'};
        // FileOutputStream fos = new FileOutputStream("zhangguorong.txt",true);
        // fos.write(arr, 0, 4);
        // fos.write(arr, 0, 4);

        // Text.p(new int[]{1,2,3,4,5,6,7,8,9,10});

        // 把Log.txt的内容给复制到example中
        // FileInputStream fis = null;
        // FileOutputStream fos = null;
        // try {
        //     fis = new FileInputStream("Log.txt");
        //     fos = new FileOutputStream("example.txt",true);
        //     byte arr[] = new byte[4];
        //     int ret = 0;
        //     while ((ret = fis.read(arr)) != -1) {
        //         fos.write(arr, 0, ret);
        //     }
        //     fos.flush();
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // } finally {
        //     try {
        //         fis.close();
        //         fos.close();
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }
        // }

        // 使用一下日志(记得保存屏幕输出)
        // Log.log("今天开始学习'文件'");
        // System.out.println("我脑海里全都是你");

        // 用File这个类来创建文件
        // File f1 = new File("E:/a/b/c/d");
        // if (!f1.exists()) {
        //     f1.mkdirs();
        // }

        // 玩一下File中listFiles方法
        // File f = new File("E:\\JAVA PROJECT\\IO");
        // File arr[] = f.listFiles();
        // for (File file : arr) {
        //     System.out.println(file.getName());
        // }

        // 试着打印一个目录下，所有的文件的名字！是所有！
        // File target = new File("E:\\demo");
        // File data[] = target.listFiles();
        // for (File file : data) {

        //     System.out.println(file.getName());
        //     //   判断是否是目录? 获取目录的地址:继续走下去
        //     if (file.isDirectory()) {

        //         File under = new File(file.getAbsolutePath());
        //         File underArr[] = under.listFiles();
        //         for (File file2 : underArr) {
        //             System.out.println(file2.getName());
        //         }

        //     }
        // }

    
    
    
    
        // 文件拷贝（）
        // Copy copy = new Copy();
        // copy.myCopy("D:\\Only one", "E:");



        // // 玩一下把一个'类'序列化进文件中
        // Man m1 = new Man();
        // // new 一个序列化类，调用方法去序列化
        // ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("XuLie"));
        // oos.writeObject(m1);
        // oos.flush();
        // oos.close();


        // 反序列化(从文件中把'类'拿回来)
        // ObjectInputStream ois = new ObjectInputStream(new FileInputStream("XuLie"));
        // Man m = ((Man)ois.readObject());
        // System.out.println(m.toString());
        // ois.close();


        
        // IO与Properties的结合
        // 作用：直接从磁盘上读取数据。
        // 数据格式：key=value

        // new一个输入流对象
        FileInputStream fis = new FileInputStream("example.txt");
        // new一个Properties集合
        Properties p = new Properties();
        // 将磁盘中的数据放入集合对象里
        p.load(fis);
        // 通过key来获取value
        System.out.println(p.getProperty("user")); // name
    }
}