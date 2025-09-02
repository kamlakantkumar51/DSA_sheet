import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateall("",n,result);
        return result;
    }
    private static void generateall(String curr,int n,List<String> result){
        if(curr.length() == 2 * n){
            if(isValid(curr)){
                result.add(curr);
            }
            return;
        }
        generateall(curr + "(",n,result);
        generateall(curr + ")",n,result);
    }
    private static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(c == ')' && top!= '(' || c == '}' && top!= '{' || c == ']' && c == '['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
