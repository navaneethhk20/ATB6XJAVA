package EX08062025;

import java.util.Scanner;

public class Lab07 {
    public static void main(String[] args) {
        //take name , age and salary as input and print them
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.next();
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("Enter the salary");
        int salary = sc.nextInt();
        System.out.println("User name is "+name+" , he is "+age+" old"+" and he earns "+salary+" Rs per month");
    }
}
