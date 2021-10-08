package com.ZakariaAhnaf.algorithmcode_cse;

import android.util.Log;

import java.util.Arrays;

public class SecondLargestElement {

    //First Salutation Using Sort
    static void print2largestSimpleSoulation(int arr[], int arr_size){

        if(arr_size < 2){
            System.out.println("Invalid Input");
            return;
        }

        //for sort array
        Arrays.sort(arr);

        for(int i = arr_size - 2; i >= 0; i--){
            //if the element not equal to largest element
            if(arr[i] != arr[arr_size - 1]){

                //Log.d("SECOND_LARGEST", ""+arr[i]);
                System.out.println("SECOND_LARGEST "+arr[i]);
                return;
            }
        }

        System.out.println("There is no Second Largest Second Number Hare");

    }




    //Second Salutation Liner Search And SWAP
    static void printSecondLargestElementEfficientSolution (int arr[],int arr_size){
        int i, first, second;
        if(arr_size < 2){
            System.out.println("Invalid Input");
        }

        /*int MAX_VALUE −  2^31-1.
        int MIN_VALUE − -2^31.*/

        first = second = Integer.MIN_VALUE;

        for(i = 0; i < arr_size; i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }
            /* If arr[i] is in between first and
           second then update second  */
            else if(arr[i] > second && arr[i] != first){
                second = arr[i];
            }
        }

        if(second == Integer.MIN_VALUE){

            System.out.println("Haven't Second Largest Element");
        }
        else {
            //Log.d("SECOND_LARGEST2 ", ""+second);
            System.out.println("Second Largest Element "+second);
        }

    }

}
