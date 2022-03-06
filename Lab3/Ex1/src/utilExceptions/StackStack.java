package utilExceptions;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackStack<T> implements StackIntfWithExceptions<T>
{
    Stack<T> s;
    public StackStack() {
        s = new Stack<>();
    }

    @Override
    public void push(T o) {
        s.push(o);
    }

    @Override
    public T pop() {
        T tmp;
        try {
            tmp = s.pop();
        } catch (Exception e) {
            throw new EmptyStackException();
        }
        return tmp;
    }

    @Override
    public T peek() {
        T tmp;
        try {
            tmp = s.peek();
        } catch (Exception e) {
            throw new EmptyStackException();
        }
        return tmp;
    }

    @Override
    public boolean isEmpty() {
        return s.isEmpty();
    }

    @Override
    public void clear() {
        s.clear();
    }
}
