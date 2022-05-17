class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> llall = new LinkedList<>();
        // two pointer approach
        for (int i = 0; i < nums.length; i++) {
            if (i==0 || (i>0 && nums[i] != nums[i-1])) {
                int lo = i+1 ;
                int hi = nums.length-1 ;
                int sum = 0 - nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        List<Integer> lls = new LinkedList<>();
                        lls.add(nums[i]);
                        lls.add(nums[lo]);
                        lls.add(nums[hi]);
                        llall.add(lls);

                        // code for leave same element ;
                        while (lo<hi && nums[lo]== nums[lo+1]) { lo++ ;}
                        while (lo<hi && nums[hi]== nums[hi-1]) { hi-- ;}
                        lo++;
                        hi--;
                    }
                    else if(sum > nums[lo]+nums[hi]){
                        lo++;
                    }
                    else {
                        hi--;
                    }
                }
            }
        }

        return llall;
    }
}

