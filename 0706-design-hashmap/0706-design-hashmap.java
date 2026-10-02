import java.util.*;
class MyHashMap {
    int maparray[];
    public MyHashMap() {
        maparray = new int[1000001];
        Arrays.fill(maparray,-1);
    }
    
    public void put(int key, int value) {
        maparray[key] = value;
    }
    
    public int get(int key) {
        return maparray[key];
    }
    
    public void remove(int key) {
        maparray[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */