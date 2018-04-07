package com.shailu.stackimpl;


public class Stack<E> {

	private Object[] data;
	private int top = -1;
	private int size;

	public Stack() {

		this.data = new Object[10];
	}

	public void push(E element) {

		if (size > data.length-1)
			throw new StackOverFlowException("Stack is Full..");

		data[++top] = element;
		size++;

	}

	public E pop() {

		E obj;

		if (isEmpty())
			throw new EmptyStackException("Stack Does not have data...");

		obj = (E) data[top];
		data[top] = null;
		size--;
		top--;
		return obj;

	}

	public boolean isEmpty() {
		return size <= 0;
	}

	
	public E topElement() {

		return (E) data[top];
	}

}
