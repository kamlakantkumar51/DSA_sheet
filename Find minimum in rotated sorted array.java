//brute force approach 
// Input: nums = [3,4,5,1,2]
// Output: 1
class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }
}
//optimal approach
// Input: nums = [3,4,5,1,2]
// Output: 1
class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid]>nums[end]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return nums[start];
    }
}
