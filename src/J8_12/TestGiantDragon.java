package src.J8_12;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TestGiantDragon {

    public static void main(String[] args) {
        //通过new实例化会报错
//      GiantDragon g = new GiantDragon();

        //只能通过getInstance得到对象

        GiantDragon g1 = GiantDragon.getInstance();
        GiantDragon g2 = GiantDragon.getInstance();
        GiantDragon g3 = GiantDragon.getInstance();

        //都是同一个对象
        System.out.println(g1==g2);
        System.out.println(g1==g3);
    }
}
class Testbobo{

    public static void main(String[] args) {
        bobo b1 = bobo.getInstance();
        bobo b2 = bobo.getInstance();
        bobo b3 = bobo.getInstance();

        System.out.println(b1 == b2);
        System.out.println(b2 == b3);
    }
}