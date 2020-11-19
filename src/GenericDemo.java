import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericDemo {

	public GenericDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<String> abc = Arrays.asList("a","b","c");
		System.out.println(getLast(abc));
		System.out.println(abc.getClass().getName());
		
		Set<Integer> ints = new HashSet<>(Arrays.asList(1,2,3,4));
		System.out.println(isTiny(ints));
		System.out.println(isTiny(abc));
		
		List<String> abc2 = new ArrayList<>(abc);
		addInTheMiddle(abc2, "hamster");
		System.out.println(abc2);
		
		
		List l = abc2;
		l.add(1);
		l.add(new OrderedPair("ll", "kk"));
		
		System.out.println(abc2);
		//for(String s : abc2) {
		//	System.out.println(s.length());
		//}
		
		Pair<String, Integer> p =  new OrderedPair<String, Integer>("key", 42);
		System.out.println(p);
		
		Pair<String, OrderedPair<Number, String>> pp = new OrderedPair<>("string", new OrderedPair<>(77, "seven"));
		System.out.println(pp);
		

	}
	
	public static <T> T getLast(List<T> list) {
		if (list.size() == 0)
			throw new IllegalArgumentException("The list can't be empty.");	
		return list.get(list.size() - 1);
	}
	
	public static <T> boolean isTiny(Collection<T> set) {
		return set.size() <= 5;
		
	}
	
	public static <T> Collection<T> addInTheMiddle(List<T> list, T element) {
		int index = list.size() / 2;
		list.add(index, element);
		Collection<T> rtnval = list;
		return rtnval;
	}
	
	
}

interface Pair<K, V> {
    public K getKey();
    public V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
    	this.key = key;
    	this.value = value;
    }
    
    

    @Override
	public String toString() {
		return "OrderedPair [key=" + key + ", value=" + value + "]";
	}



	public K getKey()	{ return key; }
    public V getValue() { return value; }
}
