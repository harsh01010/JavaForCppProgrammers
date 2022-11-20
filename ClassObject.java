import java.util.*;

public class ClassObject {
       
      public static class point{

           int x , y;

      }

      public static class rectangle{
         point tl, br;
      }
      public static void main(String[] args) {
             
        rectangle rec = new rectangle();
        rec.tl = new point();
        rec.br = new point();
      }
}
