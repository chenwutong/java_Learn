package src.J8_21;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        char[] cs = str1.toCharArray();
        String asd = "";
        for(int i=0;i<str1.length();i++){
            if(capitalize(cs[i])){

                asd +=cs[i];
            }

        }
        System.out.println(asd);
    }
    public static boolean capitalize(char i) {
        char d[] =new char[9];
        int q = 0;
        if(Character.isUpperCase(i)||Character.isDigit(i)){
            return true;
        }
        return false;
    }
}
