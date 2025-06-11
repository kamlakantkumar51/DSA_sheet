//bruteforce approach
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum+= nums[j];
                if(sum%k==0){
                    ans++;
                }
            }
        }
        return ans;
    }
}
//optimal siolution
//prefixsum & hashmap approach
import java.util.HashMap;
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int count = 0;
        int prefixSum = 0;

        for (int num : nums) {
            prefixSum += num;
            int mod = ((prefixSum % k) + k) % k;
            if (map.containsKey(mod)) {
                count += map.get(mod);
            }

            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }
        return count;
    }
}
