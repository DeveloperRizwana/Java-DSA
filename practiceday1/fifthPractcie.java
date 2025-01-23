public class fifthPractcie {
    static int countDig(int[] arr) {
        if(arr.length == 0){
            return -1;
        }
        if (arr[0] == 0) {
            return -1;
        }
        int maxRange = 0, lastIdx = 0, jumps = 0;
        for(int i = 0; i < arr.length-1; i++) {
            maxRange = Math.max(maxRange, i+arr[i]);
            if(i == lastIdx){
                if(maxRange==i){
                    jumps = -1;
                    break;
                }
                lastIdx = maxRange;
                jumps++;
                if(maxRange >= arr.length-1){
                    break;
                }
            }
        }
        return jumps;
    }
    
    public static void main(String[] args) {
        int[] a = {1,4,3,2,6,7};
        System.out.println("Answer is : " + countDig(a));
    }
}
