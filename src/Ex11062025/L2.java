package Ex11062025;

import java.util.Scanner;

public class L2 {
    public static void main(String[] args) {
        //Right angled traingle
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
