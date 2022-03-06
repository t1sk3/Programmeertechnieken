package util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * This JUnit Testcase tests all methods of the Stack interface
 * 
 * @author Jeroen Wauters
 * 
 */
public class StackTest {

	private StackIntf<String> myStringStack;
	private StackIntf<Integer> myIntStack;

	/**
	 * Initializes a new Stack object
	 * 
	 * @throws Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		this.myStringStack = new ListStack<>();
		this.myIntStack = new ListStack<>();
	}

	/**
	 * Test pushing elements
	 */
	@Test
	public void testPush() {
		this.myStringStack.push("element1");
		assertEquals("element1", this.myStringStack.peek(), "Unable to push first element on the stack");
		this.myStringStack.push("element2");
		assertEquals("element2", this.myStringStack.peek(), "Unable to push more then one element on the stack");

		this.myIntStack.push(5);
		assertEquals(5, this.myIntStack.peek(), "Unable to push first element on the stack");
		this.myIntStack.push(29);
		assertEquals(29, this.myIntStack.peek(), "Unable to push more then one element on the stack");
	}

	/**
	 * Test popping elements
	 */
	@Test
	public void testPop() {
		this.myStringStack.push("element1");
		this.myStringStack.push("element2");
		assertEquals("element2", this.myStringStack.pop(), "Unable to pop an element from the stack");
		assertEquals("element1", this.myStringStack.pop(), "Unable to pop last element from the stack");
		assertEquals(true, this.myStringStack.isEmpty(), "Stack is not empty after last element is popped");
		assertEquals(null, this.myStringStack.pop(), "Popping an empty stack does not return null");

		this.myIntStack.push(5);
		this.myIntStack.push(29);
		assertEquals(29, this.myIntStack.pop(), "Unable to pop an element from the stack");
		assertEquals(5, this.myIntStack.pop(), "Unable to pop last element from the stack");
		assertEquals(true, this.myIntStack.isEmpty(), "Stack is not empty after last element is popped");
		assertEquals(null, this.myIntStack.pop(), "Popping an empty stack does not return null");
	}

	/**
	 * Test peeking at first element
	 */
	@Test
	public void testPeek() {
		this.myStringStack.push("element1");
		this.myStringStack.push("element2");
		assertEquals("element2", this.myStringStack.peek(), "Unable to peek an element from the stack");
		this.myStringStack.pop();
		assertEquals("element1", this.myStringStack.peek(), "Unable to peek last element from the stack");
		assertEquals(false, this.myStringStack.isEmpty(), "Stack is empty after last element is peeked");

		this.myIntStack.push(5);
		this.myIntStack.push(29);
		assertEquals(29, this.myIntStack.peek(), "Unable to pop an element from the stack");
		this.myIntStack.pop();
		assertEquals(5, this.myIntStack.peek(), "Unable to pop last element from the stack");
		assertEquals(false, this.myIntStack.isEmpty(), "Stack is empty after last element is peeked");
	}

	/**
	 * Test isEmpty
	 */
	@Test
	public void testIsEmpty() {
		this.myStringStack.push("element1");
		this.myStringStack.push("element2");
		this.myStringStack.pop();
		assertEquals(false, this.myStringStack.isEmpty(), "Stack is empty after first element is popped");
		this.myStringStack.pop();
		assertEquals(true, this.myStringStack.isEmpty(), "Stack is not empty after last element is popped");

		this.myIntStack.push(5);
		this.myIntStack.push(29);
		this.myIntStack.pop();
		assertEquals(false, this.myIntStack.isEmpty(), "Stack is empty after first element is popped");
		this.myIntStack.pop();
		assertEquals(true, this.myIntStack.isEmpty(), "Stack is not empty after last element is popped");
	}

	/**
	 * Test clearing stack
	 */
	@Test
	public void testClear() {
		this.myStringStack.push("element1");
		this.myStringStack.push("element2");
		this.myStringStack.clear();
		assertEquals(true, this.myStringStack.isEmpty(), "Stack is not empty after clearing");

		this.myIntStack.push(5);
		this.myIntStack.push(29);
		this.myIntStack.clear();
		assertEquals(true, this.myIntStack.isEmpty(), "Stack is not empty after clearing");
	}
}
