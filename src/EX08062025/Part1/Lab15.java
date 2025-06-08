package EX08062025.Part1;

import java.util.Scanner;

public class Lab15 {
    public static void main(String[] args) {
        //check if a person is elligibe to vote
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age= sc.nextInt();
        if (age<=1 && age>=122){
            System.out.println("Enter the correct age");
        }else if(age>=18 && age<122){
            System.out.println("allowed to vote");
        }else {
            System.out.println("not allowed to vote");
        }
        sc.close();
    }
}
