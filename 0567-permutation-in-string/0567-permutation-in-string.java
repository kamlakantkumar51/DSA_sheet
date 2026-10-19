class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char ch[] = s1.toCharArray();
        Arrays.sort(ch);
        String sorteds1 = new String(ch);

        for(int i=0;i<=s2.length()-s1.length();i++){
            char temp[]= s2.substring(i,i+s1.length()).toCharArray();
            Arrays.sort(temp);
            String sortedSubstring = new String(temp);
            if(sorteds1.equals(sortedSubstring)){
                return true;
            }
        }
        return false;
    }
}