class Solution {
    /**
     * @param n: an integer
     * @return an integer f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        if(n == 1) return 0;
        else if(n == 2) return 1;
        int first = 0, second = 1;
        int count = 2;
        while(count < n) {
            int third = first + second;
            first = second;
            second = third;
            count++;
        }
        return second;
    }
}


