package Strings;

import java.util.*;

public class length {
    public static void main(String[] args) {
        String firstName = "Tony";
        String lastName = "Stark";
        String fullname = firstName + " " + lastName;
        System.out.println(fullname.length());// full length of Tony Stark = 10

        // charAt
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
    }

}
