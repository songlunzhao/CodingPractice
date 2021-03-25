import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RemoveDuplicateTest {

    @Test
    public void testRemoveDuplicates() {
        int[] nums = new int[]{1,1,2};
        int ret = removeDuplicates(nums);
        assertEquals(ret,2);
    }

    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        if(nums.length==1) return 1;
        int prev= nums[0], prevIndex=0;
        int ret=1;
        for(int i=1; i< nums.length; i++){
            if(nums[i]!=prev){
                ret++;
                prev=nums[i];
                nums[prevIndex+1]=nums[i];
                prevIndex++;
            }
        }
        return ret;
    }
}
