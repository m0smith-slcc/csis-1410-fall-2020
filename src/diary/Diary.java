// To append to a file: https://beginnersbook.com/2014/01/how-to-append-to-a-file-in-java/

package diary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Diary {
	private String name;
	private Calendar shoeing;

	public Diary(String name, Calendar shoeing) {
		
		this.shoeing = shoeing;
		this.name = name;
	}
	

	/**
	 * @return the shoeing
	 */
	public Calendar getShoeing() {
		return shoeing;
	}
	
	public String toString() {
		SimpleDateFormat f = new SimpleDateFormat("MM/dd/yyyy");
		return "Name:" + name + " Shoeing:" + f.format(shoeing.getTime());
	}
	
	void write(PrintWriter pw) {
		SimpleDateFormat f = new SimpleDateFormat("yyyy MM dd");
		pw.println(name);
		pw.println(f.format(shoeing.getTime()));
	
	}
	
	public static Diary read(Scanner scan) {
		String name = scan.next();
		
		int year  = scan.nextInt();
		int month = scan.nextInt();
		int day = scan.nextInt();
		
		return new Diary(name, new GregorianCalendar(year, month - 1, day));
	}

	public static void main(String[] args) {
		Diary d = new Diary( "Seabiscuit", new GregorianCalendar(2021, 1, 14));
		
		try (PrintWriter pw = new PrintWriter("diary.txt"))
		{
			d.write(pw);

		} catch (IOException ex) {}
		
		try (Scanner scan =  new Scanner(new File("diary.txt"))) {
			
			System.out.println(Diary.read(scan));
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try(Scanner scan = new Scanner("Paint 1984 6 4")) {
			System.out.println(Diary.read(scan));
		}
	}

}
