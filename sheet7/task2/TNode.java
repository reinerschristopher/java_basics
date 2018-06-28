package sheet7.task2;

public class TNode {
	private int value;
	private TNode left;
	private TNode right;
	
	public TNode(int value) {		//Konstruktor
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public int getValue() {			//get Funktionen
		return this.value;
	}
	
	public TNode getLeft() {
		return this.left;
	}
	
	public TNode getRight() {
		return this.right;
	}
	
	public void setValue(int value) {	//set Funktionen
		this.value = value;
	}
	
	public void setLeft(TNode left) {
		this.left = left;
	}
	
	public void setRight(TNode right) {
		this.right = right;
	}
}
