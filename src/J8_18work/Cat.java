package src.J8_18work;

public class Cat extends Animal implements Pet{
    String name;
    @Override
    public void eat() {

    }
    public void Cat(){
        this.Cat("猫");
    }
    public void Cat(String name){
        this.name = name;
        Animal(4);
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void SetName(String name){
        this.name = name;
    }
    @Override
    public void play(){

    }

}
