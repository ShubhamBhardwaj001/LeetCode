class Solution {
    public int firstUniqChar(String s) 
    {
        char ch[]=s.toCharArray();
       Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<ch.length;i++)
        {
            if(map.containsKey(ch[i]))
            {
                map.put(ch[i],map.get(ch[i])+1);
            }
            else
            {
                map.put(ch[i],1);
            }
        }
        for(int i=0;i<ch.length;i++)
        {
            if(map.get(ch[i])==1)
            {
                return i;
            }
        }
        return -1;
    }
}