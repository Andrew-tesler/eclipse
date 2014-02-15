
public class IntList {
	private IntNode _head;
	
	
	public IntList() {
		this._head = null;
	}
	
	public boolean empty() {
		return this._head == null;
	}
	
	// Add a link at the end of the list
	public void add(IntNode node) {
		if (empty())
			_head = node;
		else {
			IntNode ptr = this._head;
			while ( ptr.getNext() != null)
				ptr = ptr.getNext();
			ptr.setNext(node);
		}
	}

}
