public class Solution {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
     private int[][] matrix;
     private int target;
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        this.matrix = matrix;
        this.target = target;
        int clow = 0, chigh = matrix[0].length - 1;
        int rlow = 0, rhigh = matrix.length - 1;
        while(rlow <= rhigh) {
            int rmid = (rlow + rhigh) / 2;
            if(matrix[rmid][0] == target) {
                return true;
            }else if(matrix[rmid][0] > target) {
                rhigh = rmid - 1;
            }else {
                rlow = rmid + 1;
            }
        }
        rhigh = Math.max(0, rhigh);
        while(clow <= chigh) {
            int cmid = (clow + chigh) / 2;
            if(matrix[rhigh][cmid] == target)return true;
            else if(matrix[rhigh][cmid] < target) clow = cmid + 1;
            else chigh = cmid - 1;
        }
        return false;
    }
    // public boolean find(int rlow, int rhigh, int clow, int chigh) {
    //     if(rlow > rhigh || clow > chigh) return false;
    //     int rmid = (rlow + rhigh) / 2;
    //     int cmid = (clow + chigh) / 2;
    //     int point = matrix[rmid][cmid];
    //     if(point == target) return true;
    //     else if(point < target) {
    //         return find(rmid + 1, rhigh, clow, chigh) ||
    //                 find(rlow, rhigh, cmid + 1, chigh);
    //         // return find(rmid + 1, rhigh, clow, cmid) ||
    //         //         find(rlow, rmid, cmid + 1, chigh) ||
    //         //         find(rmid + 1, rhigh, cmid + 1, chigh);
    //     }else {
    //         return find(rlow, rhigh, clow, cmid - 1) ||
    //                 find(rlow, rmid - 1, clow, chigh) ;
    //         // return find(rmid, rhigh, clow, cmid - 1) ||
    //         //         find(rlow, rmid - 1, cmid, chigh) ||
    //         //         find(rlow, rmid - 1, clow, cmid - 1);
    //     }
    // }
}

