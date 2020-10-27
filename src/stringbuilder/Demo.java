package stringbuilder;

public class Demo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("is was a dark night |");
		
		for(int i = 0; i< sb.length(); ++i) {
			char c = sb.charAt(i);
			char lc = Character.toUpperCase(c);
			sb.replace(i, i+1, "" + lc);
			
		}
		
		System.out.println(sb);
		sb.replace(1, 2, "t").setCharAt(0, 'I');
		sb.append(".");
		sb.insert(14, andStormy());
		
		int index = sb.indexOf("NIGHT");
		//sb.replace(index, index + 1, "kn");
		sb.insert(index, "k");

		int idx2 = sb.indexOf("W");
		
		sb.deleteCharAt(idx2);
		
		sb.append(" " + '\u26c8' + "\ud83e\udd89");
		
		System.out.println(sb);
		
		String s = "go";
		while(! s.equals("stop")) {
			System.out.println(s);
			s = "stop";
		}

	}
	
	public static StringBuilder andStormy( ) {
		return new StringBuilder("and").append(' ').append("stormy").append(' ');
	}
}
