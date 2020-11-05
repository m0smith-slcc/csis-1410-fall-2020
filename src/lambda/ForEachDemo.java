package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ForEachDemo {
	
	List<String> instruments = new ArrayList<>();
	

	public ForEachDemo() {
		
		Collections.addAll(instruments, "Tuba", "Flute", "Piano", "Lute", "Viola", "Tuba");
		
	}
	
	public String getFirst() {
		Collections.sort(instruments);
		return instruments.get(0);
	}
	
	public void lambda(String arg) {
		System.out.println(arg);
	}
	
	public List<String> toUpper() {
		return instruments.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
	}
	
	public void forloop() {
		
		for(String instrument: instruments) {
			System.out.println(instrument);
		}
		System.out.println();
		
		
		
		instruments.forEach(instrument -> System.out.println(instrument));
		System.out.println();
		
		Set<String> s = new HashSet<String>(instruments);
		for(String instrument: s) {
			System.out.println(instrument);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ForEachDemo demo = new ForEachDemo();
		System.out.println(demo.getFirst());
		System.out.println();
		
		demo.forloop();
		
		System.out.println(demo.toUpper());
		
		
	}

}
