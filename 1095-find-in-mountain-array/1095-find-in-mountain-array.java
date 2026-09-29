/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index);
 *     public int length();
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int length = mountainArr.length();
        int peak = findPeakIndex(mountainArr, length);
        
        int index = binarySearchAscending(mountainArr, target, 0, peak);
        if (index != -1) {
            return index;
        }
        
        return binarySearchDescending(mountainArr, target, peak + 1, length - 1);
    }
    
    private int findPeakIndex(MountainArray mountainArr, int length) {
        int start = 0;
        int end = length - 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
    
    private int binarySearchAscending(MountainArray mountainArr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = mountainArr.get(mid);
            
            if (val == target) {
                return mid;
            } else if (val < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    
    private int binarySearchDescending(MountainArray mountainArr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = mountainArr.get(mid);
            
            if (val == target) {
                return mid;
            } else if (val > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}