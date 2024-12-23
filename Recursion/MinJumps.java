public class MinJumps {
    static int minJumps(int[] arr) {
        int n = arr.length;
        int maxRAnge = 0;
        int nextMaxRange = 0;
        int jumps = 0;
        for(int i = 0; i < n; i++){
            if (arr[0] == 0) {
                return -1;
            }
            if(i+arr[i] > nextMaxRange){
                nextMaxRange = i+arr[i];
            }
            if(i == maxRAnge){
                maxRAnge = nextMaxRange;
                jumps++;
                if(maxRAnge >= n-1){
                    return jumps;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 7};
        System.out.println("Result : ");
        System.out.println(minJumps(arr));
    }
}
