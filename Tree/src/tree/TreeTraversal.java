package tree;

public class TreeTraversal {

	Node root;
	
	TreeTraversal()
	{
		root = null;
	}
	
	void preOrderTraversal(Node node)
	{
		if(node == null)
			return;
		
		System.out.print(node.data+" ");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}
	
	void inOrderTraversal(Node node)
	{
		if(node == null)
			return;
		
		inOrderTraversal(node.left);
		System.out.print(node.data+" ");
		inOrderTraversal(node.right);
	}
	
	void postOrderTraversal(Node node)
	{
		if(node == null)
			return;
		
		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.print(node.data+" ");
	}
}
