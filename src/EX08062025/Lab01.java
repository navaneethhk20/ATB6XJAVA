package EX08062025;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        //Take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user name");
        String name = sc.next();
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("User name is "+name + " and his age is "+ age +", so he can login");
        sc.close();
    }
}
