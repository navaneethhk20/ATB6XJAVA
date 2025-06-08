package EX08062025.Part1;

import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        //Largest of two number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int max = n1>n2?n1:n2;

        System.out.println("max is "+max);
    }
}
