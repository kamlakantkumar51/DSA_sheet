class Solution {
    public int maxArea(int[] height) {
        int maxwater = 0;
        int n = height.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            int length = Math.min(height[left],height[right]);
            int breadth = right-left;
            int water = length * breadth;
            maxwater = Math.max(maxwater,water);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxwater;

    }
}