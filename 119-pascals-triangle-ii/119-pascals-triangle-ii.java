class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
       for(int i=0;i<=rowIndex;i++){
           List<Integer> curr = new ArrayList<>();
           for(int j=0;j<=i;j++){
           if(j ==0 || j ==i ){
               curr.add(1);
           }
           else {
               curr.add(ans.get(i-1).get(j-1)+ ans.get(i-1).get(j));
           }
           }ans.add(curr);
           
           }
        
    return ans.get(rowIndex);
    }
}
