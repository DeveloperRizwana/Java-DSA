public class fourthPractice{
    public static String getCompressedString(String str) {
        String ans = "" + str.charAt(0);
        int count = 1;
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            } else {
                if(count > 1) ans += count;
                count = 1;
                ans += str.charAt(i);
            }
        } 
        if(count > 1) ans += count;
        return ans;

    } 
    public static void main(String[] args) {
        System.out.println("Count of letters: ");
        String str = "aaabbccdsa";
        System.out.println(getCompressedString(str));
    }
}
