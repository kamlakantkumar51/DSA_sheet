//brute force approach
class Solution {
    public boolean isValid(String s) {
        if(s.length() ==0 || s==null){
            return true;
        }
        while(s.contains("()") || s.contains("[]") || s.contains("{}")){
            s.replace("()","");
            s.replace("[]","");
            s.replace("{}","");
        }
        return s.length() == 0;
    }
}

//optimal approach
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack  = new Stack();
        Map<Character,Character> map = Map.of(
            ')','(',
            '}','{',
            ']','['
        );
        for(char ch:s.toCharArray()){
            if(map.containsValue(ch)){
                stack.push(ch);
            }else if(map.containsKey(ch)){
                if(stack.isEmpty() || stack.pop()!= map.get(ch)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
