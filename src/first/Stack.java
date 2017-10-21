package first;

public interface Stack {
    Object pop();
    Object peek();
    void push(Object e);
    void clear();
    int size();
    boolean isEmpty();
}
