public class stringCompression {
    public static void main(String[] args) {
        String s = "aaabbbcccddde";
        String ans = "" + s.charAt(0);
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            char cur = s.charAt(i);
            char prev = s.charAt(i-1);
            if (cur == prev) {
                count++;
            } else {
                if(count>1) ans += count;
                count = 1;
                ans += cur;
            }

        }
        if(count>1) ans += count;
        System.out.println("Output:" + ans);
    }
    
}
