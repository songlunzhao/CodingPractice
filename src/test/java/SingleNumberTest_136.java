import java.util.Arrays;

public class SingleNumberTest_136 {

    public int singleNumber(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        Arrays.sort(nums);
        int count=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1])
                return nums[i];
        }
        return nums[nums.length-1];

    }
}
