class Solution {
    public int missingNumber(int[] nums) {
        int missingno = nums.length;

        for(int i=0;i<nums.length;i++){
            missingno ^= i ^ nums[i];
        }
        return missingno;
    }
}
