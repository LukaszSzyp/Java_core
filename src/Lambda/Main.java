package Lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Sum sum = (a, b) -> a+b;
        System.out.println(sum.calculate(5,5));

        Power power = a -> a*a;
        System.out.println(power.Powering(2));
        System.out.println("-----------------------------");

        List<Integer> integerList= Arrays.asList(1,2,3,4,5,6,7,8);

        integerList.forEach(element -> System.out.println(element));
    }
}
