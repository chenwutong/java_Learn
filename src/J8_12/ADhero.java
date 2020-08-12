package src.J8_12;

public class ADhero extends Hero implements AD{
    @Override
    public void physicAttack() {
        System.out.println("物理攻击");
    }
}
