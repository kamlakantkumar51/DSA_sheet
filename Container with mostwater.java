//bruteforce approach...
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maximumarea = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               int length = Math.min(height[i],height[j]);
               int breadth = j-i;
               int area = length * breadth;
               maximumarea = Math.max(area,maximumarea); 
            }
            
        }
        return maximumarea;
    }
}

//optimal solution..
class Solution {
    public int maxArea(int[] height) {
        int mostwater = 0;
        int lp = 0;//lp = left pointer
        int rp = height.length-1;//rp = right pointer

        while(lp<rp){
            int breadth = rp-lp;
            int length = Math.min(height[lp],height[rp]);
            int area = breadth * length;
            mostwater = Math.max(area,mostwater);
            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return mostwater;
    }
}
//optimal approach by two pointer approach
