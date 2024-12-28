public class keypadCombination {
    static void combination(String dig, String[] kp, String res){
        if(dig.length() == 0){
            System.out.print(res + " ");
            return;
        }
        int currNum = dig.charAt(0) - '0';
        String currChoices = kp[currNum];

        for(int i = 0; i < currChoices.length(); i++){
            combination(dig.substring(1), kp, res + currChoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        System.out.println("Keypad combination: ");
        String dig = "236 ";
        String[] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        combination(dig, kp, "");
    }
    
}
