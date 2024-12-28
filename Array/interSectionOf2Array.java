
public class interSectionOf2Array {
    static void findIntersection(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr2[j] == arr1[i]){
                    System.out.print(arr1[i] + " ");
                    arr1[i] = Integer.MIN_VALUE;
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                
                }
            }
        }
       

    }
    public static void main(String[] args) {
        int[] arr1 = {2, 6, 8, 5, 4, 3};
        int[] arr2 = {2, 3, 4, 7};
        findIntersection(arr1, arr2);;
        
       

    }
}    
    
    

