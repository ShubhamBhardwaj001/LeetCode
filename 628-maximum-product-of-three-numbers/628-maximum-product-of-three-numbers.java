class Solution {
   public int maximumProduct(int[] arr) {
    
    int n = arr.length;
    Arrays.sort(arr);
    
    int min = arr[n-1] * arr[n-2] * arr[n-3] ;
     int max = arr[0] * arr[1] * arr[n-1] ;
    
    return Math.max(min, max);
}
}