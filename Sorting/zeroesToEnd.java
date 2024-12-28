public class zeroesToEnd {
    static void sort(int[] a){
        int n = a.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-1; j++){
                if(a[j] == 0 && a[j+1] != 0){

                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Sorted array: ");
        int[] a = {0, 1, 10, 5, 0, 4};
        sort(a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    
}
