package labException;

import java.util.Scanner;

/**
 * * Lab ExceptionHandling demonstrates some of the key concepts of the * Java
 * exception handling mechanism. * * @author MargretP *
 */
public class LabExceptionHandling {
	public static void main(String[] args)  {
		
			int digit = numberFromUser();
			try {
				int result = sevenModulusN(digit);
				System.out.printf("7 %% %d = %d", digit, result);
			} catch (IllegalArgumentException ex) {
				System.err.println("An illegal argument has been detected." + ex.getMessage());
			}
			
		
	}

	private static int numberFromUser() {
		Scanner input = null;
		do {
			try {
				input = new Scanner(System.in);
				System.out.print("number: ");
				return input.nextInt();
			} catch (java.util.InputMismatchException ex) {
				System.out.println("The number entered needs to be a whole number: ");
			} finally {
				if(input != null) {
					input.close();
				}
			}
			
		} while (true);
	}
	
	static class ZeroException extends IllegalArgumentException {

		/**
		 * 
		 */
		public ZeroException() {
			super();
			// TODO Auto-generated constructor stub
		}

		/**
		 * @param message
		 * @param cause
		 * @param enableSuppression
		 * @param writableStackTrace
		 */
		

		/**
		 * @param message
		 * @param cause
		 */
		public ZeroException(String message, Throwable cause) {
			super(message, cause);
			// TODO Auto-generated constructor stub
		}

		/**
		 * @param message
		 */
		public ZeroException(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}

		/**
		 * @param cause
		 */
		public ZeroException(Throwable cause) {
			super(cause);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String getMessage() {
			// TODO Auto-generated method stub
			return "zero " + super.getMessage();
		}
		
		
		
	}

	private static int sevenModulusN(int number) {
		if( 0 == number) throw new ZeroException (" The method sevenModuleusN can't accept zero as an argument. ");
		return 7 % number;
	}
}