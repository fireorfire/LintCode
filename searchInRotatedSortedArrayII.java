public class Solution {
    /** 
     * param A : an integer ratated sorted array and duplicates are allowed
     * param target :  an integer to be search
     * return : a boolean 
     */
    public boolean search(int[] A, int target) {
        // write your code here
        if(A.length == 0) return false;
        int start = 0, end = A.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(A[mid] == target) return true;
            if(A[mid] < A[end]) {
                if(A[mid] < target && target <= A[end]) start = mid + 1;
                else end = mid - 1;
            }else if(A[mid] > A[start]) {
                if(A[start] <= target && target < A[mid]) end = mid - 1;
                else start = mid + 1;
            }else 
                start++;
        }
        if(A[start] == target) return true;
        return false;
    }
}

