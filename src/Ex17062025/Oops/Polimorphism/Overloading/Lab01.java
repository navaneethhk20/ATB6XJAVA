package Ex17062025.Oops.Polimorphism.Overloading;

public class Lab01 extends AirthmeticOp{
    public static void main(String[] args) {
        AirthmeticOp airthmeticOp1 = new AirthmeticOp();
        System.out.println(airthmeticOp1.add(1 , 2));
        System.out.println(airthmeticOp1.add("Nithu", "HK"));
        System.out.println(airthmeticOp1.add(1.2f, 1.3f));
    }
}
