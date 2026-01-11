class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        boolean odd = false;
        int length = 0;
        for(Integer count:map.values()){
            if(count % 2 == 0){
                length += count;
            }else{
                length += count-1;
                odd = true;
            }
        }
        if(odd)length++;
        return length;
    }
}
