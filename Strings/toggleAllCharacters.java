import java.util.*;
public class toggleAllCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextInt());
        System.out.println(str);
        // toggle -> capital letter to small and small letter to capital
        for(int i = 0; i < str.length(); i++){
            boolean flag = true; // true -> capital letter
            char ch = str.charAt(i); // A
            if(ch == ' ') continue;
            int asci = (int)ch; // 65
            if(asci >= 97) flag = false; // means it's a small letter
            if(flag == true){ // it's a capital letter
                asci += 32; // to change in small letter
                char dh = (char)asci;
                str.setCharAt(i, dh);

            }else { // small
                asci -= 32;
                char dh = (char)asci;
                str.setCharAt(i, dh);
            }    
        }
        System.err.println(str);
    }
    
}
