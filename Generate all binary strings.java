// User function Template for Java

class Solution {
    public static List<String> generateBinaryStrings(int n) {
        // code here
        List<String> result = new ArrayList<>();
        helper(n,0,"",result);
        return result;
    }
    private static void helper(int n,int lastplace,String str,List<String> result){
        if(n == 0){
            result.add(str);
            return;
        }
        helper(n-1,0,str + "0",result);
        if(lastplace == 0){
            helper(n-1,1,str + "1",result);
        }
        
    }
}
