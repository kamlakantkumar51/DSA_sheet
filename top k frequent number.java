class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        //counting the frequency of the element
        for(Integer num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        //conversion map to list
        List<Integer>list = new ArrayList<>(map.keySet());

        //sorting
        Collections.sort(list,(a,b) -> map.get(b) - map.get(a));

        int ans[] = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = list.get(i);
        }
        return ans;

    }
}
