class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length())
            return false;
        Integer a[]=new  Integer[256];
        for(int i=0;i<s.length();i++){
            if (a[s.charAt(i)]==null)
                a[s.charAt(i)]=(int)t.charAt(i);
            else if (a[s.charAt(i)]!=(int)t.charAt(i))
                return false;            
                
        }
         Integer a1[]=new  Integer[256];
        for(int i=0;i<t.length();i++){
            if (a1[t.charAt(i)]==null)
                a1[t.charAt(i)]=(int)s.charAt(i);
            else if (a1[t.charAt(i)]!=(int)s.charAt(i))
                return false;            
                
        }
        return true;
    }
}