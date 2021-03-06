class Solution {
    public int firstMissingPositive(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        
        int li = nums[0];
        
        if(nums[n-1] < 1){
            return 1;
        }
        
        for(int i = 0; i<n; i++){
            if(nums[i] > 0){
                li = i;
                break;
            }
        }
        
        if(nums[li] > 1){
            return 1;
        }
        int ans = nums[n-1] + 1;
        for(int i = li; i<n-1; i++){
            if(nums[i+1] != nums[i] +1 && nums[i] != nums[i+1]){
                ans = nums[i] + 1;
                return ans; 
            }
        }
        return ans;
    }
}