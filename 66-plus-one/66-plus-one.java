class Solution {
   public int[] plusOne(int[] digits) {
    int n = digits.length - 1;
    int i = n;
    if (digits.length == 1 && digits[0] == 0) {
        digits[0]=1;
        return digits;
    }
    for (i = n; i >= 0; i--) {
        if (digits[i] == 9) {
            digits[i] = 0;
        } else {
            digits[i] = digits[i] + 1;
            return digits;
        }
    }
    int[] ans = new int[digits.length+1];
    if (i == -1 && digits[0] == 0) {
        ans[0] = 1;
    }
    return ans;
}
}
