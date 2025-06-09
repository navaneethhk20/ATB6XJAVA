package EX08062025.Part2;

import java.util.Scanner;

public class Lab07 {
    //Armstrong number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = sc.nextInt();
        int temp = input;
        int newNum =0;

        while(input!=0){
            int digit = input%10;
            newNum = digit* digit*digit + newNum;
            input = input/10;
        }
        if (temp == newNum){
            System.out.println("it is an armstrong number");
        }else {
            System.out.println("not a armstrong number");
        }


    }
}