class Solution {
   public boolean rotateString(String a, String b) {
        if(a.length()!=b.length()){
            return false;

        
    }
        String c=a+a;
        if(c.contains(b)) return true;
           return false;
}
}