// Input:
// S = "GFG"
// Output: 43334
// Explanation: For 'G' press '4' one time.
// For 'F' press '3' three times.
// User function Template for Java
class Solution {
    String printSequence(String S) {
        String[] keypad = {
            "2", "22", "222",     
            "3", "33", "333",    
            "4", "44", "444",   
            "5", "55", "555",    
            "6", "66", "666",     
            "7", "77", "777", "7777", 
            "8", "88", "888",     
            "9", "99", "999", "9999"  
        };
        StringBuilder result = new StringBuilder();
        
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            if(ch == ' '){
                result.append("0");
            }else{
                int pos = ch-'A';
                result.append(keypad[pos]);
            }
        }
        return result.toString();
    }
}
