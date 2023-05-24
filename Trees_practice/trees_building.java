package Trees_practice;
import java.util.*;
public class trees_building {
	
	Scanner sc = new Scanner(System.in);
	public class Node 
	{
		int data;
		Node left;
		Node right;
	}
	private Node root; // root itself is a Node i.e it will have its own data value, left value and right value 
	
	private void BT() 
	{
		this.root = createTree();
	}
	private Node createTree() 
	{
	
		int item = sc.nextInt();
		Node n = new Node();
		n.data = item;
		
		boolean leftTree = sc.nextBoolean();
		if(leftTree == true) 
		{
			n.left = createTree(); 
		}
		boolean rightTree = sc.nextBoolean();		
		if(rightTree == true) 
		{
			n.right = createTree(); 
		}
		return n;
	}
	public void display() 
	{
		display(root);
	}
	public void display(Node n) 
	{
		if(root == null) 
		{
			return ;
		}
		
		String s = " ";
		if(n.left != null) 
		{
			s = n.left.data + s; 
		}else
		{
			s = "." + s ;
					
		}
		if(n.right != null)
		{
			s = s + n.right.data; 
		}else 
		{
			s = s + " .";
		}
		System.out.println(s);
		display(n.left);
		display(n.right);
		
	}
	
}
