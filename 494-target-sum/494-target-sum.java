class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return ways(nums, target, 0, 0);
    }
    
     int ways(int[] nums, int target, int idx, int sum) {
        if(idx == nums.length) {
            if( target == sum ) {
               return 1;
            }
            return 0;
        }
        return ways(nums, target, idx + 1, sum + nums[idx]) +
                ways(nums, target, idx + 1, sum - nums[idx]);
    }
}
