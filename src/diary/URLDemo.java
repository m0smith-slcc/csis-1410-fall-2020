package diary;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.net.URL;
import java.util.Scanner;

public class URLDemo {

	public URLDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://worldtimeapi.org/api/timezone/America/Argentina/Salta.txt");
		
		
		try (InputStream s = url.openStream(); 
		     BufferedInputStream bis = new BufferedInputStream(s);
			 Scanner scan = new Scanner(bis)) {
			;;scan.skip(".*");
			for(int i = 0; i <= 3; ++i) {
				System.out.println(scan.next());
			}
		}

	}

}
