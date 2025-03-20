public class firstandlastoccur {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] result = new int[2];
            result[0] = Left(nums, target);
            result[1] = Right(nums, target);
            return result;
        }
    
        public int Left(int[] nums, int target) {
            int l = 0;
            int r = nums.length - 1;
            int leftIndex = -1;
            
            while (l <= r) {
                int m = l + (r - l) / 2;
                if (nums[m] == target) {
                    leftIndex = m;
                    r=m-1;
                } else if (nums[m] < target) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
            return leftIndex;
        }
    
        public int Right(int[] nums, int target) {
            int l = 0;
            int r = nums.length - 1;
            int rightIndex = -1;
            
            while (l <= r) {
                int m = l + (r - l) / 2;
                if (nums[m] == target) {
                    rightIndex = m; 
                    l=m+1;
                } else if (nums[m] < target) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
            return rightIndex; 
        }
    }
    
}
