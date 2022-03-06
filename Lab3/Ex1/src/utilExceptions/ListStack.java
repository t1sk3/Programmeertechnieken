package utilExceptions;

import util.StackIntf;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ListStack<T> implements StackIntfWithExceptions<T>
{
    ArrayList<T> s;
    public ListStack() {
        s = new ArrayList<>();
    }

    @Override
    public void push(T o) {
        s.add(o);
    }

    @Override
    public T pop() {
        T tmp;
        if (s.size() > 0) {
            tmp = s.get(s.size()-1);
            s.remove(s.size()-1);
            return tmp;
        }
        throw new EmptyStackException();
    }

    @Override
    public T peek() {
        if (s.size() > 0) {
            return s.get(s.size()-1);
        }
        throw new EmptyStackException();
    }

    @Override
    public boolean isEmpty() {
        return (s.size() == 0);
    }

    @Override
    public void clear() {
        while (s.size() > 0) {
            s.remove(0);
        }
    }
}
