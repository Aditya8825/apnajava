 import java.util.*;

 import java.util.Scanner;

 public class array{
    public static void main(String[] args) {

        //sum of all elemnt in array,,,,,,,,,,,,,,,
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the size of arra: ");
//         int n=sc.nextInt();
//         int []arr=new int[n];
//         int sum=0;

//         System.out.println("enter the elemnts:");
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//             sum+=arr[i];
//         }
//         System.out.println("sum="+sum);
//     }
//  }


//find the maximum element in array,,,,,,,,,,,,,,,,
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the size of array:");
// int n=sc.nextInt();

// int []arr=new int[n];

// System.out.println("enter the element of array:");
// for(int i=0; i<n; i++){
//     arr[i]=sc.nextInt();    
// }
// int max=arr[0];
//  for(int i=1; i<n; i++){
//     if(arr[i]>max){
//         max=arr[i];
//     }
//  }
//  System.out.println("max element:"+max);
// }}

//to find the minimum elemnt in array,,,,,,,,,,,,,
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the size of array:");
// int n=sc.nextInt();

// int []arr=new int[n];

// System.out.println("enter the element of array:");
// for(int i=0; i<n; i++){
//     arr[i]=sc.nextInt();    
// }
// int minimum=arr[0];
//  for(int i=1; i<n; i++){
//     if(arr[i]<minimum){
//         minimum=arr[i];
//     }
//  }
//  System.out.println("max element:"+minimum);
// }}

//to find the number of even and odd element in array,,,,,,,,,,,,,,
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the size of array:");
// int n=sc.nextInt();

// int[]arr=new int[n];
// int even=0;
// int odd=0;

// System.out.println("enter the element of array:");
// for(int i=0;  i<n; i++){
//     arr[i]=sc.nextInt();
//     if(arr[i]%2==0)
//     even++;
//     else
//         odd++;
// }
// System.out.println("even:"+even+",odd:"+odd);
//     }}

//to find the number present in array or not,,,,,,,,,,,,,,,,,,,,,,,,
// 

 
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter size of array: ");
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];
    //     System.out.println("Enter elements:");
    //     for (int i = 0; i < n; i++) {
    //         arr[i] = sc.nextInt();
    //     }
    //     System.out.print("Enter number to search: ");
    //     int x = sc.nextInt();
    //     boolean found = false;
    //     for (int val : arr) {
    //         if (val == x) {
    //             found = true;
    //             break;
    //         }
    //     }
    //     if (found)
    //         System.out.println(x + " is present in the array.");
    //     else
    //         System.out.println(x + " is not present in the array.");
    // }}
 

    //revese thhe element of array
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

           System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();}

             System.out.println("reversed array:");
             for(int i=n-1; i>=0; i--){
                System.out.print(arr[i]+" ");
             }}}