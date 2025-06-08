package EX08062025.Part1;

import java.util.Scanner;

public class Lab11 {
    public static void main(String[] args) {
        //check if a number is postive or negative

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num>0){
            System.out.println(num+" is a Positive number");
        }else {
            System.out.println(num+" is a negative number");
        }
    }
}
