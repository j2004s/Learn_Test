package leetCode;

/**
 * Created by lenovo on 2016/1/6.
 */
public class Solution1NimGameS {
    public static void main(String[] args) {
        boolean flag =canWinNim(10);
        System.out.println(flag);
    }
    public static boolean canWinNim(int n) {
        //屏蔽后两位
        return n>>2<<2!=n;
    }
}
