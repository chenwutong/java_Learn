package src.J8_18;

public class ADAPHero implements ad,AP{
    @Override
    public void attack() {
        AP.super.attack();
    }

    public static void main(String[] args) {
        ADAPHero h = new ADAPHero();
        h.attack();

    }
}
