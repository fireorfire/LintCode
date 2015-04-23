public class Solution {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A & V: Given n items with size A[i] and value V[i]
     * @return: The maximum value
     */
    public int backPackII(int m, int[] A, int V[]) {
        // write your code here
        int[] opt = new int[m + 1], weight;
        int max = 0;
        for(int j = 0; j < A.length; j++) {
            for(int i = m; i >= 0; i--) {
                int tem = i - A[j];
                if(tem >= 0 && opt[i] < opt[tem] + V[j]) {
                    opt[i] = opt[tem] + V[j];
                }
            }
        }
        for(int i = m; i >= 0; i--) {
            if(max < opt[i]) max = opt[i];
        }
        return max;
    }
}
