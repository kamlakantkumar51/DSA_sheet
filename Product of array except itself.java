//bruteforce approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        for(int i=0;i<nums.length;i++){
            int product = 1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    product *= nums[j];
                }
            }
            ans[i] = product;
        }
        return ans;
    }
}

//efficient solution
//prefix suffix approach...
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        for(int i=0;i<n;i++){
            ans[i]=1;
        }
        //left side
        int left =1;
        for(int i=0;i<n;i++){
            ans[i] *=left;
            left *= nums[i];
        }
        //right side
        int right=1;
        for(int i=n-1;i>=0;i--){
            ans[i] *= right;
            right *= nums[i];
        }
        return ans;
    }
}
