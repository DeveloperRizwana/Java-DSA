public class append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("h");
        sb.append("e"); // str = str + "e"
        sb.append("l"); // str = str + "l";
        sb.append("l");
        sb.append("o");
        System.out.println(sb);

        System.out.println(sb.length()); // length of the string
    }

}
