class Solution {
    public int searchInsert(int[] nums, int target) {
        //concept of binary search
        // Input: nums = [1,3,5,6], target = 5
        // Output: 2
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start)+(end-start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return start;
    }
}
