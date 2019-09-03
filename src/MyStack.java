import java.util.LinkedList;
import java.util.List;

public class MyStack<T> {

   private List<T> list = new LinkedList<>();

   public T push(T value) {
      list.add(value);
      return value;
   }

   public T pop() {
      return list.remove(list.size() - 1);
   }

   public T peek() {
      return list.get(list.size() - 1);
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
