public class addStar {
    static String printStar(String s){
        if(s.length() == 1) return s;

        char smallAns = s.charAt(0);
        char bigAns = s.charAt(1);
        if(smallAns == bigAns){
            return smallAns + "*" + printStar(s.substring(1));
        } else {
            return smallAns + printStar(s.substring(1));
        }


    }
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(printStar(s));
    }
    
}
