package EX08062025.Part1;

import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        //Find the largest of 3 numbers using ternary operator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int max = n1>n2?n1:(n2>n3?n2:n3);
        System.out.println("largest number is " + max);
        sc.close();
    }
}
