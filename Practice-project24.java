package com;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(1, 100);
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		ll.addFirst(1);
		ll.addLast(2);
		System.out.println(ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		ll.remove(new Integer(10));
		System.out.println(ll);
		
		

	}

}
