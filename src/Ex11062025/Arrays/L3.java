package Ex11062025.Arrays;

public class L3 {
    public static void main(String[] args) {
//Reverse the array
        int [] a1 = {4,5,6,7,8,9,58,78,96,99,7};
        for(int i=a1.length-1;i>=0;i--){
            System.out.println(a1[i]);
        }

        //sum of an array
        int [] b1= {7,9,8,5,6,5};
        int sum=0;
        for (int i=0;i<b1.length;i++){
               sum = sum+b1[i];
        }
        System.out.println(sum);
    }
}
