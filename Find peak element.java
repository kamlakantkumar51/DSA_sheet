//my approach code
class Solution {
    public int findPeakElement(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1] && nums[i]>nums[i-1]){
                return i;
            }
        }
        return -1;
    }
}

// my bruteforce approach
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            boolean left = (i == 0) || (nums[i] > nums[i - 1]);
            boolean right = (i == n - 1) || (nums[i] > nums[i + 1]);

            if (left && right) {
                return i;
            }
        }

        return -1;
    }
}

//efficient approach
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid]<nums[mid+1]){
                start = mid +1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
