class MyHashSet {
    HashMap<Integer, Integer> m;  
    public MyHashSet() {
        this.m = new HashMap<Integer ,Integer>();        
    }
    public void add(int key) {
        this.m.put(key,0);        
    }
    public void remove(int key) {
        if(this.m.containsKey(key))  this.m.remove(key);        
    }
    public boolean contains(int key) {
        if(this.m.containsKey(key)) return true;
        return false;        
    }
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */