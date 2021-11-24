package com.arjun;

import java.util.Locale;
import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName, firstName, lastName;

        System.out.println("enter your full name: ");
        fullName = sc.nextLine();

        firstName = fullName.substring(0,fullName.indexOf(' '));
        lastName = fullName.substring(fullName.indexOf(' ')+1);

        System.out.println("First name in uppercase: " + firstName.toUpperCase());
        System.out.println("Last name in lowercase: " + lastName.toLowerCase());

    }
}
