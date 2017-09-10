package acown09_assign1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by: Admir Cosic, 2017-08-29
 * Last changed by: Admir Cosic, 2017-09-10
 *
 * Exercise 14: Queue
 */

public class QueueMain {
	public static void main(String[] args) {
		Queue queue = new Queue();
		int amountOfElements = 10;
		int testValue1 = 6;
		int testValue2 = 0;
		for(int i = 0; i < amountOfElements; i++) {
			queue.enqueue(i);
		}		
		ArrayList<String> testResults = new ArrayList<String>();
		testResults.add("-------------------------------------------------------------------------------------------");
		testResults.add("Tests setup:");
		testResults.add("\n");
		String queueIterator = "Values in queue: ";
		Iterator<Object> iterator = queue.iterator();
		while(iterator.hasNext()){
			queueIterator += iterator.next() + ", ";
		}
		testResults.add(queueIterator);
		testResults.add("\n");
		testResults.add("-------------------------------------------------------------------------------------------");
		testResults.add("Queuesize: " + queue.size());
		try {
			testResults.add("\n");
			testResults.add("Test: First method.");
			testResults.add("\n");
			testResults.add("First value in queue: " + queue.first());
			testResults.add("\n");
			testResults.add("-------------------------------------------------------------------------------------------");
		}
		catch(Exception e){
			System.out.println("Error: exception probably because queue is empty: " + e.getMessage());
		}
		try {
			testResults.add("\n");
			testResults.add("Test: Last method.");
			testResults.add("\n");
			testResults.add("Last value in queue: " + queue.last());
			testResults.add("\n");
			testResults.add("-------------------------------------------------------------------------------------------");
		}
		catch(Exception e){
			System.out.println("Error: exception probably because queue is empty: " + e.getMessage());
		}
		try {
			testResults.add("\n");
			testResults.add("Test: Dequeue method.");
			testResults.add("\n");
			testResults.add("Dequeue response: " + queue.dequeue());
			testResults.add("\n");
			testResults.add("First value is now: " + queue.first());
			testResults.add("\n");
			testResults.add("Last value is now: " + queue.last());
			testResults.add("\n");
			testResults.add("-------------------------------------------------------------------------------------------");
		}
		catch(Exception e){
			System.out.println("Error: exception probably because queue is empty: " + e.getMessage());
		}
		testResults.add("\n");
		testResults.add("Test: Contains method.");
		testResults.add("\n");
		testResults.add("Contains method test value='6' : " + queue.contains(testValue1));
		testResults.add("\n");
		testResults.add("Contains method test value='0' : " + queue.contains(testValue2));
		testResults.add("\n");
		testResults.add("-------------------------------------------------------------------------------------------");
		testResults.add("\n");
		testResults.add("Test: Dequeue until empty test");
		while(!queue.isEmpty()){
			testResults.add("\n");
			testResults.add("Dequeue result: " + queue.dequeue());
			testResults.add("\n");
			testResults.add("Queue size after dequeue: " + queue.size());
		}
		testResults.add("\n");
		testResults.add("-------------------------------------------------------------------------------------------");
		testResults.add("\n");
		testResults.add("Test: Isempty method test.");		
		testResults.add("\n");
		testResults.add("Is queue empty = " + queue.isEmpty());
		printArrayList(testResults);
	}
	private static void printArrayList(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
        	System.out.println(arrayList.get(i));
        }
	}
}