import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class FourSumTest_18 {

    @Test
    public void testFourSum() {
        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        List<List<Integer>> result = fourSum(nums, 0);
        assertEquals(result.size(), 3);

    }

    @Test
    public void testTwoSum(){
        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        Arrays.sort(nums);
        List<List<Integer>> result = twoSum(nums, 0,0);
        assertEquals(result.size(), 3);
    }

    @Test
    public void testThreeSum(){
        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        Arrays.sort(nums);
        List<List<Integer>> result = threeSum(nums, 0,0);
        assertEquals(result.size(), 2);
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int left=0;
        while(left<nums.length-3){
            List<List<Integer>> threeSumResult = threeSum(nums, left+1, target-nums[left]);
            if(!threeSumResult.isEmpty()){
                for(List<Integer> l: threeSumResult){
                    List<Integer> r = new ArrayList<>();
                    r.add(nums[left]);
                    r.addAll(l);
                    result.add(r);
                }
            }
            left++;
            while (left < nums.length-3 && nums[left] == nums[left - 1]) left++;
        }
        return result;

    }

    private void addToResult(int num0, int num1, int num2, int num3, List<List<Integer>> result) {
        List<Integer> l = Arrays.asList(num0, num1, num2, num3);
        result.add(l);
    }

    public List<List<Integer>> kSum(int[] nums, int target, int start, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (start == nums.length || nums[start] * k > target || target > nums[nums.length - 1] * k)
            return res;
        if (k == 2)
            return twoSum(nums, start, target);
        for (int i = start; i < nums.length; ++i)
            if (i == start || nums[i - 1] != nums[i])
                for (List<Integer> set : kSum(nums, target - nums[i], i + 1, k - 1)) {
                    res.add(new ArrayList<>(Arrays.asList(nums[i])));
                    res.get(res.size() - 1).addAll(set);
                }
        return res;
    }

    public List<List<Integer>> threeSum(int[] nums, int start, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int left=start;
        while(left<nums.length-2){
            List<List<Integer>> twoSumResult = twoSum(nums, left+1, target-nums[left]);
            if(!twoSumResult.isEmpty()){
                for(List<Integer> l: twoSumResult){
                    List<Integer> r = new ArrayList<>();
                    r.add(nums[left]);
                    r.addAll(l);
                    result.add(r);
                }
            }
            left++;
            while (left < nums.length-2 && nums[left] == nums[left - 1]) left++;
        }
        return result;
    }

    public List<List<Integer>> twoSum(int[] nums, int start, int target) {
        List<List<Integer>> result = new ArrayList<>();

        int left = start, right=nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                List<Integer> r = new ArrayList<>();
                r.add(nums[left]);
                r.add(nums[right]);
                result.add(r);
                left++;
                right--;
                while (left < right && nums[left] == nums[left - 1]) left++;
                while (left < right && nums[right] == nums[right + 1]) right--;
            } else if(sum<target){
                left++;
                while (left < right && nums[left] == nums[left - 1]) left++;
            } else if(sum>target){
                right--;
                while (left < right && nums[right] == nums[right + 1]) right--;
            }


        }

        return result;
    }
}
