import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("A");

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        System.out.println(stack.peek());

    }
}
