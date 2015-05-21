public class Solution {
    /**
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] num) {
        // write your code here
        if(num.length == 0) throw new IllegalArgumentException("no element");
        int start = 0, end = num.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(num[start] < num[end]) {
                return num[start];
            }
            else {
                if(num[mid] < num[end])
                    end = mid;
                else
                    start = mid + 1;
            }
        }
        return num[start];
    }
}
