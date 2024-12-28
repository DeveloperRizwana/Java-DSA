
public class replaceCharacter {
    static String replace(String input, char c1, char c2){
        if(input.length() == 0) return input;

        char smallAns = input.charAt(0);
        if(smallAns == c1){
            return c2 + replace(input.substring(1), c1, c2);
        } else {
            return smallAns + replace(input.substring(1), c1, c2);
        }
    }
    public static void main(String[] args) {
        System.out.println("Replaced character: " + replace("hello", 'l', 'x'));
    }
    
}
