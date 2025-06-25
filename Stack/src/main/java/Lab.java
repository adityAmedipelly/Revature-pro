import java.util.ArrayDeque;
import java.util.Deque;

public class Lab {
    /**
     * Instantiate and return a new stack using ArrayDeque.
     * @return a newly instantiated Deque (stack behavior).
     */
    public Deque<String> createNewStack() {
        return new ArrayDeque<>();
    }

    /**
     * @param stack A Deque of Strings.
     * @return the number of elements in the deque.
     */
    public int getSize(Deque<String> stack) {
        return stack.size();
    }

    /**
     * Push a value to the top of the deque.
     * @param stack A Deque of Strings.
     * @param item a String to be added to the deque.
     */
    public void addToTopOfStack(Deque<String> stack, String item) {
        stack.push(item); // push() adds to the front (top of stack)
    }

    /**
     * Pop the value from the top of the deque and return that value.
     * @param stack A Deque of Strings.
     * @return the value popped from the top of the deque.
     */
    public String removeFromTopOfStack(Deque<String> stack) {
        return stack.pop(); // removes and returns top element
    }

    /**
     * Peek the value at the top of a deque.
     * @param stack A Deque of Strings.
     * @return the value peeked from the top of the deque.
     */
    public String getTopOfStackWithoutRemoving(Deque<String> stack) {
        return stack.peek(); // returns top element without removing
    }
}
