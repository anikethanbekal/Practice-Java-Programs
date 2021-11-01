package misc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInTextFile {
	public static void main(String[] args) throws IOException {
		//Note this method will delete the content of the file and writes
		String path = "C:\\Users\\User\\git\\Practice-Programs\\com.practice\\src\\utils\\file.txt";
		FileWriter fw = new FileWriter(path);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Selenium with java");
		bw.close();
	}
}
