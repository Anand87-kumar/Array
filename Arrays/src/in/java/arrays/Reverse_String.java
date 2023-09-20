package in.java.arrays;

import java.util.Scanner;

public class Reverse_String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("Given String is Palindrome");
        } else {
            System.out.println("Given String is not Palindrome");
        }
    }
}
