class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while(l <= r){
            int mid = (l+r)/2;            
            if(nums[mid] == target){
                if(nums[l] == target && nums[r] == target){
                    return new int[]{l,r};
                }
                if(nums[l] < target){
                    l++;
                }
                if(nums[r] > target){
                    r--;
                }
            } else if(target < nums[mid]){
                r = mid-1;
            } else {
                l = mid+1;
            }
        }
        return new int[]{-1,-1};   
    }
}
// this q can also be done by hash map//