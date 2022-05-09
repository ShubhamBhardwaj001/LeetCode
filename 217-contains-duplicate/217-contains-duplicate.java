class Solution {
   
         public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                flag = true;
                //hm.put(nums[i],hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],1);
            }
        }
        return flag;
    }
    
}
