//gfg
import java.util.*;
class Solution {
    public String reverse(String S) {
        // code here
        Stack<Character> str = new Stack<>();
        
        int i = 0;
        while(i < S.length()){
            str.push(S.charAt(i));
            i++;
        }
        
        StringBuilder ans = new StringBuilder();
        
        while(!str.isEmpty()){
            char curr = str.pop();
            ans.append(curr);
        }
        return ans.toString();
        
    }
}

//leetcode
import java.util.*;
class Solution {
    public void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s){
            stack.push(c);
        }

        int i = 0;
        while(!stack.isEmpty()){
            s[i++] = stack.pop();
        }

    }
}
