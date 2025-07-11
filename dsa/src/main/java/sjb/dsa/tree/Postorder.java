package sjb.dsa.tree;

public class Postorder {
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
	void Postorder()
	{
		Postorder(root);
	}
	void Postorder(TreeNode node)
	{
		if(node!=null)
		{
			Postorder(node.left);
			Postorder(node.right);
			System.out.println(node.data);
		}
	}
public static void main(String[] args) {
		Postorder s=new Postorder();
		s.insert(10);
		s.insert(5);
		s.insert(40);
		s.Postorder();
	}
		}



