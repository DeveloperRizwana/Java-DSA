public class increasingInsertionSort {
    static void sort(int[] a){
        int n = a.length;
        for(int i = 1; i < n; i++){
            int j = i;
            while (j > 0 && a[j] < a[j-1]) {
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
                
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Insertion sort: ");
        int[] a = {8, 4, 1, 3, 2, 6};
        sort(a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    
}
