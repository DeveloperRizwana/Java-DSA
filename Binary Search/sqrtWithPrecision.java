public class sqrtWithPrecision {
    static double findSqrtWithPrecision(double  x, double precision){
            double st = 0, end = x;
            double ans =    0; 
            while (st <= end) {
                double mid = st+(end-st)/2;
                double target = mid*mid;
                if(target == x){
                    return mid;
                } else if(target < x){
                    ans = mid;
                    st = mid+1;
                } else {
                    end = mid - 1;
                }
            }
            return ans;
        }
        public static void main(String[] args) {
            System.out.println("Sqaure root: ");
            double x = 50;
            double precision = 1e-6;
            System.out.println(findSqrtWithPrecision(x, precision));
        }

    }

