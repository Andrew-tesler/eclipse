
public class IntNode {
	private int _value;
	private IntNode _next;
	
	
	public IntNode (int val, IntNode n) {
		this._value = val;
		this._next = n;
	}
	
	
	public IntNode getNext() {
		return this._next;
	}
	
	public void setNext (IntNode node) {
		this._next = node;
	}

}
