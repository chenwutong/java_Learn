package src.J8_12;

public class GiantDragon {

    //私有化构造方法使得该类无法在外部通过new 进行实例化
    private GiantDragon(){

    }

    //准备一个类属性，指向一个实例化对象。 因为是类属性，所以只有一个

    private static GiantDragon instance = new GiantDragon();

    //public static 方法，提供给调用者获取12行定义的对象
    public static GiantDragon getInstance(){
        return instance;
    }

}
class bobo{
    private bobo(){

    }
    private static bobo instance ;
    public static bobo getInstance(){
        if (null == instance){
            bobo.instance = new bobo();
        }
        return instance;
    }
}
enum typesOf{
    TANK, //(坦克)
    WIZARD, //(法师 )
    ASSASSIN, //(刺客)
    ASSIST, //(辅助)
    WARRIOR, //(近战)
    RANGED, //(远程 )
    PUSH, //(推进)
    FARMING, //(打野)

}
class types{
    public static void main(String[] args) {
        typesOf types = typesOf.ASSASSIN;
        switch(types){
            case ASSASSIN:
                System.out.println("刺客");
        }

    }
}
enum type{
    a,v,b,n,
}
class tpyes{
    public static void main(String[] args) {
        type ty = type.v;
        switch (ty){
            case a:
                System.out.println("asdf");
        }
    }
}