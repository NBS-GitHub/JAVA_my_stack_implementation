import java.util.LinkedList;
import java.util.List;

public class MyStack<T> {

   private List<T> list = new LinkedList<>();

   public T push(T value) {
      list.add(value);
      return value;
   }

   public T pop() {
      T topElement = null;
      if(list.size() > 0)
         topElement = list.remove(list.size() - 1);
      return topElement;
   }

   public T peek() {
      T topElement = null;
      if(list.size() > 0)
         topElement = list.get(list.size() - 1);
      return topElement;
   }

   public int size() {
      return list.size();
   }

   public boolean isEmpty() {
      return list.isEmpty();
   }

   @Override
   public String toString() {
      return "MyStack{" +
            "stack=" + list +
            '}';
   }
}
