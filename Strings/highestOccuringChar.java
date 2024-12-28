public class highestOccuringChar {
    static char highestOccuring(String str){
        int[] arr = new int[256];
        for(int i =0; i< str.length(); i++){
            arr[str.charAt(i)] += 1;
        }
        int max = -1;
        char ch = ' ';
        for(int i = 0; i<str.length(); i++){
            if(max < arr[str.charAt(i)]){
                max = arr[str.charAt(i)];
                ch = str.charAt(i);
            }
        }
        return ch;
    }
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println("Result: ");
        System.out.println(highestOccuring(str));
    }
}
