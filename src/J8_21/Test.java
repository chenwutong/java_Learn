package src.J8_21;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入地名");
        String diming = sc.next();
        System.out.println("请输入公司");
        String gongsi = sc.next();
        System.out.println("请输入老板");
        String laoban = sc.next();
        System.out.println("请输入金额");
        Double jiner = sc.nextDouble();
        System.out.println("请输入产品");
        String canpin = sc.next();
        System.out.println("请输入价格计量单位");
        String danwei = sc.next();
        String format=("%s最大%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%d个亿，带着他的小姨子跑了!我们没有办法，拿着%s抵工资!原价都是一百多、两百多、三百多的钱包，现在全部只卖二十块，统统只要二十块!黄鹤王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!");
        System.out.format(format,diming,gongsi,laoban,jiner,canpin,danwei);
    }
}
