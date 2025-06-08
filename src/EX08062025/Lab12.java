package EX08062025;

import java.util.Scanner;

public class Lab12 {
    public static void main(String[] args) {
        //check if a number is even or odd
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        if(num%2==0){
            System.out.println("even number");
        }else {
            System.out.println("odd");
        }
        scanner.close();
    }
}
