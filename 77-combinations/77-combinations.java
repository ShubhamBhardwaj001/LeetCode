class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtrack(new ArrayList<>(),1,n,k);
        return ans;
    }
    public void backtrack(List<Integer> curr,int start, int n,int k){
        if(curr.size()==k){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start;i<=n;i++){
            curr.add(i);
            backtrack(curr,i+1,n,k);
            curr.remove(curr.size()-1);
        }
    }
}