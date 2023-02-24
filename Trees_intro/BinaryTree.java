package Trees_intro;

import java.util.Scanner;

public class BinaryTree {
		
	Scanner sc = new Scanner(System.in);
	public class Node
	{
		int data;
		Node left;
		Node right;
	}
	private Node root;
	
		public BinaryTree() 
		{
			this.root = CreateTree(); // createTree() will create a tree 
		}
		
		public Node CreateTree() 
		{
			int item = sc.nextInt();
			Node n = new Node();
			n.data = sc.nextInt();
			
			boolean left = sc.nextBoolean();
			if(left == true) 
			{
				n.left = CreateTree();
			}
			boolean right = sc.nextBoolean();
			if(left == true) 
			{
				n.right = CreateTree();
			}
			return n;
		}
		
		public void display(Node nn) 
		{	
			if(nn == null) 
			{
				return;
			}
			String s = "";
			s = "<--" + nn.data + "-->";
			
	// checking if left is not null or empty then we will print that data		
			if(nn.left != null) 
			{
				s = s + nn.left.data;
			}else 
			{
				s = "." + s;
			}
			// checking if right is not null or empty then we will print that data		
				
			if(nn.right != null) 
			{
				s = s + nn.right.data;
			}else 
			{
				s =  s + ".";
			}
			System.out.println(s);
			display(nn.left);
			display(nn.right);
		}
		
//  PREORDER - node is first so it will calculate like NODE --> LEFT --> RIGHT ( NLR )
//  POSTORDER - node is LAST so it will calculate like LEFT --> RIGHT --> NODE ( LRN )
//  INORDER - node is in between so it will calculate like  LEFT-->NODE  --> RIGHT ( LNR )

		public void Preorder() 
		{
			Preorder(root);
			System.out.println();
		}
		public void Preorder(Node nn) 
		{
			if(nn == null) 
			{
				return;
			}

			System.out.println(nn.data);
			Postorder(nn.left);
			Postorder(nn.right);
		}
		
		public void Postorder() 
		{
			Postorder(root);
			System.out.println();
		}
		public void Postorder(Node nn) 
		{
			if(nn == null) 
			{
				return;
			}
			Postorder(nn.left);
			Postorder(nn.right);
			System.out.println(nn.data);
		}
		
		public void Inorder() 
		{
			Inorder(root);
			System.out.println();
		}
		public void Inorder(Node nn) 
		{
			if(nn == null) 
			{
				return;
			}
			Postorder(nn.left);
			System.out.println(nn.data);
			Postorder(nn.right);
		
		}
		
		public int heightBT() 
		{
			return heightBT(this.root);
		}
		public int heightBT(Node nn) 
		{
			if(nn == null ) 
			{
				return -1;
			}
			int left = heightBT(nn.left);

			int right = heightBT(nn.right);
			
			return Math.max(left, right) +1;
		}




}
