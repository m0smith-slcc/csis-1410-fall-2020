package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenges {
	
	List<Character> letters;
	List<Character> vowels;

	public Challenges() {
		letters = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h')); 
		vowels = new ArrayList<>();   // empty list
	}

	public static void main(String[] args) {
		
		Challenges ch1 = new Challenges();
		ch1.do1();
		
		Challenges ch2 = new Challenges();
		ch2.do2();
		
		Challenges ch3 = new Challenges();
		ch3.do3();
		ch3.do4();
		

	}

	private void do1() {
		Collections.rotate(letters, 1);
		System.out.println("DO1:" + letters);
		
	}
	
	private void do2() {
		
		Collections.addAll(vowels, 'O', 'I', 'O', 'U', 'O');
		System.out.println("DO2:" + vowels);
	}
	
	private void do3() {
		
		Collections.addAll(vowels, 'O', 'I', 'O', 'U', 'O');
		System.out.println("DO3:" + Collections.disjoint(letters, vowels));
	}	
	
	private void do4() {
		Collections.replaceAll(vowels, 'O', 'A');
		System.out.println("DO4:" + vowels);
	}

}
