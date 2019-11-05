
package com.Exercise18LinkedList.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.HashMap;
import java.util.Random;
import java.util.Iterator;

public class LinkedListApp {

	public static void main(String[] args) {
		
		final int ELEMENTS=100;
		
		LinkedList <Byte> mylist = new LinkedList<Byte>();
		ArrayList<Short> myArraylist = new ArrayList<Short>();
		Stack <Integer> miPilita = new Stack<Integer>();
		PriorityQueue <Integer> miColita = new PriorityQueue<Integer>();
		HashMap <Integer, String> myDictionary = new HashMap<Integer, String>();
		
		Random numbers = new Random(System.nanoTime());
		
		mylist.add((byte)5);
		mylist.add((byte) 10);
		mylist.add((byte) 15);
		mylist.add((byte) 20);
		mylist.add((byte) 25);
		mylist.set(0, (byte)2);
		System.out.println(mylist.get(3));
		System.out.println(mylist);
		/*
		System.out.println(mylist.get(1));
		System.out.println(mylist.remove());
		System.out.println(mylist.remove());
		System.out.println(mylist.remove());
		System.out.println(mylist.remove());
		System.out.println(mylist.remove());
		*/
		Byte number = 2;
		System.out.println(mylist.size());
		System.out.println(mylist.isEmpty());
		System.out.println(mylist.contains(2));
		mylist.clear();
		System.out.println(mylist);
		
		for(int i=0; i<ELEMENTS; i++) {
			mylist.add((byte) numbers.nextInt(100));
		}
		System.out.println(mylist);
		
		Iterator myIterator = mylist.iterator();
		while(myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
		
		for(Byte mynumber : mylist) {
			System.out.println(mynumber);
		}
		
		myArraylist.add((short) 5);
		myArraylist.add((short) 10);
		myArraylist.add((short) 15);
		System.out.println(myArraylist);
		
		myArraylist.set(0, (short) 2);
		
		System.out.println(myArraylist.get(2));
		System.out.println(myArraylist);
		System.out.println(myArraylist.remove(2));
		System.out.println(myArraylist);
		
		myIterator = myArraylist.iterator();
		while(myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
		
		for(Short myShort: myArraylist) {
			System.out.println(myShort);
		}

	}

}
