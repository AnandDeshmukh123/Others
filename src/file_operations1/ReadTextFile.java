package file_operations1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
	public static void main(String[]args) throws IOException {
		File file = new File("C:\\Users\\ANAND DESHMUKH\\OneDrive\\Desktop\\UserDB.txt.txt");
		
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		System.out.println(line);
	}
}



