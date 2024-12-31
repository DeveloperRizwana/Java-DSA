public class fifthPractcie {
    public static int missingNumber(int[] a){
        int k = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == k){
                k++;
                i = -1;
            } 
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
}
