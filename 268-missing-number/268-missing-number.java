class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum=0;
        int add=0;
        for(int i =0;i<n;i++){
             sum  = sum+nums[i]; 
        }
        add = (n*(n+1))/2;
        return add -sum;
    }
}