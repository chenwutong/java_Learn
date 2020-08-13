package src.J8_13;

import src.J8_12.LifePtion;
import src.J8_12.MagicPotion;

public class Item {
    String name;
    int price;
    public void buy(){
        System.out.println("物品购买");
    }
    public void effect(){
        System.out.println("物品效果");
    }
    public String toString(){
        return name.toString();

    }

    public void finalize(){
        System.out.println("开始回收");
    }
    public boolean equals(Object o ){
        if (o instanceof Hero){
            Item h = (Item) o;
            return this.price== h.price;
        }
        return false;
    }

    public static void main(String[] args) {
        Item i = new Item();
        i.effect();
        Item lp = new LifePtion();
        lp.effect();
        Item mp = new MagicPotion();
        mp.effect();
    }
}
