import java.util.*;

public class ComplexNumbers {
    int real1;
    int imaginary1;

    ComplexNumbers(int real1, int imaginary1){
        this.real1 = real1;
        this.imaginary1 = imaginary1;
    }

    
    public void plus(ComplexNumbers c2){
        this.real1 += c2.real1;
        this.imaginary1 += c2.imaginary1;
    }
    public void multiply(ComplexNumbers c2){
        int r = this.real1 * c2.real1 - this.imaginary1 * c2.imaginary1;
        int i = this.real1 * c2.imaginary1 + this.imaginary1 * c2.real1;
        this.real1 = r;
        this.imaginary1 = i;
    }
    public void print(){
        System.out.println(this.real1 + " + " + "i" + this.imaginary1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    
        System.out.println("Enter real1 number");
        int real1 = s.nextInt();
        System.out.println("Enter imaginary1 number");
        int imaginary1 = s.nextInt();
    
        System.out.println("Enter real2 number");
        int real2 = s.nextInt();
        System.out.println("Enter imaginary2 number");
        int imaginary2 = s.nextInt();
    
        ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
        ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);
    
        System.out.println("Enter choice 1 for add and 2 for multiply");
        int choice = s.nextInt();
         
        if(choice == 1) {
            // Add
            c1.plus(c2);
            c1.print();
        }
        else if(choice == 2) {
            // Multiply
            c1.multiply(c2);
            c1.print();
        }
        else {
            return;
        }
    }
}
