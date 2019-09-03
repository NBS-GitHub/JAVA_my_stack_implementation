import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
   public static void main(String[] args) {

      MyStack<String> stack = new MyStack<>();

      stack.push("John");
      stack.push("Jane");
      stack.push("Daniel");
      stack.push("Susan");
      stack.push("David");
      System.out.println(stack);

      stack.pop();
      System.out.println("Stack after popping: " + stack);

      System.out.println("Peek: " + stack.peek());

      System.out.println("Is empty: " + stack.isEmpty());

      System.out.println("Size: " + stack.size());



   }
}
