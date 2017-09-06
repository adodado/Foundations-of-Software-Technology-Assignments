package acown09_assign1;
/*
 * QueueInterface.java
 * Updated with exceptions 9 sep 2015
 */

import java.util.Iterator;
import java.lang.IndexOutOfBoundsException;


public interface QueueInterface {

	    /** Current queue size. */
	    int size();
	    
	    /** True if queue is empty. */
	    boolean isEmpty();
	    
	    /** Add element at end of queue. */
	    void enqueue(Object element);
	    
	    /** Return and remove first element. */
	    Object dequeue() throws IndexOutOfBoundsException;
	    
	    /** Return (without removing) first element. */
	    Object first() throws IndexOutOfBoundsException;
	    
	    /** Return (without removing) last element. */
	    Object last() throws IndexOutOfBoundsException;

	    /** Return "true" if this queue contains the specified element. */
	    boolean contains(Object o);
	    
	    Iterator iterator();                 // element iterator
	
}

