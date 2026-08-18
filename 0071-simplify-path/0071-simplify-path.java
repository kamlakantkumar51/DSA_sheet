class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<String>();

        for(int i=0;i<path.length();i++){
            String dir = "";
            //skip agar '/' mile to skip karo usko
            while(i < path.length() && path.charAt(i) == '/'){
                i++;
            }
            //read directory
            while(i < path.length() && path.charAt(i) != '/'){
                dir += path.charAt(i);
                i++;
            }
            if(dir.equals("..")){
                if(!st.empty()){
                    st.pop();
                }
            }else if(dir.equals(".")){
                continue;
            }else if(dir.length()!= 0){
                st.push(dir);
            }
        }
        //answer bna lete pura path scan hogya ab to 
        String ans = "";
        while(!st.empty()){
            ans = "/"+st.pop()+ans;
        }
        return ans.length() == 0 ? "/":ans;
    }
}