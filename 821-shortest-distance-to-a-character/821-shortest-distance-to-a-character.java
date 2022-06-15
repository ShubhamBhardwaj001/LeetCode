class Solution {
    public int[] shortestToChar(String s, char c) {
        // arraylist to store indices of c
        List<Integer> arrlist = new ArrayList<>();
        // array to store result
        int[] result = new int[s.length()];
        
        // store all indices where c is present
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == c)
            {
                arrlist.add(i);
            }
        }
        
        // start traversing s and calculate distance of each character from closest c
        for(int i=0;i<s.length();i++)
        {
            char tempc = s.charAt(i);
            if(tempc == c)
            {
                result[i] = 0;
            }
            else
            {
                int minDistance = Integer.MAX_VALUE;
                for(int j=0;j<arrlist.size();j++)
                {
                    int x = arrlist.get(j);
                    if(i>x)
                    {
                        if(i-x < minDistance) minDistance = i-x;
                    }
                    else
                    {
                        if(x-i < minDistance) minDistance = x-i;
                    }
                }
                result[i] = minDistance;
            }   
        }
        return result;
    }
}