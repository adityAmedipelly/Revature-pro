public class GenericExercise<T> {
    T data;

    /**
     * Set the variable 'data' to the variable 'in'.
     * @param in an Object that will be of type T at runtime.
     */
    public void loadGenericItem(T in){
        this.data = in;
    }

    /**
     * @return T data. The type of Data will again be set when the GenericExercise object is created (at runtime).
     */
    public T returnGenericItem(){
        return this.data;
    }
}
