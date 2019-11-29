package com.exp.wallmart.question;

import com.exp.list.LNode;
import com.exp.utils.LinkedListUtils;

public class LinkedListMagic {

	public static void main(String[] args) {
		
		//problem 1: print in fwd and reverse order {not asked added just for reference}
		LNode node = LinkedListUtils.getLinkedListSmallSample();
		System.out.println("print - linked list!!!!");
		linkedListIteration(node);
		System.out.println("print - linked list in reverse order!!!!");
		linkedListReversal(node);

		// 2. https://www.geeksforgeeks.org/add-1-number-represented-linked-list/
		System.out.println("Add a number represented in linked list");
		LNode getsum = LinkedListUtils.getLinkedListSmallSampleLikeDigit();
		linkedListIteration(getsum);
		AdditionInLinkedList.perform(getsum, 1);
		linkedListIteration(getsum);

	}

	static class AdditionInLinkedList {

		private AdditionInLinkedList() {

		}

		private static int perform(LNode node, int addwith) {

			if (node == null) {
				return 0;
			}
			if (node.getNext() == null) {
				int result = node.getValue() + addwith;
				node.setValue(result % 10);
				return result / 10;
			} else {
				int result = node.getValue() + perform(node.getNext(), addwith);
				node.setValue(result % 10);
				return result / 10;
			}
		}
	}

	private static void linkedListIteration(LNode node) {

		if (node == null) {
			return;
		}
		do {
			System.out.print(node.getValue() + " ");
			node = node.getNext();
		} while (node != null);
		System.out.println("");
	}

	private static void linkedListReversal(LNode node) {

		if (node == null) {
			return;
		}
		linkedListReversal(node.getNext());
		System.out.println(node.getValue());

	}
}
