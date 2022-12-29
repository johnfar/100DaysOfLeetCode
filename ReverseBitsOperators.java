public class ReverseBitsOperators {
    public int reverseBits(int n) {
        // Bit Reverse with Bitwise Operators
        long reverse = 0;
        for (int i = 31; i >= 0; i--) {
            if ((n & 1 << i) != 0) {
                reverse = reverse | 1L << (31 - i);
            }

        }

        return (int) reverse;
    }
}
