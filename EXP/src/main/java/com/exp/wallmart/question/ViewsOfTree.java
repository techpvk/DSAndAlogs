package com.exp.wallmart.question;

import com.exp.tree.Node;

public final class ViewsOfTree {
	
	private ViewsOfTree() {
		
	}
	static int maxhight = 0;

	public static void printRightViewOfTree(Node node) {
		System.out.println("value:" + node.getValue());
		new ViewsOfTree.RightViewTree().printRightViewOfTree(node,maxhight);
	}

	
	static  class RightViewTree{
	private  void printRightViewOfTree(Node node, int level) {
		if (node == null) {
			return;
		} else {
			if (maxhight < level) {
				maxhight = level;
				System.out.println("value:" + node.getValue());
			}
			printRightViewOfTree(node.getRight(), level + 1);
			printRightViewOfTree(node.getLeft(), level + 1);
		}
	}
	}
	
	
	public static void printLeftViewOfTree(Node node) {
		System.out.println("value:" + node.getValue());
		new ViewsOfTree().new LeftViewTree().printLeftViewOfTree(node,maxhight);
	}
	

	class  LeftViewTree{
	private  void printLeftViewOfTree(Node node, int level) {
		if (node == null) {
			return;
		} else {
			if (maxhight < level) {
				maxhight = level;
				System.out.println("value:" + node.getValue());
			}
			printLeftViewOfTree(node.getLeft(), level + 1);
			printLeftViewOfTree(node.getRight(), level + 1);
		}
	}
	}
}
