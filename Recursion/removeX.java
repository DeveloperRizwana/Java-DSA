public class removeX {
    static String remove(String input){
        if(input.length() == 0) return "";

        String smallAns = remove(input.substring(1));
        char curChar = input.charAt(0);
        if(curChar != 'x'){
            return curChar + smallAns;
        } else {
            return smallAns;
        }
    }
    public static void main(String[] args) {
        String input = "1234";
        System.out.println("Removed X: ");
        System.out.println(remove(input));
    }
    
}
