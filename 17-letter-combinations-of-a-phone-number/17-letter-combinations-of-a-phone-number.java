class Solution {
    //codes for key pressed.
    static String[] codes = {
        "",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };
    
    public List<String> letterCombinations(String digits) {
        //If length of digits array is 0, then return empty list.
        if (digits.length() == 0) {
            return new ArrayList<>();
        }
        
        return letterCombinationsHelper(digits);
    }
    
    public List<String> letterCombinationsHelper(String digits) {
        //Base Case : When length of digits array becomes 0, then add empty String in the list and return it.
        if (digits.length() == 0) {
            List<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        //Taking out first character from the given String.
        char ch = digits.charAt(0);
        
        //Rest of the String from index 1 till end.
        String ros = digits.substring(1);
        
        //Faith : Call the function again and pass rest of the String(ros).
        List<String> rres = letterCombinationsHelper(ros);
        
        //Answer ArrayList.
        List<String> mans = new ArrayList<>();
        
        //Find the code for respective number.
        String code = codes[ch - '0'];
        
        //Outer loop will give every char from the String which we get from the particular key pressed(ch).
        for (int i = 0; i < code.length(); i++) {
            char chcode = code.charAt(i);
            //Inner loop will add the particular char to the rres ArrayList.
            for (String str : rres) {
                mans.add(chcode + str);
            }
        }
        
        return mans;
    }
}