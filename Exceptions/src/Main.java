import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// exceptions = an event that occurs during the execution of a program
		// that disrupts the normal flow of instructions

		try {
			Scanner scanner = new Scanner(System.in);

			System.out.println(" enter a whole number to divide:");
			int x = scanner.nextInt();

			System.out.println(" Enter a whole number to divide by:");
			int y = scanner.nextInt();
			int z = x / y;
			System.out.println(" result is : " + z);
		} catch (ArithmeticException e) {
			System.out.println(" Cant divide these terms ");
		} catch (InputMismatchException e) {
			System.out.println("  Input  Mismatch  Exception");
		} finally {
			System.out.println(" This is default print too ");

		}

	}

}
