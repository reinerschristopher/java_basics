package sheet7.task2;

public class Tree {
	private TNode root;
	
	public Tree() {					//Konstruktoren
		this.root = null;
	}
	
	public Tree(TNode root) {
		this.root = root;
	}
	
	public TNode getRoot() {		// get und set für Root
		return this.root;
	}
	
	public void setRoot(TNode root) {
		this.root = root;
	}
	
	public void inorder() {
		if(this.root.getLeft() != null) {
			Tree l = new Tree(this.root.getLeft());
			l.inorder();
		}
		
		if(this.root != null) {
			System.out.println( this.root.getValue() );
		}
		
		if(this.root.getRight() != null) {
			Tree r = new Tree(this.root.getRight());
			r.inorder();
		}
	}
	
	public void preorder() {
		if(this.root != null) {
			System.out.println( this.root.getValue() );
		}
		
		if(this.root.getLeft() != null) {
			Tree l = new Tree(this.root.getLeft());
			l.preorder();
		}
		
		if(this.root.getRight() != null) {
			Tree r = new Tree(this.root.getRight());
			r.preorder();
		}
	}
	
	public void postorder() {
		if(this.root.getLeft() != null) {
			Tree l = new Tree(this.root.getLeft());
			l.postorder();
		}
		
		if(this.root.getRight() != null) {
			Tree r = new Tree(this.root.getRight());
			r.postorder();
		}
		
		if(this.root != null) {
			System.out.println( this.root.getValue() );
		}
	}
}
