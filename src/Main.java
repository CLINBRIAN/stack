import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add("third");
        stack.add("second");
        stack.add("first");

       // System.out.println(stack); //prints all the elements of the stack from the top
       // System.out.println(stack.pop());  //remove the first element of the stack which is first
       // System.out.println(stack.push("last")); // to add another element o top of the bstack
       // System.out.println(stack);
       // System.out.println(stack.peek()); //to get the bottom element

        System.out.println(stack.clone());;


    }
}