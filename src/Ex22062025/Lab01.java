package Ex22062025;

public class Lab01 {
    public static void main(String[] args){
//           Input "I Love Java Programing"
//            Output "I Love Java gnimargorP"

                String input = "I Love Java Programming";
                String output = reverseLastWord(input);
                System.out.println(input);
                System.out.println(output);
            }

            public static String reverseLastWord(String sentence) {
                // Split the sentence into words
                String[] words = sentence.split(" ");

                // Reverse the last word
                String lastWord = words[words.length - 1];
                StringBuilder reversed = new StringBuilder(lastWord);
                words[words.length - 1] = reversed.reverse().toString();

                // Join the words back together
                return String.join(" ", words);
            }

}
