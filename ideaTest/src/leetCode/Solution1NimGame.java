package leetCode;

/**
 * Created by j2004 on 2016/1/6.
 */
public class Solution1NimGame {

    public static void main(String[] args) {
        boolean flag =canWinNim(10);
        System.out.println(flag);
    }
    public static boolean canWinNim(int n) {
        //是否能整除4
        if(n%4==0)
            return false;
        else return true;
    }
}
