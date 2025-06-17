package Ex17062025.Oops.Encapusulation;

public class Lab01 {
    public static void main(String[] args) {
        ICICIBank iciciBank = new ICICIBank("Navaneeth", 1000);
        System.out.println(iciciBank.getBalance());
        System.out.println(iciciBank.getName());

        ICICIBank iciciBank1 = new ICICIBank("pol",654);
        System.out.println(iciciBank1.getName());
        System.out.println(iciciBank1.getBalance());
    }
}
