import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader {

	public static void main(String[] args) {
		// File Reader = Read the contents of a file as a stream of character.
		// one by one read() return an integer value which contains tha byte
		// value when read() returns -1 , there is no more data to be read

		try {
			FileReader reader = new FileReader("art_here.txt");

			int data = reader.read();
			while (data != -1) {
				System.out.print((char) data);
				data = reader.read();
			}
			reader.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
