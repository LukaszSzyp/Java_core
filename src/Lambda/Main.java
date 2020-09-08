package Lambda;

public class Main {
    public static void main(String[] args) {

        Sum sum = (a, b) -> a+b;
        System.out.println(sum.calculate(5,5));

        Power power = a -> a*a;
        System.out.println(power.Powering(2));
    }
}
