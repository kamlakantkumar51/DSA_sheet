class Solution {
    public String countAndSay(int n) {
        if(n<=0)return "";
        if(n == 1){
            return "1";
        }
        String ans = "1";
        for(int i=1;i<n;i++){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int j=0;j<ans.length();j++){
                if(j+1 < ans.length() && ans.charAt(j) == ans.charAt(j+1)){
                    count++;
                }
                else{
                    sb.append(count).append(ans.charAt(j));
                    count = 1;
                }
            }
            ans = sb.toString();
        }
        return ans;
    }
}