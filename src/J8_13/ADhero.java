package src.J8_13;

import src.J8_12.LifePtion;
import src.J8_13.AD;
import src.J8_13.Hero;

public class ADhero extends Hero implements AD {
    int moveSpeed =400;

    @Override
    public void physicAttack() {
        System.out.println("物理攻击");
    }
    public int getMoveSpeed(){
        return this.moveSpeed;
    }
    public int getMoveSpeed1(){
        return super.moveSpeed;
    }
    public ADhero(){
        System.out.println();
    }
    public ADhero(String name){
        this.name= name;
    }
    public void useItem(Item i){
        System.out.println("adhero use item");
        super.useItem(i);
    }
    public static void battleWin(){
        System.out.println("ad hero battle win");
    }

    public static void main(String[] args) {
        ADhero h = new ADhero();
        LifePtion lp = new LifePtion();
//        System.out.println(h.getMoveSpeed());
//        System.out.println(h.getMoveSpeed1());
    }
}
