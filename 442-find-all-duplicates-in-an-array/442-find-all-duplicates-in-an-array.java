
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> twice = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for(int a: nums){
            if(twice.containsKey(a)){
                twice.put(a, twice.get(a) +1);
            }else{
                twice.put(a,1);
            }
        }
        for (Map.Entry<Integer, Integer> set : twice.entrySet()) {
            if(set.getValue() == 2)
                list.add(set.getKey());
		}
        return list;
    }
}