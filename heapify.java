public class Solution {
    /**
     * @param A: Given an integer array
     * @return: void
     */
     int[] A ;
    public void heapify(int[] A) {
        // write your code here
        this.A = A;
        for(int i = A.length - 1; i >= 0; i--) {
            shiftdown(i);
        }
        return;
    }
    public void shiftdown(int i) {
        int child1 =  i * 2 + 1, child2 = i * 2 + 2;
        int small = child1;
        if(child1 >= A.length)return;
        else if(child2 < A.length && A[child2] < A[child1])small = child2;
        if(A[i] > A[small]) {
            int tem = A[i];
            A[i] = A[small];
            A[small] = tem;
            shiftdown(small);
        }
    }
}
