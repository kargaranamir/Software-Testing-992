package test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stack.Stack;

import java.util.EmptyStackException;


public class StackTest {
    private Stack stack;

    @BeforeEach
    public void setUp() {
        stack = new Stack();
    }

    @Test
    @DisplayName("Empty stack should have zero size")
    public void emptyStackShouldHaveZeroSize() {
        Assertions.assertTrue(stack.isEmpty());
        Assertions.assertEquals(0, stack.getSize());
    }

    @Test
    @DisplayName("Push one element to stack")
    public void pushOneElementToStack() {
        stack.push(3);
        Assertions.assertEquals(1, stack.getSize());
        Assertions.assertFalse(stack.isEmpty());
    }

    @Test
    @DisplayName("Push multiple elements to stack")
    public void pushMultipleElementsToStack() {
        stack.push(5);
        stack.push(3);
        Assertions.assertEquals(2, stack.getSize());
    }

    // TestCase 1
    // Characteristics : Whether element is first in the stack : True/False
    @Test
    @DisplayName("Whether element is first in the stack")
    public void searchElementWhileElementIsFirstEntryInStack() {
        stack.push(5);
        stack.push(3);
        stack.push(3);
        stack.push(9);
        Assertions.assertEquals(0, stack.search(9));
    }

    // TestCase 2
    // Characteristics : Whether element is last in the stack : True/False
    @Test
    @DisplayName("Whether element is last in the stack")
    public void searchElementWhileElementIsLastEntryInStack() {
        stack.push(5);
        stack.push(3);
        stack.push(9);
        Assertions.assertEquals(2, stack.search(5));
    }

    // TestCase 3
    // Characteristics : Whether element is in stack : True/False
    @Test
    @DisplayName("Is element is in stack : False")
    public void searchOnceElementIsNotInStack() {
        stack.push(5);
        stack.push(3);
        stack.push(7);
        stack.push(9);;
        Assertions.assertEquals(-1, stack.search(1));
    }

    // TestCase 4
    // Characteristics : Whether the stack is empty : True/False
    @Test
    @DisplayName("Is Stack Empty : True")
    public void searchOnceStackIsEmpty() {
        Assertions.assertEquals(-1, stack.search(2));
    }

    // TestCase 5
    // Characteristics : Whether element is last in the stack : True/False
    @Test
    @DisplayName("Search if stack size is one")
    public void searchElementWhileStackSizeIsOne() {
        stack.push(5);
        Assertions.assertEquals(0, stack.search(5));
    }

    // TestCase 8
    // Characteristics : Whether Element is in stack : True/False
    @Test
    @DisplayName("Is element is in stack : True")
    public void searchOnceElementIsInStack() {
        stack.push(5);
        stack.push(3);
        stack.push(7);
        stack.push(9);
        Assertions.assertEquals(1, stack.search(7));
    }

    @Test
    @DisplayName("Pop one element from empty Stack should Throw Exception")
    public void popOneElementFromEmptyStack() {
        Assertions.assertThrows(EmptyStackException.class, stack::pop);
    }

    @Test
    @DisplayName("Push multiple elements and pop multiple elements from stack when the number of pushes is greater than that of pops")
    public void pushMultipleElementsAndPopMultipleElementsFromStackWhenTheNumberOfPushesIsGreaterThanThatOfPops() {
        stack.push(3);
        stack.push(5);
        stack.push(1);
        Assertions.assertEquals(1, stack.pop());
        Assertions.assertEquals(2, stack.getSize());
        Assertions.assertFalse(stack.isEmpty());
    }

    @Test
    @DisplayName("Push multiple elements and pop multiple elements from stack when the number of pops is greater than that of pushes")
    public void pushMultipleElementAndPopMultipleElementsFromStackWhenTheNumberOfPopsIsGreaterThanThatOfPushes() {
        stack.push(4);
        stack.push(1);
        stack.pop();
        stack.pop();
        Assertions.assertEquals(0, stack.getSize());
        Assertions.assertTrue(stack.isEmpty());
        Assertions.assertThrows(EmptyStackException.class, stack::pop);

    }


}