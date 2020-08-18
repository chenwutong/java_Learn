package src.J8_18;

public interface Mortal {
    public void die();
    default public void revive(){
        System.out.println("复活");
    }
}
