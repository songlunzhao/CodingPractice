import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class ThreeSumTest {

    @Test
    public void testThreeSum() {
        int[] sums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(sums);
        assertEquals(result.get(0),Arrays.asList(-1,-1,2));
        assertEquals(result.get(1),Arrays.asList(-1,0,1));

    }

    @Test
    public void testThreeSumCloset() {
        //Wrong Answer: input:[0,2,1,-3] 1 Output:-1 Expected:0 stdout:
        int[] nums = new int[]{0,2,1,-3};
        int ret = threeSumClosest(nums, 1);
        assertEquals(ret, 0);
        //Wrong Answer: input:[-1,0,1,1,55] 3 Output:0 Expected:2 stdout:
        nums=new int[]{-1,0,1,1,55};
        ret = threeSumClosest(nums, 3);
        assertEquals(ret, 2);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(nums);
        for(int i=0; i< nums.length-2; i++) {
            //skip duplicate number
            if(i==0 || (i>0 && nums[i] != nums[i-1]) ) {
                int left = i+1, right= nums.length-1;
                //2sum, target=0-nums[i]
                while(left<right) {
                    if(nums[left]+nums[right]+nums[i]==0){
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while(left<right && nums[left]==nums[left+1]) left++;
                        while(left<right && nums[right]==nums[right-1]) right--;
                        left++;
                        right--;
                    } else if (nums[left]+nums[right]<-nums[i]) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }

    public int threeSumClosest(int[] nums, int target) {
        int ret=0, diff=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            //skip duplicates
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                int left=i+1, right= nums.length-1;
                while(left<right){
                    int sum = nums[i]+nums[left]+nums[right];
                    if(sum==target){
                        return sum;
                    }
                    if(Math.abs(sum-target)<diff){
                        diff=Math.abs(sum-target);
                        ret = sum;
                    }
                    //advance left & right
                    if(sum>target) {
                        right--;
                    } else {
                        left++;
                    }
                }

            }

        }
        return ret;

    }
}
