import java.util.ArrayList;

public class allIndices {
    static ArrayList<Integer> allIndicesint(int[] arr, int x, int idx){
        if(idx >= arr.length){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr[idx] == x){
            ans.add(idx);
        }
        ArrayList<Integer> smallAns = allIndicesint(arr, x, idx + 1);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("All indices: ");
        int[] arr = {1, 2, 4, 4, 5, 4};
        ArrayList<Integer> ans = allIndicesint(arr, 4, 0);
        for (Integer i : ans) {
            System.out.println(i);
            
        }
        
    }
    
}
