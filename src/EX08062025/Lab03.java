package EX08062025;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        //Grade calculator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score to get the grade");
        int score = sc.nextInt();
        if(score>=90 && score<=100){
            System.out.println("grade is S");
        } else if (score>=80 && score<=89) {
            System.out.println("grade is A");
        } else if (score>=70 && score<=79) {
            System.out.println("grade is B");
        } else if (score>=60 && score<=69) {
            System.out.println("grade is C");
        } else if (score>=50 && score <=59) {
            System.out.println("grade is D");
        } else if (score>=35 && score <= 49) {
            System.out.println("grade is E");
        } else if (score >= 100 || score<0) {
            System.out.println("enter the valid score between 0 and 100");
        } else {
            System.out.println("Failed in this subject");
        }
        sc.close();
    }
}
