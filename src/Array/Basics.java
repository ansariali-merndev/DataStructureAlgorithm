package Array;

import java.util.Arrays;

public class Basics {
//    int[] rollNo; // Declaration of Arrays
//    rollNo = new int[5];  //Initializing Arrays Actual Memory creation in heap
public static void main(String[] args) {
    int[] arr = new int[4]; // Declaration + Initialization
    arr[0] = 65;
    arr[1] = 43;
    arr[2] = 10;
    arr[3] = 77;

    System.out.println(Arrays.toString(arr));
}
}
