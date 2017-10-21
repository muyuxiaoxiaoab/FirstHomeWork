package first;

import java.util.LinkedList;

public class LinkStack implements Stack{
	private LinkedList<Object> L = new LinkedList<Object>();
	@Override
	public Object pop() {
		if (isEmpty()) {
			return null;
		}
		return L.removeFirst();	
	}

	@Override
	public Object peek() {
		if(isEmpty()) {
			return null;
		}
		return L.getFirst();	
	}

	@Override
	public void push(Object e) {
		L.addFirst(e);
	}

	@Override
	public void clear() {
		L.clear();
	}

	@Override
	public int size() {
		return L.size();
	}

	@Override
	public boolean isEmpty() {
		return L.isEmpty();
	}
	

}
