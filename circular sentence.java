class Solution {
    public boolean isCircularSentence(String sentence) {
        String word[] = sentence.split(" ");

        for(int i=0;i<word.length-1;i++){
            char c1 = word[i].charAt(word[i].length()-1);
            char c2 = word[i+1].charAt(0);

            if(c1 != c2){
                return false;
            }
        }
        char c1 = word[word.length-1].charAt(word[word.length-1].length()-1);
        char c2 = word[0].charAt(0);
        if(c1 != c2){
            return false;
        }
        return true;
    }
}
