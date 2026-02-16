class Solution {
    public int reverseBits(int n) {
        String b=String.format("%32s",Integer.toBinaryString(n)).replace(' ','0');
        String r=new StringBuilder(b).reverse().toString();
        return (int)Long.parseLong(r,2);
    }
}