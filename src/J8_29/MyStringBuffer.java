package src.J8_29;

public class MyStringBuffer implements IStringBuffer{
    int capacity = 16;
    int length = 0;
    char[] value;
    public MyStringBuffer(){
        value = new char[capacity];
    }
    public MyStringBuffer(String str){
        if(null!=str){
            value = str.toCharArray();
        }
        length = value.length;
        if(capacity< value.length){
            capacity= value.length;
        }
    }
    @Override
    public void append(String str) {
        insert(length,str);
    }

    @Override
    public void append(char c) {
        insert(length,c);
    }

    @Override
    public void insert(int pos, char b) {
        insert(pos,String.valueOf(b));

    }

    @Override
    public void insert(int pos, String b) {
        //边界条件判断
        if(pos<0)
            return;

        if(pos>length)
            return;

        if(null==b)
            return;

        //扩容
        while(length+b.length()>capacity){
            capacity = (int) ((length+b.length())*1.5f);
            char[] newValue = new char[capacity];
            System.arraycopy(value, 0, newValue, 0, length);
            value = newValue;
        }

        char[] cs = b.toCharArray();

        //先把已经存在的数据往后移

        System.arraycopy(value, pos, value,pos+ cs.length, length-pos);
        //把要插入的数据插入到指定位置
        System.arraycopy(cs, 0, value, pos, cs.length);

        length = length+cs.length;
    }

    @Override
    public void delete(int start) {

    }

    @Override
    public void delete(int start, int end) {

    }

    @Override
    public void reverse() {
        for (int i = 0;i<length/2;i++){
            char temp = value[i];
            value[i]= value[length -i-1];
            value[length - i-1] = temp;
        }
    }

    @Override
    public int length() {
        return 0;
    }
}
