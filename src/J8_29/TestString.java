package src.J8_29;

//import com.sun.org.apache.xpath.internal.operations.String;

public class TestString {
    public static void main(String[] args) {
        String str1 = "";
        StringBuffer str2 = new StringBuffer();
        long t1 = System.currentTimeMillis();
        for(int i =0;i<10000;i++){
            str1=str1+random10();

        }
        long t2 =System.currentTimeMillis();
        long t = t2-t1;
        System.out.printf("使用+,耗时:%s毫秒",t);
        for(int i =0; i<10000;i++){
            str2.append(random10());
        }
        long t3 =System.currentTimeMillis();
        long t4= t3-t2;
        System.out.printf("使用+,耗时:%s毫秒",t4);


//        sb.append("be light");
//        System.out.println(sb);
//        sb.delete(4,10);//删除4~10的字符
//        System.out.println(sb);
//        sb.insert(4,"there");
//        sb.reverse();//反转
//        System.out.println(sb);
//        String str1 = "the";
//
//        StringBuffer sb = new StringBuffer(str1);
//
//        System.out.println(sb.length()); //内容长度
//
//        System.out.println(sb.capacity());//总空间

    }
    public static String random10(){
        char[] ch = new char[10];
        for(int i =0; i<ch.length;){
            char ch2 =(char)(Math.random()*75+48);
            if(Character.isDigit(ch2)||Character.isLetter(ch2)){
                ch[i] =ch2;
                i++;
            }
        }
        String str= String.valueOf(ch);
        //System.out.println(str);
        return str;
    }
}
