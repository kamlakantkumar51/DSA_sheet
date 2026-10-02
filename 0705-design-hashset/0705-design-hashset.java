import java.util.*;
class MyHashSet {
    private static final int BUCKET_SIZE = 769;
    private LinkedList<Integer> buckets[];
    public MyHashSet() {
        buckets = new LinkedList[BUCKET_SIZE];
        for(int i=0;i<BUCKET_SIZE;i++){
            buckets[i] = new LinkedList<>();
        }
    }
    private int getHash(int key){
        return key % BUCKET_SIZE;
    }
    
    public void add(int key) {
        int index = getHash(key);
        LinkedList<Integer> bucket = buckets[index];
        if(!bucket.contains(key)){
            bucket.add(key);
        }
    }
    
    public void remove(int key) {
        int index = getHash(key);
        LinkedList<Integer> bucket = buckets[index];
        bucket.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        int index = getHash(key);
        LinkedList<Integer> bucket = buckets[index];
        return bucket.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */