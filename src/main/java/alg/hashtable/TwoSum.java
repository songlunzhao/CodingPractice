package alg.hashtable;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    @Test
    public void testTowSum() {
        int[] input = new int[]{2,7,3,6,9};
        int target = 9;

        int[] ret = twoSum(input,9);
        System.out.println(ret);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> nummap=new HashMap<>();
        int[] ret = new int[2];
        for(int i=0; i<nums.length; i++){
            int value = target- nums[i];
            if(nummap.containsKey(value)){
                ret[0]=nummap.get(value);
                ret[1]=i;
                return ret;
            } else {
                nummap.put(target- nums[i],i);
            }
        }
        return ret;
    }
}
