public class removeOccurrences {
    static String remove1(String s){
        if(s.length() == 0) return "";
        
        String smallAns = remove1(s.substring(1));
        char curChar = s.charAt(0);
        if(curChar != 'a'){
            return curChar + smallAns;
        } else {
            return smallAns;
        }
        
    }
    static String remove(String s, int idx){
        // base case
        if(idx == s.length()){
            return "";
        }
        // recursive work
        String smallAns = remove(s, idx + 1);
        char curChar = s.charAt(idx);
        // self work
        if(curChar != 'a'){
            return curChar + smallAns;
        } else {
            return smallAns;
        }

    }
    public static void main(String[] args) {
        System.out.println("Removed occurrences: ");
        String s = "aahish";
        System.out.println(remove(s, 0));
        System.out.println(remove1(s));
    }
    
}
