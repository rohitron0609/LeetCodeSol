package in.decx.train.Problems;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sol = nums[0] + nums[1] + nums[nums.length - 1];
        for(int i = 0; i < nums.length - 2; i++){
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                int cur = nums[i] + nums[left] + nums[right];

                if(Math.abs(target - cur) < Math.abs(target - sol)){
                    sol = cur;
                }

                if(cur == target) return cur;
                if(cur > target)
                    right--;
                else left++;
            }
        }
        return sol;
    }
}
