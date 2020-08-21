package src.J8_21;

public class Test3 {
    public static void main(String[] args) {

    }
    public static String zifuchuan(int ii){
        char a[] = new char[ii];
        String c= "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int j = 0;j<ii;j++){
            a[j]= c.charAt((int) (Math.random()*62));
        }
        String s = String.valueOf(a);
        return s;
    }
    public static void paixu(){
        String s1[] = new String[8];
        for (int j = 0;j<5;j++){
            s1[j] = zifuchuan(5);
        }
        for(int j=1;j<8;j++)
            for(int i=0;i<8-j;i++)
            {
                char c1=s1[i].charAt(0);
                char c2=s1[i+1].charAt(0);
                c1=Character.toUpperCase(c1);
                c2=Character.toUpperCase(c2);
                if(c1>c2) {
                    String temp=s1[i];
                    s1[i]=s1[i+1];
                    s1[i+1]=temp;
                }
            }
        for(String each:s1) {
            System.out.print(each+"\t");

        }
    }
    public static void qwer(){
        String s=zifuchuan(3);
        char [] cc=new char[3];
        outloop:
        for(short i='0';i<'z';i++)
            for(short j='0';j<'z';j++)
                for(short k='0';k<'z';k++)
                {
                    cc[0]=(char) (i);
                    cc[1]=(char) (j);
                    cc[2]=(char) (k);

                    if(!(Character.isLetterOrDigit(i)&&Character.isLetterOrDigit(j)&&Character.isLetterOrDigit(k))) continue;
                    String ss=new String(cc);
                    System.out.println(ss);
                    if(ss.equals(s)) {

                        System.out.println("找到了密码，密码是"+ss);
                        break outloop;

                    }


                }


    }
}
