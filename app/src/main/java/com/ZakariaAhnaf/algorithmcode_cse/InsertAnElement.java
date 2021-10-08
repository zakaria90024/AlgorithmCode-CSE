package com.ZakariaAhnaf.algorithmcode_cse;

public class InsertAnElement {

    static void InsertAnElement(int arr[],int x,int position, int size){
        int i, n = size;
        /*
            x - inserted Element
            position - inserted position
        */

        // initial array of size 10
        for (i = 0; i < size; i++){
            arr[i]= i+1;
        }

        //original array
        for(i = 0; i < n; i++){
            System.out.printf("%d ", arr[i]);

        }
        System.out.printf("\n");
        n++;//increase size one


        //shift element forward
        for (i = n-1; i >= position; i--){
            arr[i] = arr[i - 1];
        }
        arr[position-1] = x; //inserted

        //print new array

        for (i = 0; i < n; i++){
            System.out.printf("%d ", arr[i]);
        }
        System.out.printf("\n");


    }
}
