public class sortingRough {
    static void sort(int[] a){
        int n = a.length;

        for(int i = 0; i < n-1; i++){
            int max_index = i;
            for(int j = i+1; j < n; j++){
                if(a[j] > a[max_index]){
                    max_index = j;
                }
            }
            int temp = a[i];
            a[i] = a[max_index];
            a[max_index] = temp;
            
        }

    }
    public static void main(String[] args) {
        System.out.println("Bubble sort: ");
        int[] a = {8, 4, 1, 3, 2, 6};
        sort(a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    
}
