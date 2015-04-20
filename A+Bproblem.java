class Solution {
    /*
     * param a: The first integer
     * param b: The second integer
     * return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // Click submit, you will get Accepted!
        //return a + b;
        int c = a ^ b;
        int d = a & b;
        d = d << 1;
        if(d == 0)return c;
        return aplusb(c, d);
    }
};
