public class insert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // add a new letter before the word ,,, Tony -> Stony
        sb.insert(2, 'n'); // sb.insert(0, 'S');
        System.out.println(sb);

        // delete the extra n
        sb.delete(2, 3); // ending index non exclusive ,,,,, 3 -> 2
        System.out.println(sb);

    }

}
