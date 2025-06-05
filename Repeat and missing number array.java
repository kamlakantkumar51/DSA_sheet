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

//optimal approach
public class Solution {
    public int[] repeatedNumber(final int[] A) {
        int n = A.length;

        long actualSum = 0, actualSqSum = 0;
        for (int num : A) {
            actualSum += num;
            actualSqSum += (long) num * num;
        }

        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSqSum = (long) n * (n + 1) * (2 * n + 1) / 6;

        long diff = expectedSum - actualSum;           
        long sqDiff = expectedSqSum - actualSqSum;      

        long sum = sqDiff / diff;                       

        long missing = (diff + sum) / 2;
        long repeating = missing - diff;

        return new int[]{(int) repeating, (int) missing};
    }
}

