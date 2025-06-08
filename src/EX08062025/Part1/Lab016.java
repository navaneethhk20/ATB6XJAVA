package EX08062025.Part1;

import java.util.Scanner;

public class Lab016 {
    public static void main(String[] args) {
        //traingle classifier
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 sides of triangle");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        if(side1 == side2 && side2 == side3 && side1 == side3){
            System.out.println("Equilateral traingle");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isoscelus traingle");
        }else {
            System.out.println("Scalene");
        }
        sc.close();
    }

}
