package Ex22062025;

public class Lab3 {
    //Input : "I Love Java Programming"
    //Output: "I Love Java gnimmargorP"

    public static void main(String[] args) {
        String input = "I Love Java Programming";
        String output = reverseLastWord(input);
        System.out.println(input);
        System.out.println(output);

    }
    public static String reverseLastWord(String sentence){
     String[] words = sentence.split(" ");
     String lastWord = words[words.length-1];
     StringBuilder sb = new StringBuilder(lastWord);
     words[words.length-1]= sb.reverse().toString();
     return String.join(" ",words);
    }
}
