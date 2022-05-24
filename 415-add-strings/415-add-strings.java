class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        int sum = 0;
        while(i>=0||j>=0||carry>0){
            sum = carry;
            if(i>=0){
                sum = sum+num1.charAt(i)-'0';
            }
            
            if(j>=0){
                sum = sum+num2.charAt(j)-'0';
            }
            
            sb = sb.append(sum%10);
            carry = sum/10;
            i--;
            j--;
        }
        
        return sb.reverse().toString();
        
    }
}