package Ex17062025.Oops;

public class Lab1 {
    public static void main(String[] args) {
        Dog german = new Dog();
        german.age=12;
        german.breedName="gree";
        System.out.println(german.age + german.breedName);

    }

   static class Dog{
        String breedName;
        int age;
    }

   public void eat(){
        System.out.println("eating");
    }
    public void walk(){
        System.out.println("they are walking");
    }

}
