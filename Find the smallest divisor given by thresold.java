import java.util.*;
// class Solution {//time limit exceded
//     public int smallestDivisor(int[] nums, int threshold) {
//         int max =0;
//         for(int num:nums){
//             max = Math.max(num,max);
//         }
//         for(int d = 1;d<= max;d++){
//             int sum =0;
//             for(int num:nums){
//                 sum+= (num + d -1)/d;
//             }
//             if(sum<=threshold){
//                 return d;
//             }
//         }
//         return -1;
        
//     }
// }
public class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 1, end = 0;
        for (int num : nums) {
            end = Math.max(end, num);
        }
        while (start < end) {
            int mid = (start + end) / 2;
            int sum = 0;

            for (int num : nums) {
                sum += (num + mid - 1) / mid; 
            }

            if (sum <= threshold) {
                end = mid; 
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
