class Solution {
    public int reverseBits(int n) {
        String binary = Integer.toBinaryString(n);
        int rem = 32 - binary.length();
        binary = "0".repeat(rem) + (binary);
        return Integer.parseInt(new StringBuilder(binary).reverse().toString(),2);
    }
}