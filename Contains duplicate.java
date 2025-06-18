// Input: nums = [1,2,3,1]

// Output: true

// Explanation:

// The element 1 occurs at the indices 0 and 3.
//Brute force approach:Time complexity=O(n^2),Space complexity=O(1)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
//******************************//
//Sorting approach:TC=O(logn),SC=O(1)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
//****************************//
//Hashet approach:TC & SC = O(n)
import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        for(int num:nums){
            if(ans.contains(num)){
                return true;
            }
            ans.add(num);
        }
        return false;
    }
}
