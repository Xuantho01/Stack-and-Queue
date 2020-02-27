
import java.util.EmptyStackException;
import java.util.LinkedList;

public class MygenericStack<E> {
    LinkedList<E> stack;

    public MygenericStack(){
        stack = new LinkedList<>();
    }

    public void push(E elment){
        stack.addFirst(elment);
    }

    public boolean isEmpty(){
        if (stack.size() == 0){
            return true;
        }
        return false;
    }

    public E pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size() {
        return stack.size();
    }

}
