package tree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeTraversal tree = new TreeTraversal();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		
		System.out.println("Preorder Tree Traversal: ");
		tree.preOrderTraversal(tree.root);
		System.out.println();
		
		System.out.println("Inorder Tree Traversal: ");
		tree.inOrderTraversal(tree.root);
		System.out.println();
		
		System.out.println("PostOrder Tree Traversal: ");
		tree.postOrderTraversal(tree.root);
		System.out.println();
	}

}
