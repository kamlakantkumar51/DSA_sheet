//bruteforce approach
import java.util.*;
class Solution {
    public static String smallestWindow(String s1, String s2) {
        int minlen = Integer.MAX_VALUE;
        String result = "";
        for(int i=0;i<s1.length();i++){
            for(int j=i;j<s1.length();j++){
                String sub = s1.substring(i,j+1);
                if(containsAll(sub,s2)){
                    if(sub.length()<minlen){
                        minlen = sub.length();
                        result = sub;
                    }
                }
            }
        }
        return result.equals("") ? "" :result;
    }
    private static boolean containsAll(String sub,String s2){
        Map<Character,Integer>submap = new HashMap<>();
        Map<Character,Integer>tmap = new HashMap<>();
        for(char c:sub.toCharArray()){
            submap.put(c,submap.getOrDefault(c,0)+1);
        }
        for(char c:s2.toCharArray()){
            tmap.put(c,tmap.getOrDefault(c,0)+1);
        }
        for(char c:tmap.keySet()){
            if(!submap.containsKey(c) || submap.get(c)<tmap.get(c)){
                return false;
            }
        }
        return true;
    }
}
