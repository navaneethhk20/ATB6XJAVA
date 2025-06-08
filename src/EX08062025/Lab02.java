package EX08062025;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        //take input from user tp Print table of the respective number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to print");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num + " X "+ i + " = " + num*i);
        }
        sc.close();
    }
}
