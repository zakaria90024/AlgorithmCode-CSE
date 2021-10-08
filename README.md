# AlgorithmCode-CSE
    //Second Largest Element - 2 Way
    >>> Class - https://github.com/zakaria90024/AlgorithmCode-CSE/blob/32a7415d4d1a1430bc831572159906b0c476ca81/app/src/main/java/com/ZakariaAhnaf/algorithmcode_cse/SecondLargestElement.java
    
    >>> Call Method - https://github.com/zakaria90024/AlgorithmCode-CSE/blob/32a7415d4d1a1430bc831572159906b0c476ca81/app/src/main/java/com/ZakariaAhnaf/algorithmcode_cse/MainActivity.java


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
     
     
     
