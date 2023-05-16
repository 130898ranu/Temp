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



public class SmallestElement_array {
    public static void main(String[] args) {

        //Initialize array
        int [] arr = new int [] {25, 11, 7, 75, 56};
        //Initialize min with first element of array.
        int min = arr[0];
        //Loop through the array
        for (int i = 0; i < arr.length; i++) {
            //Compare elements of array with min
            if(arr[i] <min)
                min = arr[i];
        }
        System.out.println("Smallest element present in given array: " + min);
    }
}



public class EvenPosition {
    public static void main(String[] args) {

        //Initialize array
        int [] arr = new int [] {1, 2, 3, 4, 5};

        System.out.println("Elements of given array present on even position: ");
        //Loop through the array by incrementing value of i by 2
        //Here, i will start from 1 as first even positioned element is present at position 1.
        for (int i = 1; i < arr.length; i = i+2) {
            System.out.println(arr[i]);
        }
    }
}


public class OddPosition {
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {1, 2, 3, 4, 5};
        System.out.println("Elements of given array present on odd position: ");
        //Loop through the array by incrementing value of i by 2
        for (int i = 0; i < arr.length; i = i+2) {
            System.out.println(arr[i]);
        }
    }
}