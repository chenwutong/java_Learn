package src.J8_13;

public class Hero extends Object{
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public void useItem(Item i){
        System.out.println("use item");
    }
    public String toString(){
        return name;
    }
    public Hero(){
        System.out.println("Hero 构造方法");
    }
    public Hero(String name){
        System.out.println("Hero 带一个参数构造方法");
        this.name = name;
    }
    public void finalize(){
        System.out.println("开始回收");
    }

    public static void main(String[] args) {
        Hero h;
        for (int i = 0; i < 100000; i++) {
            //不断生成新的对象
            //每创建一个对象，前一个对象，就没有引用指向了
            //那些对象，就满足垃圾回收的条件
            //当，垃圾堆积的比较多的时候，就会触发垃圾回收
            //一旦这个对象被回收，它的finalize()方法就会被调用
            h = new Hero();
        }

//        new Hero();
//        Hero h1 = new Hero();
//        h1.name = "盖伦";
//        System.out.println(h1.toString());
    }
    //类方法，静态方法
    //通过类就可以直接调用
    public static void battleWin(){
        System.out.println("hero battle win");
    }
}
