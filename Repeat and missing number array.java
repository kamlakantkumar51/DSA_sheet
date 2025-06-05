//Brute force approach
public class Solution {
    public int[] repeatedNumber(final int[] A) {
        int repeating = -1;
        int missing = -1;
        
        for(int i=1;i<=A.length;i++){
            int count =0;
            for(int j=0;j<A.length;j++){
                if(A[j]==i){
                    count++;
                }
            }
            if(count ==2){
                repeating = i;
            }else if(count ==0){
                missing = i;
            }
        }
        return new int[]{repeating,missing};
    }
}
