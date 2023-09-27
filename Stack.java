/**A simple stack ADT**/

public interface Stack<E> {
	
	// Freeing up space
	public void clear();
	
	
	public void push(E anElement);
	
	public E pop();

	
	//Return a copy of the top element
	public E topValue();
	
	public int length();
	
}
