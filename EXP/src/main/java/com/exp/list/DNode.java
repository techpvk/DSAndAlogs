package com.exp.list;

public class DNode {
	private int value;
	private DNode previous;
	private DNode next;

	public DNode(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public DNode getPrevious() {
		return previous;
	}

	public void setPrevious(DNode previous) {
		this.previous = previous;
	}

	public DNode getNext() {
		return next;
	}

	public void setNext(DNode next) {
		this.next = next;
	}

}
