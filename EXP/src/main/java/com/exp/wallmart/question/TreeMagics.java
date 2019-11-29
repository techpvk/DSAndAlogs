package com.exp.wallmart.question;

import com.exp.tree.Node;
import com.exp.utils.TreeUtils;

public class TreeMagics {

	public static void main(String[] args) {

		Node node = TreeUtils.getTreeSample();

		commonTreeTravels(node);

		System.out.println("Printing right view of tree!!!");
		ViewsOfTree.printRightViewOfTree(node);
		System.out.println("Printing left view of tree!!!");
		ViewsOfTree.printLeftViewOfTree(node);
	}

	private static void commonTreeTravels(Node node) {
		System.out.println("Printing inorder view!!!");
		printInorderView(node);
		System.out.println("Printing pre-order view!!!");
		printPreporderView(node);
		System.out.println("Printing post-order view!!!");
		printPostorderView(node);
	}

	

	private static void printInorderView(Node node) {
		if (node == null) {
			return;
		} else {
			printInorderView(node.getLeft());
			System.out.println("value:" + node.getValue());
			printInorderView(node.getRight());

		}
	}

	private static void printPreporderView(Node node) {
		if (node == null) {
			return;
		} else {
			printPreporderView(node.getLeft());
			printPreporderView(node.getRight());
			System.out.println("value:" + node.getValue());
		}
	}

	private static void printPostorderView(Node node) {
		if (node == null) {
			return;
		} else {
			System.out.println("value:" + node.getValue());
			printPostorderView(node.getLeft());
			printPostorderView(node.getRight());

		}
	}

}
