import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MaxProductTest {

    @Test
    public void testMaxProduct(){
       // Wrong Answer: input:[-2,3,-4] Output:3 Expected:24 stdout:
        //Wrong Answer: input:[-1,-2,-9,-6] Output:54 Expected:108 stdout:
        int[]nums = new int[]{-2,3,-4};
        int ret = maxProduct(nums);
        assertEquals(ret,24);

        nums=new int[]{-1,-2,-9,-6};
        ret=maxProduct(nums);
        assertEquals(ret,108);

    }
    public int maxProduct(int[] nums) {
        if(nums.length==1) return nums[0];
        int globalMax=nums[0], currentMax=nums[0], currentMin=nums[0];

        for(int i=1;i< nums.length; i++){
            int tmpMax=currentMax;
            currentMax=Math.max(Math.max(nums[i], currentMax*nums[i]), currentMin*nums[i]);
            currentMin=Math.min(Math.min(nums[i], tmpMax*nums[i]), currentMin*nums[i]);
            globalMax=Math.max(globalMax,currentMax);
        }
        return globalMax;
    }

}
