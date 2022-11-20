import java.util.*;

public class Arraylist {
     public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();

         list.add(10);
         list.add(20);
         list.add(50);
         list.add(40);
         System.out.println(list + "->" + list.size());
         list.add(1,1000); // insert at index 1 , without overwriting
         System.out.println(list + "->" + list.size());
         
           int val = list.get(1); // not list[1];

            list.set(1, 4000);
            System.out.println(list + "->" + list.size());
            list.remove(1);
            System.out.println(list + "->" + list.size());


     }
}
