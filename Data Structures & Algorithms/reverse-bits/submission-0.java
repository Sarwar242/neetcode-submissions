class Solution {
    public int reverseBits(int n) {
         int result = 0;
        int  i = 32;
        while(i>0){
            result =  result << 1;
            int bit =  n&1;
            result |= bit;
            n=n>>1;

            i--;
        }

        return result;
    }
}
