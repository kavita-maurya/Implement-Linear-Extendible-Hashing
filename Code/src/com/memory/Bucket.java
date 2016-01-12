package com.memory;

public class Bucket {
	private int capacity;
	private int[] array;
	private int numOfFreeSpace;
	private Bucket next;
	
	public Bucket(int cap) {
		this.array=new int[cap];
		this.capacity=cap;
		this.numOfFreeSpace=cap;
		this.next=null;
	}

	public Bucket getNext() {
		return next;
	}
	
	public int getNumOfFreeSpace() {
		return numOfFreeSpace;
	}
	
	public int getCapacity() {
		return capacity;
	}
}
