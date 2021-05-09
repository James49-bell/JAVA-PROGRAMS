import java.io.FileWriter;
import java.io.IOException;

public class Write_File {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("some.txt");
			writer.write("Roses are RED \n hEY there \n welcome \n Are you here \n");
			writer.append("\n ( A poem by James )");
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
