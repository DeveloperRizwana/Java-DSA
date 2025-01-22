public class fifthPractcie {
    static int countDig(int[] arr) {
        if(arr.length == 0){
            return -1;
        }
        if(arr[0] == 0) return -1;
        int count = 0;
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] == 0){
                break;
            } 
            int jump = arr[i];
            i += jump;
            count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println("Answer is : " + countDig(a));
    }
}
