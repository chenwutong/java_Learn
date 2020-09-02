package src.J8_29;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
//        Date d1 = new Date();
//        System.out.println("当前时间:");
//        System.out.println(d1);
//        System.out.println();
//        // 从1970年1月1日 早上8点0分0秒 开始经历的毫秒数
//        Date d2 = new Date(5000);
//        System.out.println("从1970年1月1日 早上8点0分0秒 开始经历了5秒的时间");
//        System.out.println(d2);
        //Date now = new Date();
        //System.out.println("当前时间"+now.toString());
       // System.out.println(now.getTime());
        //Date zero = new Date(0);
        //System.out.println("用0作为构造方法，得到的日期是:"+zero);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        long start = 0;
        try {
            start = sdf.parse("1975").getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("qqqq1");
        long end = 0;
        try {
            end = sdf.parse("1976").getTime()-1;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("1975年开始时间为：" + toString(new Date(start),"yyyy-MM-dd HH:mm:ss"));
        System.out.println("1975年最后时间为：" + toString(new Date(end),"yyyy-MM-dd HH:mm:ss"));
        long randomTime = (long)(Math.random()*(end-start) + start);
        Date date = new Date(randomTime);
        System.out.println("生产的年内随机时间为：" + toString(date,"yyyy-MM-dd HH:mm:ss"));
    }
    public static String toString(Date d,String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(d);
    }


}
