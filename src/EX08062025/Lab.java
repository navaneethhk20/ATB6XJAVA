package EX08062025;

import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        //simple calculator to perform airthmetic operations
        Scanner sc = new Scanner(System.in);
        String name = "Navaneeeth";
        System.out.println("Enter the 2 numbers to perform action");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);
        sc.close();
        System.out.println(num1+num2+name);
        System.out.println(name+num1+num2);
    }
}
