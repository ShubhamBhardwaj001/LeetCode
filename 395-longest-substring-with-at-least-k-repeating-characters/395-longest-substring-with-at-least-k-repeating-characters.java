class Solution {
    public int longestSubstring(String s, int k) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        boolean flag = true;

        for (int j : freq) {
            if (j < k && j > 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            return s.length();
        }
        int result = 0, start = 0, cur = 0;
        
        while (cur < s.length()) {
            if (freq[s.charAt(cur) - 'a'] < k) {
                result = Math.max(result, longestSubstring(s.substring(start, cur), k));
                start = cur + 1;
            }
            cur++;
        }
        result = Math.max(result, longestSubstring(s.substring(start), k));
        return result;
    }
}