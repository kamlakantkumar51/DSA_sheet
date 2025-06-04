class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i= n-2;
        //step 1 : finding the pivot element...
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            //step 2:find just larger element to swap
            int j=n-1;
            while(j>=0 && nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        //step 3 : reverse the remaining portion
        reverse(nums,i+1,n-1);
    }
    private void swap(int nums[],int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int nums[],int start,int end){
        while(start<end){
            swap(nums,start++,end--);
        }
    }
}
//Time & space complexity=O(n) & O(1)
