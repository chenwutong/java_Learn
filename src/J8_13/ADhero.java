package src.J8_13;

import src.J8_13.AD;
import src.J8_13.Hero;

public class ADhero extends Hero implements AD {
    @Override
    public void physicAttack() {
        System.out.println("物理攻击");
    }
    public ADhero(String name){
        super(name);
        System.out.println("ad hero 构造方法");
    }
    public static void battleWin(){
        System.out.println("ad hero battle win");
    }

    public static void main(String[] args) {
        new ADhero("德莱文");
    }
}
