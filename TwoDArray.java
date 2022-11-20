import java.util.*;
public class TwoDArray {
    
      public  static void  printArr(int[][]arr) {
        for(int i=0;i<arr.length;i++)
        {
               for(int j= 0;j<arr[i].length;j++)
               {
                  System.out.print(arr[i][j] + " ");
               }
               System.out.println();
        }
    }

        

     
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
          int[][]arr = new int[2][3];
          for(int i=0;i<arr.length;i++)
          {
                 for(int j=0;j<arr[i].length;j++)
                 {
                    arr[i][j] = scan.nextInt();
                 }
          }
          
          printArr(arr);
          int[][]arrr = new int[2][];
          arrr[0] = new int[3];
          arrr[1]= new int[2];
      }
}
