package EX08062025.Part2;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        //smallest of 3 numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3 = sc.nextInt();
        int smallest = (n1<n2 && n1<n3)?n1:(n2<n3)?n2:n3;
        System.out.println(smallest);
        sc.close();
    }
}
