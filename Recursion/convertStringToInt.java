public class convertStringToInt {
    static int  convert(String input){
        if(input.length() == 1){
            return input.charAt(0) - '0';

        }
        int smallAns = convert(input.substring(0, input.length()-1));
        int lastDigit = input.charAt(input.length()-1)-'0';
        return smallAns * 10 + lastDigit;
    }
    public static void main(String[] args) {
        String str = "1234";
        System.out.println("The integer value is: " + convert(str));  // Output: 1234
    }
}


