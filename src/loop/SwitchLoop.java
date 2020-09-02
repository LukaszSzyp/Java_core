package loop;

public class SwitchLoop {
    public static void main(String[] args) {
        var choice = 1;

        switch (choice){
            case 1:
                System.out.println("wybrałeś 1");
                break;
            case 2:
                System.out.println("wybrałeś 2");
                break;
            case 3:
                System.out.println("wybrałeś 3");
                break;
            default:
                System.out.println("Sprawdź wybór");
        }
    }
}
