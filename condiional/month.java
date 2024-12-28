import java.util.*;

public class month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        
       // if(button == 1) {
       //     System.out.println("January");
       // } else if(button == 2) {
       //     System.out.println("February");
       // } else if(button == 3) {
       //     System.out.println("March");
       // } else if(button == 4) {
       //    System.out.println("April");
       // } else if(button == 5) {
       //     System.out.println("May");
       // } else if(button == 6) {
       //     System.out.println("June");
       // } else {
       //     System.out.println("July");
       // }
                    

       switch(button) {
        case 1 : System.out.println("January");
        break;
        case 2 : System.out.println("February");
        break;
        case 3 : System.out.println("March");
        break;
        case 4 : System.out.println("April");
        break;
        case 5 : System.out.println("May");
        break;
        case 6 : System.out.println("June");
        break;
        default : System.out.println("July");
    
       }
    }       
    
}
