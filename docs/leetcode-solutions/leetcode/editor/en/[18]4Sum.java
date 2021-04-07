//Given an array nums of n integers and an integer target, are there elements a,
// b, c, and d in nums such that a + b + c + d = target? Find all unique quadruple
//ts in the array which gives the sum of target. 
//
// Notice that the solution set must not contain duplicate quadruplets. 
//
// 
// Example 1: 
// Input: nums = [1,0,-1,0,-2,2], target = 0
//Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
// Example 2: 
// Input: nums = [], target = 0
//Output: []
// 
// 
// Constraints: 
//
// 
// 0 <= nums.length <= 200 
// -109 <= nums[i] <= 109 
// -109 <= target <= 109 
// 
// Related Topics Array Hash Table Two Pointers 
// 👍 3151 👎 406


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result =kSum(nums, target, 0, 4);

        return result;
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
                    List<Integer> a = new ArrayList<>();
                    a.add(nums[i]);
                    a.addAll(set);
//                    res.add(new ArrayList<>(Arrays.asList(nums[i])));
//                    res.get(res.size() - 1).addAll(set);
                    res.add(a);
                }
        return res;
    }

    private void addToResult(int num0, int num1, int num2, int num3, List<List<Integer>> result) {
        List<Integer> l = Arrays.asList(num0, num1, num2, num3);
        result.add(l);
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
//leetcode submit region end(Prohibit modification and deletion)
