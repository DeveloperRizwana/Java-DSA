import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button) {
            case 1 : System.out.println("Monday");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wednesday");
            break;
            case 4 : System.out.println("Thursday");
            break;
            case 5 : System.out.println("friday");
            break;
            case 6 : System.out.println("Saturday");
            break;
            default : System.out.println("sunday");
        }
    }        

    
}
