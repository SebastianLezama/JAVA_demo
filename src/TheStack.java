import java.util.Stack;

public class TheStack {
  public static void main(String[] args) {
    // can be List<> name = new Stack() with list methods
    Stack<Integer> stack = new Stack<>();
    stack.push(3);
    stack.push(2);
    stack.push(1);
    System.out.println(stack.peek());
    System.out.println(stack.size());
    System.out.println(stack.pop());
    System.out.println(stack.empty());
    System.out.println(stack);
  }
}
