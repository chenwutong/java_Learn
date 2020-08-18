package src.J8_18work;

public abstract class Animal {
    protected int legs;

    protected void Animal(int legs){
        this.legs = legs;
        System.out.println(legs);
    }
    public void walk(){
        if (legs== 4){
            System.out.println("爬行");
        }else if(legs ==2){
            System.out.println("步行");
        }else if(legs == 0){
            System.out.println("不能行走");
        }

    }
    public abstract void eat();


    public static void main(String[] args) {

    }
}
