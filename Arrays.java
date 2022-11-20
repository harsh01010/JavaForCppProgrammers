import java.util.*;
public class Arrays {
       public static void fucn(int[]arr)
       {
          for(int i=0;i<arr.length;i++)
           {
               System.out.print(arr[i]+" ");
           }
       }
       public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

         int[] arr = new int[10]; // default value 0
         // func(int[] arr)
         System.out.println("enter 10 numbers for the array");
         for(int i=0;i<10;i++)
         {
               arr[i] = scn.nextInt();
         }
           fucn(arr);
       }
}
