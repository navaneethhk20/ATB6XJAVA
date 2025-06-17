package Ex17062025.Oops.Polimorphism.Overriding;

public class Lab01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        Hound hound =new Hound();
        hound.bark();
         Dog h1 = new Hound();
         h1.bark();
    }
}
