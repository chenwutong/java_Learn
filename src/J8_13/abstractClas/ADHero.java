package src.J8_13.abstractClas;

public class ADHero extends Hero implements AD {

    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    @Override
    public void attack() {
        physicAttack();
    }

}