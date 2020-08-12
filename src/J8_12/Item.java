package src.J8_12;

public class Item {
    String name;
    int price;
    public void buy(){
        System.out.println("物品购买");
    }
    public void effect(){
        System.out.println("物品效果");
    }
//
    public static void main(String[] args) {
        Item i = new Item();
        i.effect();
        Item lp = new LifePtion();
        lp.effect();
        Item mp = new MagicPotion();
        mp.effect();
    }
}
