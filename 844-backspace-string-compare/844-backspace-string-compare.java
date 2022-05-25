class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb=new StringBuilder(s);
        StringBuilder tb=new StringBuilder(t);
        while (true){
            int i=sb.indexOf("#");
            if(i<0)
                break;
            sb.deleteCharAt(i);
            if(i>=1)
                sb.deleteCharAt(i-1);
        }
        while (true){
            int i=tb.indexOf("#");
            if(i<0)
                break;
            tb.deleteCharAt(i);
            if(i>=1)
                tb.deleteCharAt(i-1);
        }
        return tb.toString().equals(sb.toString());
    }
}