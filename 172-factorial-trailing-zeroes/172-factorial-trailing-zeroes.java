class Solution {
    public int trailingZeroes(int n) {
        
        int countZeros=0;
        
        while(n>0)
        {
            countZeros += n/5;
            n/=5; 
        }

        return countZeros;
    }
}