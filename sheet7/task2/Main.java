package sheet7.task2;

public class Main {
	public static void main(String[] args) {
		Tree t = new Tree(new TNode(10));		//erstellen des Baums
		t.getRoot().setLeft(new TNode(5));
		t.getRoot().getLeft().setLeft(new TNode(3));
		t.getRoot().getLeft().getLeft().setRight(new TNode(4));
		t.getRoot().getLeft().setRight(new TNode(7));
		t.getRoot().setRight(new TNode(12));
		t.getRoot().getRight().setRight(new TNode(15));
		t.getRoot().getRight().getRight().setLeft(new TNode(13));
		
		t.inorder();
		System.out.println();
		t.preorder();
		System.out.println();
		t.postorder();
	}
}
