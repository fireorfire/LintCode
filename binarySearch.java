class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        //write your code here
        int max = nums.length - 1, min = 0;
        while(min <= max) {
            int mid = (max - min) / 2 + min;
            if(nums[mid] == target) {
                if(max == min)
                    return mid;
                else {
                    max = mid;
                }
            }
            else if(nums[mid] < target) min = mid + 1;
            else max = mid - 1;
        }
        return -1;
    }
}
