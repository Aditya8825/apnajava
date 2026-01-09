import java.util.*;

class Insertionsort {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("sortedarray");
    }

    public static void main(String[] args) {
        int[] arr = { 8, 7, 5, 23, 1 };

        // selectionsort
        for (int i = 0; i < arr.length ; i++) {
         int current  =arr[i];
         int  j=i-1;
                 while(j>= 0 && current <arr[j]){
                    arr[j+1]=arr[j];
                    j--;
                 }
                 //placement
                 arr[j+1]=current;
                    }
                    printArray(arr);
                }
               
                }
              