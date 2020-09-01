package loop;

public class BreakInstruction {
    public static void main(String[] args) {
        for (int i=0; i < 5; i++) {
            for (int y=0; y<2; y++) {
                if ((y == 1)||(i==3)) {
                    break;
                }
                System.out.println("liczba i: " + i +" liczba y:" + y);
            }
        }
    }
}
