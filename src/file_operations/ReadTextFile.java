package file_operations;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
	public static void main(String[]args) throws IOException {
		File file = new File("C:\\Users\\ANAND DESHMUKH\\eclipse-workspace\\corejava\\src\\file_operations\\UserDB");
		
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		System.out.println(line);
	}
}
