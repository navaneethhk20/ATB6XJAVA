package Ex17062025.Oops.Encapusulation;

public class ICICIBank {
    private String name;
    private long balance;

    public ICICIBank(String name , long balance){
        this.name =name;
        this.balance =balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }


}
