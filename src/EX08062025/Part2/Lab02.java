package EX08062025.Part2;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        //smallest of two numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        if(n1>n2){
            System.out.println("smallest is "+n2);
        }else {
            System.out.println("smallest is "+n1);
        }
    }
}
