package com.exp.utils;
import com.exp.tree.Node;

public  class TreeUtils {
	
	private TreeUtils() {
		
	}
	
	/**
	 * 
	 * @return
	 */
	public static Node getTreeSample() {
				//Tree structure:
				//							--
				//							|9|
				//							--
				//						/	     \
				//					 7  	      12
				//				  / 	\		 /  \ 
				//				2         8     11   13
				//            /   \      /     /       
				//			1     4    6      10         
				//               / \
				//              3    5 
				
				Node root=new Node(9);
				root.setLeft(new Node(7));
				root.getLeft().setLeft(new Node(2));
				root.getLeft().getLeft().setLeft(new Node(1));
				root.getLeft().getLeft().setRight(new Node(4));
				root.getLeft().getLeft().getRight().setLeft(new Node(3));
				root.getLeft().getLeft().getRight().setRight(new Node(5));
				root.getLeft().setRight(new Node(8));
				root.getLeft().getRight().setLeft(new Node(6));
				root.setRight(new Node(12));
				root.getRight().setLeft(new Node(11));
				root.getRight().setRight(new Node(13));
				root.getRight().getLeft().setLeft(new Node(10));
			
	return root;
	}

}
