/**Linked List Node implementation**/

class Link<E> {
	
	private E element; // Element value for a single node
	private Link<E> next; //Next pointer
	

	//Constructors//
	Link(E inputValue, Link<E> pointer){
		
		element = inputValue;
		next = pointer; // Pointer to the next Element
		
	}
	
	
	Link(Link<E> pointer){
		
		next = pointer;
		
	}
	
	
	
	Link<E> next(){
		
		return next;
		
	}
	
	
	Link<E> setNext(Link<E> nextValue){
		
		return next = nextValue;
		
	}
	
	
	// Get the value of the element
	E currentElement() {
		
		return element;
	}
	
	// Set the value of the element
	
	E setCurrentElement(E inputValue) {
		
		return element = inputValue;
		
	}
	
	
}
