class Solution {
    public int[] shuffle(int[] nums, int n) {
      int odd=n;
        int eve=0;
        int[] res = new int[2*n];
        for(int i=0;i<2*n;i++){
            if(i%2==0){
            res[i] = nums[eve++];
                }
        else{
            res[i] = nums[odd++];
        }
    }
return res;
}
}   
