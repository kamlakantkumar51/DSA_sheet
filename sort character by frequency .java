//bruteforce approach
class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> freqMap = new HashMap<>();
        char arr[] = s.toCharArray();
        for(char ch:arr){
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
        }
        List<Character> charsort = new ArrayList<>(freqMap.keySet());
        charsort.sort((a,b) -> freqMap.get(b)- freqMap.get(a));
        StringBuilder ans = new StringBuilder();
        for(char ch:charsort){
            int freq = freqMap.get(ch);
            for(int i=0;i<freq;i++){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
