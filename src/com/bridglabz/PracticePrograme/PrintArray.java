package com.bridglabz.PracticePrograme;

public class PrintArray {

}public static void main(String[] args) {
    //Initialize array
    int [] arr = new int [] {1, 2, 3, 4, 5};
    System.out.println("Elements of given array: ");
    //Loop through the array by incrementing value of i
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
}


public class LargestElement_array {
    public static void main(String[] args) {

        //Initialize array
        int [] arr = new int [] {25, 11, 7, 75, 56};
        //Initialize max with first element of array.
        int max = arr[0];
        //Loop through the array
        for (int i = 0; i < arr.length; i++) {
            //Compare elements of array with max
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element present in given array: " + max);
    }
}


