package misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\User\\git\\Practice-Programs\\com.practice\\src\\utils\\file.txt");
		File opFile = new File("C:\\Users\\User\\git\\Practice-Programs\\com.practice\\src\\utils\\opfile.txt");

		FileInputStream fis = null;
		FileOutputStream fos = null;

		fis = new FileInputStream(file);
		fos = new FileOutputStream(opFile);
		int i = 0;
		while ((i = fis.read()) != -1) {
			fos.write(i);
		}

		if (fis != null) {
			fis.close();
		}
		if (fos != null) {
			fos.close();
		}

	}

}
