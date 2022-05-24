class Solution {
    public boolean isSubsequence(final String s, final String t) {
        int sIndex = 0;
        for (int i=0; i<t.length() && sIndex < s.length(); i++) {
            if (s.charAt(sIndex) == t.charAt(i)) {
                sIndex++;
            }
        }
        return sIndex == s.length();
    }
}