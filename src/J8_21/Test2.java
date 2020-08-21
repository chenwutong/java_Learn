package src.J8_21;

public class Test2 {
    public static void main(String[] args) {
        String name = "gailun";
        int kill = 8;
        String title = "cahoshen";

        String setence = name+" 在进行了连续 " + kill + " 次击杀后，获得了 " + title +" 的称号";
        System.out.println(setence);
        String sentenceFormat = "%s 在连续 %d 次击杀后,获得了 %s 的称号";
        String sentence2 = String.format(sentenceFormat,name,kill,title);
        System.out.println(sentence2);
    }
}
