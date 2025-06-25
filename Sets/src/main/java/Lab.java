import java.util.HashSet;
import java.util.Set;

/**
 * Sets are unordered collections of elements. Sets do not allow duplicates.
 *
 * Sets are very efficient for storing items that should be unique.
 *
 * You can find more information about HashSet, a common and very efficient implementation of Set, by searching online.
 */
public class Lab {

    /**
     * Instantiate and return a Set of Integers.
     *
     * @return a new Set<Integer> object.
     */
    public Set<Integer> createSet() {
        return new HashSet<>(); // or new TreeSet<>() for sorted set
    }

    /**
     * Return the size of a set.
     * @param set The set that we will be manipulating.
     * @return the size of set. (number of values)
     */
    public int getSize(Set<Integer> set) {
        return set.size();
    }

    /**
     * Add a new, unique item to a set. Sets can only store unique items (no duplicates).
     * @param set The set that we will be manipulating.
     * @param item The item which we will be adding to set.
     */
    public void addUniqueItem(Set<Integer> set, int item) {
        set.add(item); // automatically ignores duplicates
    }

    /**
     * Remove an item from a set.
     * @param set The set that we will be manipulating.
     * @param item The item which we will be removing from set.
     */
    public void removeItem(Set<Integer> set, int item) {
        set.remove(item); // does nothing if item not found
    }
}
