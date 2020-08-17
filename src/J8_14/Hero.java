package src.J8_14;

public class Hero {
    public String name;
    float hp;
    float armor;
    int moveSpeed;
    private static void battleWin(){
        System.out.println("win");
    }
    static class EnemyCrystal{
        int hp = 5000;
        public void checkIfVictory(){
            if(hp==0){
                Hero.battleWin();
                //System.out.println(name+"win");
            }
        }
    }

    class BattleScore{
        int kill;
        int die;
        int assit;
        public void legendary(){
            if(kill>=8){
                System.out.println(name+"超神");
            }
        }
    }
    public static void main(String[] args) {
        //虽然没有抽象方法，但是一旦被声明为了抽象类，就不能够直接被实例化
        Hero h= new Hero();
        h.name = "asdf";
        BattleScore score =  h.new BattleScore();
        score.kill = 9;
        score.legendary();
    }
}
