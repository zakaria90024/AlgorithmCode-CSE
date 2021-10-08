package com.ZakariaAhnaf.algorithmcode_cse;

public class DeleteAnElement {
    static int DeleteAnElement(int arr[], int n, int x)
    {
        // Search x in array
        int i;
        for (i=0; i<n; i++)
            if (arr[i] == x)
                break;

        // If x found in array
        if (i < n)
        {
            // reduce size of array and move all
            // elements on space ahead
            n = n - 1;
            for (int j=i; j<n; j++)
                arr[j] = arr[j+1];
        }
        return n;

    }

}
