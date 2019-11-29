package com.exp.utils;

import com.exp.list.LNode;

public class LinkedListUtils {

	public static LNode getLinkedListSmallSample() {

		LNode start = new LNode(10);
		start.setNext(new LNode(20));
		start.getNext().setNext(new LNode(30));
		start.getNext().getNext().setNext(new LNode(40));
		start.getNext().getNext().getNext().setNext(new LNode(50));
		start.getNext().getNext().getNext().getNext().setNext(new LNode(60));
		start.getNext().getNext().getNext().getNext().getNext().setNext(new LNode(70));
		return start;
	}

	public static LNode getLinkedListSmallSampleLikeDigit() {

		LNode start = new LNode(1);
		start.setNext(new LNode(9));
		start.getNext().setNext(new LNode(9));
		start.getNext().getNext().setNext(new LNode(9));
		start.getNext().getNext().getNext().setNext(new LNode(9));
		start.getNext().getNext().getNext().getNext().setNext(new LNode(9));
		start.getNext().getNext().getNext().getNext().getNext().setNext(new LNode(9));
		return start;
	}
}
