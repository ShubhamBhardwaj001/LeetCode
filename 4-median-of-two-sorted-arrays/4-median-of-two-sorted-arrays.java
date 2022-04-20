class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int i=0,j=0,z=0;
    int n=nums1.length,m=nums2.length;
    int a=n+m;
    int ans[]=new int[a];
    while(i<n && j<m){
        if(nums1[i]<nums2[j]){
        ans[z++]=nums1[i++];
}   else{
        ans[z++]=nums2[j++];
        }
    }
    while(i<n){
        ans[z++]=nums1[i++];
    }
    while(j<m){
        ans[z++]=nums2[j++];
}
    if(a%2!=0)
        return ans[(a/2)];
    else        
        return (ans[(a/2)-1]+ans[(a/2)])/2.0;
    }
}