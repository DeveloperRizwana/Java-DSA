public class printAllSubstrings {
    public static void main(String[] args) {
        System.out.println("Result: ");
        String s = "abcd";
        for(int i = 0; i <= s.length()-1; i++){
            for(int j = i+1; j <= s.length(); j++){
                System.out.print(s.substring(i, j) + " ");
            }
        }
    }
    
}
