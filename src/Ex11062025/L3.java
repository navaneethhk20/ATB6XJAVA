package Ex11062025;

import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of times you want to print");
        int n = sc.nextInt();
        for(int i=0; i<n;i++){
            greet();
        }
    }
    private static void greet(){
        System.out.println("Good Morning");
    }

}
