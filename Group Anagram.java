import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Bruteforce approach
        List<List<String>> ans = new ArrayList<>();

        for(String word:strs){
            boolean added = false;

            //if word is fitting in the group
            for(List<String>group:ans){
                if(isAnagram(group.get(0),word)){
                    group.add(word);
                    added = true;
                    break;
                }
            }
            //if word is not fitting in the hroup
            if(!added){
                List<String> newgroup = new ArrayList<>();
                newgroup.add(word);
                ans.add(newgroup);
            }
        }
        return ans;
    }
    private boolean isAnagram(String s1,String s2){
        if(s1.length()!= s2.length())
            return false;
        
        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}

import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //optimised approach
        Map<String,List<String>>ans = new HashMap<>();

        for(String word:strs){
            //converting string in to array
            char chars[] = word.toCharArray();
            //sorting
            Arrays.sort(chars);
            //creating new string and add the sorted arrays in that string
            String key = new String(chars);
            //if not contains key
            if(!ans.containsKey(key)){
                ans.put(key,new ArrayList<>());
            }
            ans.get(key).add(word);
        }
        return new ArrayList<>(ans.values());
    }
}

// Input: strs = ["eat","tea","tan","ate","nat","bat"]

// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
