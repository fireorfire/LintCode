public class Solution {
    /** 
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
        int len = A.length;
        if(len == 0)return 0;
        int start = 0, end = len - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) {
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        if(A[start] >= target)
            return start;
        return start + 1;
    }
}

