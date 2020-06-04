import variable.BinaryToInt;
import variable.Laptop;

import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] arg) {
        List<Laptop> laps = new ArrayList<>();
        laps.add(new Laptop("Dell",16,800));
        laps.add(new Laptop("Apple",8,1200));
        laps.add(new Laptop("Acer",12,700));

        for(Laptop l: laps){
            System.out.println(l);
        }
        Collections.sort(laps);
        System.out.println("-----------------");
        for(Laptop l: laps){
            System.out.println(l);
        }

        }
}