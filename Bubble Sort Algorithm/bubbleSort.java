public class bubbleSort {
    static void sort(int[] a){
        int n = a.length;

        for(int i = 0; i < n -1; i++){
            boolean flag = false;
            for(int j = 0; j < n - i - 1; j++){

                if(a[j] > a[j+1]){

                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            // if(!flag){
            //     return;
            // }
            if(flag == false){
                return;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Bubble Sort: ");
        int[] a = {5, 7, 4, 1, 2};
        sort(a);
        for (int i : a) {
            System.out.print(i + " ");
            
        }
        
    }
    
}
