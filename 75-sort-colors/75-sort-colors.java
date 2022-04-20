class Solution {
    public void sortColors(int[] nums) {
        boolean isSwapped;
        for(int i=0;i<nums.length;i++){
            isSwapped = false;
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    isSwapped = true;
                }
            }if(isSwapped == false){
                break;
            }
        }
    }
}