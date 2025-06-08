package EX08062025.Part1;

public class Lab06 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a +a++ +a++);
        System.out.println(a);
        /**
         * 34
         * 13
         */
        int b=20;
        System.out.println(--b + b++ +b--);
        System.out.println(b);
        /**
         * 58
         * 19
         */
    }
}
