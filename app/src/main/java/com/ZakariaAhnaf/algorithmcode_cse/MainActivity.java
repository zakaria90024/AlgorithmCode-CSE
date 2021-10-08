package com.ZakariaAhnaf.algorithmcode_cse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int arr[] = {10, 2, 13, 56};
        int n = arr.length;
        int deletedPosition = 2;

//        SecondLargestElement.print2largestSimpleSoulation(arr, n);
          SecondLargestElement.printSecondLargestElementEfficientSolution(arr, n);
//        TraverseArray.TraverseArray(arr);
//        InsertAnElement.InsertAnElement(arr, 50, 3, 3);



//        for delete method call
//        n = DeleteAnElement.DeleteAnElement(arr, n, deletedPosition);
//        System.out.println("Modified array is");
//        for (int i = 0; i < n; i++)
//            System.out.println(arr[i]+" ");
    }

    //for First Salutation
    /*
        1) Check if array length up than 2
        2) Sort Array
        3) Start Loop - array size - 2 to array >= 0
        4) if array[i] != array[size -1] //second & first if same
                print array[i], return.
        5) End Loop - NOT Found
     */


    //for second Salutation
    /*
        1) Initialize the first as 0(i.e, index of arr[0] element
        2) Start traversing the array from array[1],
        a) If the current element in array say arr[i] is greater
        than first. Then update first and second as,
                second = first
                first = arr[i]
        b) If the current element is in between first and second,
        then update second to store the value of current variable as
                second = arr[i]
        3) Return the value stored in second.

     */
}