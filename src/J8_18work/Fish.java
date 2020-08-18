package src.J8_18work;

public class Fish extends Animal implements Pet {
    private String name = "鱼";
    @Override
    public void eat() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void SetName(String name) {

    }

    @Override
    public void play() {

    }
    public void Fish(){

    }
    @Override
    public void walk(){
        System.out.println("不能行走");
    }


}
