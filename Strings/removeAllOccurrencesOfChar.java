public class removeAllOccurrencesOfChar {
    static String removeOccurance(String str, char ch){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ch){
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println("Removed Occurances: ");
        String str = "aabccbaa";
        char ch = 'a';
        System.out.println(removeOccurance(str, ch));
    }
    
}
