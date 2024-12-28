public class arraySum {
    // static int printArraySum(int[] arr, int idx){
    //     if(idx == arr.length){
    //         return 0;
    //     }
    //     int smallAns = printArraySum(arr, idx + 1);
    //     return arr[idx] + smallAns;
    // }
    public static int sum(int input[]) {
		if(input.length == 0){
            return 0;
        }
        int[] smallAns = new int[input.length-1];
        for(int i = 1; i < input.length; i++){
            smallAns[i-1] = input[i];
        }
        return input[0] + sum(smallAns);
		
	}
    public static void main(String[] args) {
        int[] arr  = {2, 3, 5, 20, 1};
        // System.out.println("Sum of Array " + printArraySum(arr, 0));
        System.out.println("Sum of array " + sum(arr));
    }
    
}
