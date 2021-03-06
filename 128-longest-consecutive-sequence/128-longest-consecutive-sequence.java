class Solution {
    public int longestConsecutive(int[] nums) {        
        Set<Integer> hash_set = new HashSet<Integer>();
        int currentStreak, maxStreak=0, currentNumber;  
        for(int i: nums)
            hash_set.add(i);
        for(int i: hash_set){            
            if(  !(hash_set.contains(i -1))  ){
                currentNumber = i;
                currentStreak = 1;
                while(hash_set.contains(currentNumber + 1)){
                    currentStreak++;
                    currentNumber += 1;
                }
                
                maxStreak = Math.max(currentStreak, maxStreak);

            }
        }
        
        
        return maxStreak;
    }
}