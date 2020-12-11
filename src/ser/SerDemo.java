package ser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerDemo {

	public SerDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String fileName = "src/ser/bin/words.ser";
		String shapeFileName = "src/ser/bin/shape2.ser";
		
		Shape shape = new Shape(12);
		
		//serializeShape(shapeFileName, shape);
		deseralizeShape(shapeFileName);
		
		
		//serialize(fileName);
		
		//deseralize(fileName);
		

	}

	private static void deseralize(String fileName) {
		try(ObjectInputStream ios = new ObjectInputStream(new FileInputStream(fileName))){
			
			int size = ios.readInt();
			System.out.println(size);
			List<String> newWords = new ArrayList<>();
			for(int i = 0; i< size;  ++i) {
				newWords.add((String) ios.readObject());
			}
			
			System.out.println(newWords);
		
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void deseralizeShape(String fileName) {
		try(ObjectInputStream ios = new ObjectInputStream(new FileInputStream(fileName))){
			
			Shape shape = (Shape) ios.readObject();
			
			
			System.out.println(shape);
		
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void serializeShape(String fileName, Shape shape) {
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			
			
				oos.writeObject(shape);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void serialize(String fileName) {
		List<String>  words = Arrays.asList("the", "quick", "dog");
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			
			oos.writeInt(words.size());
			for(String w : words) {
				oos.writeObject(w);
			}
	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
