class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character,Integer>counts = new HashMap<>();

        //frequency count
        for(char t:tasks){
            counts.put(t,counts.getOrDefault(t,0)+1);
        }

        //max heap
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int count:counts.values()){
            pq.offer(count);
        }
        int result = 0;
        while(!pq.isEmpty()){
            int time = 0;
            List<Integer> temp = new ArrayList<>();
            //process up to n+1 tasks

            for(int i=0;i<n+1;i++){
                if(!pq.isEmpty()){
                    temp.add(pq.poll()-1);
                    time++;
                }
            }

            //add remaining tasks in to the heap
            for(int t:temp){
                if(t > 0){
                    pq.offer(t);
                }
            }
            result += pq.isEmpty() ? time:(n+1);
        }
        return result;
    }
}