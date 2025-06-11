package Ex11062025;

import java.util.Scanner;

public class Function3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the user name");
        String username = scanner.next();
        name(username);

    }
    static void name(String user){
        System.out.println("entered user name is "+user);
    }
}
