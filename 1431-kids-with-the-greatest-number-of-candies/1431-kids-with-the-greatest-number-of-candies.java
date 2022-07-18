class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> arr = new ArrayList<Boolean>();
        int max = candies[0];
        for(int i=0;i<n;i++){
            max= Math.max(max, candies[i]);
        }
        for(int j=0;j<n;j++){
            if((candies[j] + extraCandies) >= max){
                arr.add(true);
                
            }else{
                arr.add(false);
            }
        }return arr;
    }
        }

    
