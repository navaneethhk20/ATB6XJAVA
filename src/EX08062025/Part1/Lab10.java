package EX08062025.Part1;

import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        //Palindrome of string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string name");
        String input = sc.next();
        input = input.toLowerCase();

        StringBuilder sb = new StringBuilder(input);
        String rev_str = sb.reverse().toString();
        if(input.equalsIgnoreCase(rev_str)){

            System.out.println("palindrome");
        }else {

            System.out.println("not a palindrome");
        }
        sc.close();
    }
}
