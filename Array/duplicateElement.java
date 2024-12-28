public class duplicateElement {
    static int findduplicateElement(int[] arr){
        int n = arr.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4};
        int ans = findduplicateElement(arr);
        System.out.println("Duplicate elelment " + ans);
    }
}
