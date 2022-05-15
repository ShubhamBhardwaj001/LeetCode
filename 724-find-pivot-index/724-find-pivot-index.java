class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        
        if(n==1){
            return 0;
        }
        
        // Prefix Sum Based Solution
        
        int[] ls=new int[n];
        int[] rs=new int[n];
        
        ls[0]=nums[0];
        
        for(int i=1;i<n;i++){
            
           ls[i]=ls[i-1]+nums[i];
            
        }
        
        rs[n-1]=nums[n-1];
        
        for(int i=n-2;i>=0;i--){
            
            rs[i]=rs[i+1]+nums[i];
            
        }
        
        // if any index i exists for which ls[i]==rs[i], that is the required index
        for(int i=0;i<n;i++){
            
            if(ls[i]==rs[i]){
                
                return i;
            }
            
        }
        
        return -1;
    }
}