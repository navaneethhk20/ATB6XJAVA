package Ex11062025;

import java.util.Scanner;

public class Function4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user name to access");
        String name=sc.next();
        String usname = name(name);
        System.out.println("user name is "+usname);

        System.out.println("enter the 2 numbers to check the modulus");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int modulus = mod(a,b);
        System.out.println("modulus of two numbers is "+modulus);

    }
    static int mod(int a, int b){
        return a%b;
    }
    static  String name (String username){
        return username;
    }
}
