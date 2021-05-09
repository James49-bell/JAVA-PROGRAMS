import java.io.File;

public class Main {

	public static void main(String[] args) {
		// File = An abstract representation of file and directory pathnames

		File file = new File("some.txt");

		if (file.exists()) {
			System.out.println(" That is there :0! ");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());

			System.out.println(file.isFile());

			// file.delete();
		} else {
			System.out.println(" that is not there : (");
		}
	}
}
