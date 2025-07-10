package sjb.dsa.tree;
public class BST {
	TreeNode root;
	void insert(int value)
	{
	   root=insertNode(root,value);
	}
	TreeNode insertNode(TreeNode node,int value)
	{
		if(node==null)
		{
			node=new TreeNode(value);
			return node;
			   }
		if(value<node.data)
		{
			node.left=insertNode(node.left,value);
		}
		else if(value>node.data)
		{
			node.right=insertNode(node.right,value);
		}
		return node;
	}
	void inorder()
	{
		inordernode(root);
	}
	void inordernode(TreeNode node)
	{
		if(node!=null)
		{
			inordernode(node.left);
			System.out.println(node.data);
			inordernode(node.right);
		}
	}
	public static void main(String[] args) {
		BST b=new BST();
		b.insert(78);
		b.insert(45);
		b.insert(8);
		b.insert(9);
		b.inorder();
	}
		}
