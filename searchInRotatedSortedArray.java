public class Solution {
    /** 
     *@param A : an integer rotated sorted array
     *@param target :  an integer to be searched
     *return : an integer
     */
    public int search(int[] A, int target) {
        // write your code here
        if(A.length == 0) return -1;
        int start = 0, end = A.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(A[mid] == target) return mid;
            if(A[mid] < A[end]) {
                if(A[mid] < target && target <= A[end]) start = mid + 1;
                else end = mid - 1;
            }else {
                if(A[start] <= target && target < A[mid]) end = mid - 1;
                else start = mid + 1;
            }
        }
        if(A[start] == target) return start;
        return -1;
    }
}

