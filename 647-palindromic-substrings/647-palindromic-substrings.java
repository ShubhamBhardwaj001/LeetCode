class Solution {
    public int countSubstrings(String s) {
        int res=0;
        if(s.length()==1)
            return 1;
        for (int i = 0; i < s.length() ; i++) {
         res+=checkInputStr(s,i,i);
         res+=checkInputStr(s,i,i+1);
        }
        return res;
    }
    public int checkInputStr(String str, int left, int right){
        int count = 0;
        while(left>=0 && right <str.length() && str.charAt(left)==str.charAt(right)){
            left--;
            right++;
            count++;
        }
        return count;
    
    }
}