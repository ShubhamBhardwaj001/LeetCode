class Solution {

public void wiggleSort(int[] nums) {
    //sort the array
    Arrays.sort(nums);
    //create a new array and fill according to the equality from end to first
    int[] ans = new int[nums.length];
    int i = 1;
    int j = nums.length-1;
    while(i<nums.length){
        ans[i] = nums[j];
        i += 2;
        j--;
    }
    //greater condition satisfied now we'll fill smaller elements at all the even index
    i = 0;
    while(i<nums.length){
        ans[i] = nums[j];
        i+=2;
        j--;
    }
    
    for(int k = 0; k<nums.length; k++){
        nums[k] = ans[k];
    }       
    
}
}