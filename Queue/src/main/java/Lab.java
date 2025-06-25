import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Lab {
    /**
     * Instantiate and return some type of Deque, which is a class that contains Queue and Stack functionality.
     * @return an instantiated Deque.
     */
    public Deque<String> createQueue() {
        return new ArrayDeque<>();
    }

    /**
     * Return the size of a queue.
     * @param queue a Queue<String> object.
     * @return the length of queue.
     */
    public int getSize(Queue<String> queue) {
        return queue.size();
    }

    /**
     * Add an item to the end of the queue.
     * @param queue a Queue<String> object.
     * @param item a String that should be added to Queue.
     */
    public void addToEndOfQueue(Queue<String> queue, String item) {
        queue.add(item); // or queue.offer(item);
    }

    /**
     * Remove an item from a queue, and return the removed item.
     * @param queue a Queue<String> object.
     * @return the next String due to be removed (polled) from the Queue<String>.
     */
    public String removeFromStartOfQueue(Queue<String> queue) {
        return queue.poll(); // poll() returns null if the queue is empty
    }

    /**
     * Return the next item from a queue which is due to be removed, but do not remove it.
     * @param queue a Queue<String> object.
     * @return the next String due to be removed (peeked) from the Queue<String>.
     */
    public String getStartOfQueueWithoutRemoving(Queue<String> queue) {
        return queue.peek(); // peek() returns null if the queue is empty
    }
}
