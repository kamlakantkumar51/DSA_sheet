// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.
//bruteforce approach
import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //bruteforce approach
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            for(int j =i+1;j<n-1;j++){
                for(int k = j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> ans = Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(ans);
                        set.add(ans);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}

//optimal approach
import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length < 3) return ans;

        Arrays.sort(nums); 
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } 
                else if (sum < 0) {
                    left++; 
                } 
                else {
                    right--; 
                }
            }
        }

        return ans;
    }
}
