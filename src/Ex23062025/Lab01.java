package Ex23062025;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Lab01 {
    public static void main(String[] args) {
        //Reverse an array
        Integer [] arr = {54,60,20,7,4,3,2,1};
        TreeSet<Integer> treeSet = new TreeSet<>(List.of(arr));
        System.out.println(List.of(arr));
        System.out.println(treeSet);
    }
}
