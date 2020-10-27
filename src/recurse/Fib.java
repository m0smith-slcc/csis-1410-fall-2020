package recurse;

public class Fib {
	
	public static long fib(long inp) {
		if(inp < 2) return inp;
		return fib(inp-1) + fib(inp-2);
	}
	
	public static long fibloop(long inp) {
		long n1 = 1;
		long n2 = 1;
		
		for (long i = inp; i > 3 ; --i) {
			long temp = n2;
			n2 = n1;
			n1 = n1 + temp;
		}
		return n1 + n2;
		
	}
	

	public static void main(String[] args) {
		System.out.println(fibloop(50));
		System.out.println(fib(50));
		

	}

}
