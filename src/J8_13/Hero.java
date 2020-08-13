package src.J8_13;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public void useItem(Item i){
        System.out.println("use item");
    }
    public Hero(){
        System.out.println("Hero 构造方法");
    }
    public Hero(String name){
        System.out.println("Hero 带一个参数构造方法");
        this.name = name;
    }
    public static void main(String[] args) {
        new Hero();
    }
    //类方法，静态方法
    //通过类就可以直接调用
    public static void battleWin(){
        System.out.println("hero battle win");
    }
}
