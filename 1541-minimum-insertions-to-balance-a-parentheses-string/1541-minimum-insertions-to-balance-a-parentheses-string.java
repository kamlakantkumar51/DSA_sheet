class Solution {
    public int minInsertions(String s) {
        int ans = 0;
        int neededright = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(neededright %2 != 0){
                    ans++;
                    neededright--;
                }
                neededright += 2;
            }else{
                neededright--;
                if(neededright < 0){
                    ans++;
                    neededright += 2;
                }
            }
        }
        return ans + neededright;
    }
}