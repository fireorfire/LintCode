public class Solution {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @return: The maximum size
     */
    public int backPack(int m, int[] A) {
        // write your code here
        boolean[] opt = new boolean[m + 1];
        opt[0] = true;
        for(int i = 0; i < A.length; i++) {
            for(int j = m; j >= 0; j--) {
                if(j - A[i] >= 0 && opt[j - A[i]])
                    opt[j] = opt[j - A[i]];
            }
        }
        for(int i = m; i >= 0; i--)
            if(opt[i])return i;
        return 0;
    }
}
