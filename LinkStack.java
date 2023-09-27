
class ListStack<E> implements Stack<E>{

	// data members
	private Link<E> top;
	private int sizeOfStack;
	
	
	
	//Constructors
	public ListStack() {
		
		top = null;
		sizeOfStack = 0;
		
	}
	
	// Constructor given someone mistakenly provides a value
	// Not compulsory
	public ListStack(int size) {
		
		top = null;
		sizeOfStack = 0;
		
	}
	
	
	
	
	 
	
	
	@Override
	public void clear() {
		//Clear the stack and make it ready
		
		top = null;
		sizeOfStack = 0;
		
	}

	@Override
	public void push(E anElement) {
		// Reinitialize the stack
		
		top = new Link<E>(anElement, top);
		sizeOfStack++;
		
	}

	@Override
	public E pop() {
		
		assert top != null : "Stack is empty";
		
		E previousTopElement = top.currentElement();
		
		top = top.next();
		
		return previousTopElement;
	}

	
	@Override
	public E topValue() {
		
		assert top != null : "Stack is empty";
		
		return top.currentElement();
	}
	
	
	
	@Override
	
	// Getter method
	public int length() {
		
		return sizeOfStack;
	
	}

	
	

}
