//brute force approach
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            int product = 1;
            for(int j = i; j < n; j++) {
                product *= nums[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }

        return maxProduct;
    }
}
//efficeint solution
// Input: nums = [2,3,-2,4]
// Output: 6
class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int maxval = nums[0];
        int minval = nums[0];
        int maxproduct = nums[0];
        for(int i = 1; i < nums.length; i++){ 
            int temp = maxval;

            maxval = Math.max(nums[i], Math.max(maxval * nums[i], minval * nums[i]));
            minval = Math.min(nums[i], Math.min(temp * nums[i], minval * nums[i]));

            maxproduct = Math.max(maxproduct, maxval);
        }

        return maxproduct;
    }
}
