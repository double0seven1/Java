package Thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class timerTask extends TimerTask {
        @Override
        public void run() {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date nowTime = new Date();
            String currentTime = sdf.format(nowTime);
            System.out.println("开心 + 1,现在的时间是:" + currentTime);
        }
    }
