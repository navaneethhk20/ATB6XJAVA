package Ex17062025.Oops.constructors.ParameterConstr;

public class ATBPerson {

    public String useName;
    public int ageOf;
    public long pho;


    public ATBPerson(String useName, int ageOf, long pho) {
        this.useName = useName;
        this.ageOf = ageOf;
        this.pho = pho;
    }


    public static void main(String[] args) {
        ATBPerson atbPerson =new ATBPerson("Nithu",24,765L);
        System.out.println(atbPerson.useName);
        System.out.println(atbPerson.ageOf);
        System.out.println(atbPerson.pho);
    }
}
