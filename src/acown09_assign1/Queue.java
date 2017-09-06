package acown09_assign1;

import java.util.Iterator;

/**
 * Created by: Admir Cosic, 2017-08-29
 * Last changed by: Admir Cosic, 2017-08-31
 *
 * Exercise 14: Queue
 */

public class Queue implements QueueInterface {
	private int size;
	private Node head;
	private Node tail;
	
	@Override
	public int size() {
		return size;
	}
	
	/** Check if the queue is empty. */
	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	
	/** Add a new object at the end of the queue. */
	@Override
	public void enqueue(Object object) {
		if(head == null) {
			head = new Node(object);
			tail = head;
		}
		else {
			tail.setNext(new Node(object));
			tail = tail.getNext();
		}
		size++;
	}
	
	/** Return and remove the first object in the queue. */
	@Override
	public Object dequeue() {
		if(head == null) {
			throw new IndexOutOfBoundsException();
		}
		else {
			Node nodeToBeRemoved = head;
			head = nodeToBeRemoved.getNext();
			
			size--;
			return nodeToBeRemoved.getObject();
		}
	}
	
	/** Return first object in the queue (head). */
	@Override
	public Object first() {
		if(head == null) {
			throw new IndexOutOfBoundsException();
		}
		else {
			return head.getObject();
		}
	}
	
	/** Return last object in the queue (tail). */
	@Override
	public Object last() {
		if(head == null) {
			throw new IndexOutOfBoundsException();
		}
		else {
			return tail.getObject();
		}
	}
	
	/** Check if the queue contains a specific object. */
	@Override
	public boolean contains(Object object) {
		Iterator<Object> iterator = iterator();
		
		while(iterator.hasNext()) {
			if(iterator.next() == object) {
				return true;
			}
		}
		return false;
	}
	
	/** Returns a new ListIterator. */
	@Override
	public Iterator iterator() {
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator<Object> {
        private Node node = head;
        
        @Override
        public boolean hasNext() {
            return node != null;
        }
        
        @Override
        public Object next() {
        	
        	if(node == null){
        		throw new IndexOutOfBoundsException();
        	}
        	else{
        		Object object = node.getObject();
                node = node.getNext();
                return object;
        	}
        }
    }
	
	private class Node {
		private Node _next;
		private Object _object;
		
		public Node(Object object) {
			_object = object;
		}
		
		public Object getObject() {
			return _object;
		}
		
		public void setNext(Node object) {
			_next = object;
		}
		
		public Node getNext() {
			return _next;
		}
	}
}