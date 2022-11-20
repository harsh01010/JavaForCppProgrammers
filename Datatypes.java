import java.util.*;;
public class Datatypes {
    
      /*
       *  byte  1 byte
       * short  2 bytes
       * int  4 bytes
       * long 8 bytes
       * char 2 bytes
       * float    4 bytes
       * double   8 bytes
       * boolean true or false
       */
       // no pointers in c++ , we have to create global variables with respect to class
       static int a = 5;
        static int b = 6;
       public static void fun()
       {
          int temp = a;
           a = b;
           b = temp;

       }
       public static void main(String[] args) {
        
       }
}
