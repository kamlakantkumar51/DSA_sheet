class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int arr[] = new int[2];

        for(Integer num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Integer key:map.keySet()){
            if(map.get(key)==2){
                arr[0] = key;
            }
        }

        for(int i=0;i<=nums.length;i++){
            if(!map.containsKey(i)){
                arr[1] = i;
            }
        }
        return arr;
    }
}
