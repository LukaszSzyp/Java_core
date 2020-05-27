package variable;

public class BinaryToInt {
    private int i;

    public String returnBinary(int i) {
        String BinaryNumber = "";
        while (i > 0) {
            int modulo = i % 2;
            if (modulo > 0) {
                BinaryNumber += "1";
            } else BinaryNumber += "0";
            i = i / 2;
        }
        String revers = "";
        for (int j = BinaryNumber.length() - 1; j >= 0; j--) {
            revers += BinaryNumber.charAt(j);
        }
        return revers;
    }


}
