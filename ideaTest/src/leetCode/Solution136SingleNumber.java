package leetCode;

/**
 * Created by j2004 on 2016/1/6.
 */
import java.util.HashMap;
public class Solution136SingleNumber{
    public static void main(String args[]) {
        int[] nums={1,2,3,4,5,1,2,3,4};
        int i=singleNumber(nums);
        System.out.println(i);
    }
    public static int singleNumber(int[] nums) {
        //使用HashMap实现
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            //遍历nums数组并存入HashMap
            int counter;
            if(map.get(nums[i])==null){
                counter=0;
            }
            else {
                counter=map.get(nums[i]);
            }
            map.put(nums[i],++counter);
        }
        for (int i:map.keySet()) {
            //查找只出现1次的数
            if (map.get(i) == 1) {
                return i;
            }
        }
        return -1;
    }
}
