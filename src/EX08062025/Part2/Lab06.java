package EX08062025.Part2;

import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        // check if a character is alphabet
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        char alph = sc.next().charAt(0);

        if (Character.isAlphabetic(alph)) {
            System.out.println("it is character");
        } else {
            System.out.println("not a character");
        }
    }
}
