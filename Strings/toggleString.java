public class toggleString {
    public static void main(String[] args) {
        String s = "PhYsIcS";
        System.out.println(s);
         // toggle -> capital letter to small and small letter to capital
         for(int i = 0; i < s.length(); i++){
            boolean flag = true; // true -> capital letter
            char ch = s.charAt(i); // A
            if(ch == ' ') continue;
            int asci = (int)ch; // 65
            if(asci >= 97) flag = false; // means it's a small letter
            if(flag == true){ // it's a capital letter
                asci += 32; // to change in small letter
                char dh = (char)asci;
                s = s.substring(0, i) + dh + s.substring(i+1);

            }else { // small
                asci -= 32;
                char dh = (char)asci;
                s = s.substring(0, i) + dh + s.substring(i+1);
            }    
        }
        System.err.println(s);
    }
    
}
