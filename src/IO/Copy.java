package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

    // 目录拷贝（把E盘下的demo拷贝到D盘底下）
    // 输入两个地址，左边是src，右边是des，把src的东西copy到des下。
    // 递归结束的条件：检测到当前目录下没有文件夹
    public void myCopy(String src, String des) {

        // 创建指针对象指向源头文件
        File Src = new File(src);

        // 最简单的情况：要拷贝的东西不是目录,直接就是一个文件
        if (Src.isFile()) {
            // 在目的地的地址下先创建文件
            File file = new File(des + "\\" + Src.getName());
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            // 然后再读取
            this.writeAndRead(src, file.getAbsolutePath());
            return;
        }

        // 先在des中创建一个目录（什么也没有）,记得指针指向!（名字与src一样） 
        File srcDirectory = new File(des + "\\" + Src.getName());
        srcDirectory.mkdir();

        // 用数组存储源头文件下的所有文件（文件可能是目录或是具体文件）
        File arr[] = Src.listFiles();

        // 先找出所有的文件
        for (File file : arr) {
            if (file.isFile()) {
            // 在目的地的目录下创建文件
            File New = new File(srcDirectory.getAbsolutePath() + "\\" + file.getName());
            try {
                New.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

            // 创建完之后，从源文件中读取内容到目标文件
            this.writeAndRead(file.getAbsolutePath(), New.getAbsolutePath());
            }
        }

        // 再考虑目录的问题
        for (File file : arr) {
            if (file.isDirectory()) {

                this.myCopy(file.getAbsolutePath(), srcDirectory.getAbsolutePath());
            }
        }
    }

    // 读取文件的方法(传两个实体文件的地址)：
    public void writeAndRead(String src, String des) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(des);
            // 四个字节地读
            byte arr[] = new byte[4];
            int ret = 0;
            while ((ret = fis.read(arr)) != -1) {
                fos.write(arr, 0, ret);
            }
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fis != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
