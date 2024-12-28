package Strings;

import java.util.*;

public class stringBulder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char At index 0
        System.out.println(sb.charAt(1));

        // set char At index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);
    }

}
