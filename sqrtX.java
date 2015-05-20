class Solution {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        // write your code here
        if(x <= 1) return x;
        int start = 0, end = x;
        while(start <= end) {
            long mid =  start + (end - start) / 2;
            long res = mid * mid;
            if(res == (long)x) return (int)mid;
            else if(res < (long)x) start = (int)mid + 1;
            else end = (int)mid - 1;
        }
        return end;
    }
}
