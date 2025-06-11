package Ex11062025.String;

public class L1 {
    public static void main(String[] args) {
        String name1 = "Nithu";
        String name2 ="Nithu";
        String name3 = new String("Nithu");
        String name4 = new String("Nithu");

        System.out.println(name1==name2);
        System.out.println(name1==name3);
        System.out.println(name3==name4);
        System.out.println(name1.equalsIgnoreCase(name3));
        System.out.println();
        System.out.println(name1.length());
        System.out.println(name1.charAt(4));
        System.out.println(name1.contains("thu"));
        System.out.println(name1.concat(" H K"));
        System.out.println(name1.indexOf('t'));
        System.out.println(name1.indexOf("u"));
        System.out.println(name1.replace('N','M'));
    }

}
