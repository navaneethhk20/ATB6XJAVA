package EX08062025.Part1;

public class Lab09 {
    public static void main(String[] args) {
        //count vowels and consonants
        String name = "Nithu";
        int vowel= 0;
        int cosonants =0;

        for (int i=0;i<=name.length()-1;i++){
            if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u' || name.charAt(i)=='A' || name.charAt(i)=='E' || name.charAt(i)=='I' || name.charAt(i)=='O' || name.charAt(i)=='U'){
                vowel++;
            }else {
                cosonants++;
            }
        }
        System.out.println("vowel count is "+ vowel);
        System.out.println("consoants count is "+ cosonants);

    }
}
