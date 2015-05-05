class Solution {
    /**
     * @param key: A String you should hash
     * @param HASH_SIZE: An integer
     * @return an integer
     */
    public int hashCode(char[] key,int HASH_SIZE) {
        // write your code here
        int count = 0;
        int bit = 0, len = key.length, base = 1;
        while(bit < len) {
            count += (int)(((long)key[len - bit - 1] * (long)base) % HASH_SIZE) ;
            count %= HASH_SIZE;
            bit++;
            base = (int)((long)base * 33 % HASH_SIZE);
        }
        return (int)(long)(count % HASH_SIZE);
    }
};
