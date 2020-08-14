package src.J8_14;

import src.J8_14.Item;

public class LifePtion extends Item {
    public void effect(){
        System.out.println("血瓶使用");
    }

    @Override
    public boolean disposable() {
        return true;
    }
}


class MagicPotion extends Item {
    public void effect(){
        System.out.println("回蓝");
    }
    @Override
    public boolean disposable() {
        return false;
    }
}
