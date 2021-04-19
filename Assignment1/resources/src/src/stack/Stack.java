package stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack {
    List<Integer> stack_ = new ArrayList<>();

    public boolean isEmpty() {
        return stack_.size() == 0;
    }

    public int getSize() {
        return stack_.size();
    }

    public void push(int i) {
        stack_.add(i);
    }

    public int search(int i) {
        if(stack_.lastIndexOf(i) == -1)
            return -1;
        return stack_.size() - stack_.lastIndexOf(i) - 1;
    }

    public int pop() {
        validateEmptyStack();
        return stack_.remove(getSize() - 1);
    }

    private void validateEmptyStack() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
    }
}
