package variable;

public class BinaryToInt {
    private int i;
    public String returnBinary(int i) {
        StringBuilder BinaryNumber = new StringBuilder("");
        while (i > 0) {
            int modulo = i % 2;
            if (modulo > 0) {
                BinaryNumber.append('1');
            } else BinaryNumber.append('0');
            i = i / 2;
        }
        BinaryNumber.reverse();
        return BinaryNumber.toString();
    }

}
