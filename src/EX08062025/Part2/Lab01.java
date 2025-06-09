package EX08062025.Part2;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        //Largest of three numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        int n1= sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println("the largest is "+n1);
        } else if (n2>n3) {
            System.out.println("largest is "+n2);
        }else {
            System.out.println("largest is "+n3);
        }
        sc.close();
    }
}
