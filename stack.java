import java.util.Stack;

public class stack {
        public static void main(String[] args) {
               Stack<Integer> st = new Stack<>();

               st.push(10);
               st.push(40);
               st.push(80);
               
            System.out.println(st.pop()); // returns and delets
            
            System.out.println(st.peek()); 
            
        }
}
