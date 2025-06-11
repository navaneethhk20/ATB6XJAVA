package Ex11062025;

import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
        // check if a number is palindrome
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int temp_num= number;
        int rev_number = 0;

        while (temp_num !=0){
            rev_number = rev_number*10 +temp_num%10;
            temp_num = temp_num/10;
        }
        System.out.println(rev_number);

        if(temp_num == rev_number){
            System.out.println("palindrome");
        }else {
            System.out.println("not a palindrome");
        }
        scanner.close();
    }
}
