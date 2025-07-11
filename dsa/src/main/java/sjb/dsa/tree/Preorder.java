package sjb.dsa.tree;

public class Preorder {
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
	void Preorder()
	{
		Preordernode(root);
	}
	void Preordernode(TreeNode node)
	{
		if(node!=null)
		{
			System.out.println(node.data);
			Preordernode(node.left);
			Preordernode(node.right);
		}
	}
	public static void main(String[] args) {
		Preorder p=new Preorder();
		p.insert(10);
		p.insert(5);
		p.insert(40);
		p.Preorder();

}
}