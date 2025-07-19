class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        for(int num:nums){
            low = Math.max(low,num);
            high += num;
        }
        while(low<high){
            int mid  = low + (high-low)/2;
            if(canSplit(nums,k,mid)){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    private boolean canSplit(int nums[],int k,int maxallowed){
        int count =1;
        int currsum = 0;
        for(int num:nums){
            if(currsum+num> maxallowed){
                count++;
                currsum = num;
                if(count>k) return false;
            }else{
                currsum += num;
            }
        }
        return true;
    }
}
