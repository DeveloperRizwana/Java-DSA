public class replacePi {
    static String replace(String input){
        if(input.length() < 2) return input;

       if(input.substring(0, 2).equals("pi")){
        return "3.14" + replace(input.substring(2));
       } else {
        return input.charAt(0) + replace(input.substring(1));
       }

    }
    public static void main(String[] args) {
        System.out.println("Replaced pi: ");
        String input = "xpix";
        System.out.println(replace(input));
    }
    
}
