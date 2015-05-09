public class Solution {
    /** 
     *@param A : an integer sorted array
     *@param target :  an integer to be inserted
     *return : a list of length 2, [index1, index2]
     */
    public ArrayList<Integer> searchRange(ArrayList<Integer> A, int target) {
        // write your code here
        int start = 0, end = A.size() - 1, left, right;
        ArrayList<Integer> result = new ArrayList<>();
        if(end == -1) {
            result.add(-1);
            result.add(-1);
            return result;
        }
        
        while(start < end) {
            int mid = (start + end) / 2;
            if(A.get(mid) > target) {
                end = mid - 1;
            }else if(A.get(mid) < target) {
                start = mid + 1;
            }else {
                end = mid;
            }
        }
        left = start;
        if(A.get(left) != target) {
            result.add(-1);
            result.add(-1);
            return result;
        }
        end = A.size() - 1;
        while(start < end) {
            int mid = (start + end + 1) / 2;
            if(A.get(mid) > target) {
                end = mid - 1;
            }else if(A.get(mid) < target) {
                start = mid + 1;
            }else {
                start = mid;
            }
        }
        right = start;
        result.add(left);
        result.add(right);
        return result;
    }
}

