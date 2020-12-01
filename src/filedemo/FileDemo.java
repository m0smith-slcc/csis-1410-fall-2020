package filedemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDemo {

	public FileDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException {
		File root = new File("/Users/matt/projects");
		String[] fs = root.list();
		for(String s: fs) {
		
			System.out.println(s);
		}
		
		File bricks = new File(root, "bricks/README.md" );
		System.out.println(bricks.length());

		System.out.println(bricks.getAbsolutePath());
		
		Scanner ss = new Scanner(bricks);
		try {
		
			System.out.println(ss.nextLine());
			System.out.println(ss.next());
		} finally {
			ss.close();
		}
	}

}
