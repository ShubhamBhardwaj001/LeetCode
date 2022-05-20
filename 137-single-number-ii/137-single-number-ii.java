class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int e:nums){
            if(hm.containsKey(e)){
                hm.put(e,hm.get(e)+1);
            }else {
                hm.put(e,1);
            }
        }
        for (Map.Entry<Integer,Integer> m:hm.entrySet()){
            if(m.getValue()==1){
              return m.getKey();
            }
        }
            return -1;
    }
}