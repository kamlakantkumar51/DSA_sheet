//brute force approach
class Solution {
    public int findKthLargest(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums[k-1];
    }
}

//minheap approach for optimal time complexity
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> ans = new PriorityQueue<>();
        for(int num:nums){
            ans.add(num);

            if(ans.size()>k){
                ans.poll();
            }
        }

        return ans.peek();
    }
}
//by the use of minheap
