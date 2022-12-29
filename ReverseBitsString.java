public class ReverseBitsString {
    // First attempt using strings to convert
    public int reverseBits(int n) {
        String initialBinary = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        StringBuilder reversedBinary = new StringBuilder(32);
        for (int i = initialBinary.length() - 1; i >= 0; i--) {
            reversedBinary.append(initialBinary.charAt(i));
        }
        String finalBinary = reversedBinary.toString();
        long reversed = Long.parseLong(finalBinary, 2);
        return (int) reversed;
    }

}
