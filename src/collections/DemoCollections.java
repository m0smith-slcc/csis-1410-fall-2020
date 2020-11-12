package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoCollections {

	public DemoCollections() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		Collections.addAll(numbers, 10, 20, 30, 40, 50, 60, 70);
		System.out.println("Original list:" + numbers);
		
		Collections.rotate(numbers, -3);
		System.out.println("Rotated:" + numbers);
		
		Collections.swap(numbers, 1,  numbers.size() - 2);
		System.out.println("Swapped:" + numbers);
		
		int index = Collections.binarySearch(numbers, 50);
		System.out.println("Search? " + index);
		
		Collections.sort(numbers);
		System.out.println("Sorted:" + numbers);
		
		index = Collections.binarySearch(numbers, 50);
		System.out.println("Search ☺ : " + index);
		
		Collections.shuffle(numbers);
		System.out.println("Shuffled:" + numbers);
		

	}

}
