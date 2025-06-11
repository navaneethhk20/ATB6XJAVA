package Ex11062025.Arrays;

public class L2 {
    public static void main(String[] args) {
        //Find max in the array
        int [] marks = {74,89,78,64,97,28,87,14,29,};
        int max = marks[0];
        for(int i=0; i<marks.length;i++){
            if(marks[i]>max){
                max=  marks[i];
            }
        }
        System.out.println(max);

        int min = marks[0];
        for(int i=0; i<marks.length;i++){
            if(marks[i]<min){
                min=  marks[i];
            }
        }
        System.out.println(min);
    }
}
