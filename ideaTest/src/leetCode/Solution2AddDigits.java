package leetCode;

/**
 * Created by lenovo on 2016/1/6.
 */
public class Solution2AddDigits {
    public static void main(String[] args) {
        int i =addDigits(1591);
        System.out.println(i);
    }

    public static int addDigits(int num) {
        int buf=0;
        do
        {
            //取最低位后进行想加
            buf=buf+num%10;
            num=num/10;
        }while(num!=0);
        if(buf>=10) {
            //若大于10则进行迭代
            return addDigits(buf);
        }
        return buf;
    }
}
