class Solution {
    public int superPow(int a, int[] b) {
        int base = 1337;
        int exp = 0;
        for (int i = 0; i < b.length; i++) {
            exp = (exp * 10 + b[i]) % 1140;
        }
        if (exp == 0) {
            exp += 1140;
        }
        int result = 1;
        a %= base;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * a) % base;
            }
            a = (a * a) % base;
            exp >>= 1;
        }
        return result;
    }
}