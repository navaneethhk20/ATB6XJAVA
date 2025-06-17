package Ex17062025.Oops.Polimorphism.Overriding;

public class Hound extends Dog{
    public void bark(){
        System.out.println("I am hound, i will also bark Hound");
        super.bark();
    }
}
