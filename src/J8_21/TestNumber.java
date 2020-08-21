package src.J8_21;

import java.util.Locale;

public class TestNumber {
    public static void main(String[] args) {
        int i =5;
        String str = String.valueOf(i);//通过String类的基本方法valueOf

        Integer it = i; //基本类型装箱为对象,
        String str2 = it.toString(); //调用toString()获取字符串
        double i2 =3.14;
        String str3 = String.valueOf(i2);
        i2 = Float.parseFloat(str3);
        int num = 1;
        for( int i5=0 ;i5<=100;i5++){
            boolean prime = isPrime(i5);
            if(prime){
                num+=1;
            }
        }
        //System.out.println(num);
        int year = 2020;
        //总长度，左对齐，补0，千位分隔符，小数点位数，本地化表达

        //直接打印数字
        System.out.format("%d%n",year);
        //总长度是8,默认右对齐
        System.out.format("%8d%n",year);
        //总长度是8,左对齐
        System.out.format("%-8d%n",year);
        //总长度是8,不够补0
        System.out.format("%08d%n",year);
        //千位分隔符
        System.out.format("%,8d%n",year*10000);

        //小数点位数
        System.out.format("%.2f%n",Math.PI);

        //不同国家的千位分隔符
        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.US,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.UK,"%,.2f%n",Math.PI*10000);

    }
    public static boolean isPrime(int a){
        boolean flag = true;
        if(a<2) {
            return false;
        }else {
            for (int i = 2; i<=Math.sqrt(a);i++){
                if(a%i==0){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
