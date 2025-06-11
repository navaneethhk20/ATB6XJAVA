package Ex11062025;

import java.util.Scanner;

public class Function2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 two numbers ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int add1 = sum(a,b);
        System.out.println(add1);

    }
    static int sum(int a , int b){
        return a+b;
    }
}
