package EX08062025.Part1;

import java.util.Scanner;

public class Lab14 {
    public static void main(String[] args) {
        //check if the char is vowel or consonant
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch =sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
            System.out.println(ch + " is a vowel");
        }else {
            System.out.println(ch +" is a consonant");
        }
        sc.close();
    }
}
