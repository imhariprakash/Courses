// Left shifting a byte value.
class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("Original value of a: " + a);   //dont forget to cast - since byte - only need 7 bits(31 bits - info here)
        System.out.println("i and b: " + i + " " + b);
    }
}