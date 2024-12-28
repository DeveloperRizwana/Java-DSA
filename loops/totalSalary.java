import java.util.*;

public class totalSalary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        char grade = sc.next().charAt(0);

        double hra = 0.2 * basic;
        double da = 0.5 * basic;
        int allowance;
        double pf = 0.11 * basic;

        if(grade == 'A'){
            allowance = 1700;
        }
        else if(grade == 'B'){
            allowance = 1500;
        }
        else {
            allowance = 1300;
        }
        
        double totalSalary = basic + hra + da + allowance - pf;
        int ans =(int)Math.round(totalSalary);
        System.out.println(ans);
    }    
 
}
// Sample Input 1 :
// 10000 A
// Sample Output 1 :
// 17600
// Sample Input 2 :
// 4567 B
// Sample Output 2 :
// 8762