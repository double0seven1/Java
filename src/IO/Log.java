package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
    // 定义一个方法，输入到Log文件中
    public static void log(String message) {
        // 保存默认输出
        PrintStream consoleout = System.out;

        // 获取当前的系统时间
        Date nowtime = new Date();

        // 格式化成中国人爱看的时间
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh / mm / ss");
        String now = format.format(nowtime);
        
        // (修改默认的输出流)把输出到屏幕改成输出到文件中
        try {
            System.setOut(new PrintStream(new FileOutputStream("Log.txt", true)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // 这个System.out.println的终点可不是屏幕哦！是文件。
        System.out.println(now + ":" + message);

        // 其实我可以手动改回来！（改回去输入到屏幕）
        System.setOut(consoleout);
    }
}
