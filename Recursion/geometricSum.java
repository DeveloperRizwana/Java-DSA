public class geometricSum {
   static double findGeometricSum(int k){
    if(k == 0) return 1;

    double smallAns = findGeometricSum(k-1);
    return smallAns + 1 / Math.pow(2, k);

   }
   public static void main(String[] args) {
    int k = 4;
    System.out.println("Geometric Sum: " + findGeometricSum(k));
   }
    
}
