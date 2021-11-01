package misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateNewFile {

	// m1 using File
	// Note: if ran again it will not create copy of the file
	public void file(String path) throws IOException {
		File file = new File(path);
		boolean flag = file.createNewFile();
		if (flag) {
			System.out.println("Created");
		} else {
			System.out.println("Not Created");
		}
	}

	// m2 using FileOutputStream with scanner
	public void fos() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file Name with location path: ");
		String fileName = sc.nextLine();
		FileOutputStream fos = new FileOutputStream(fileName, true);
		System.out.println("Enter the file content: ");
		String content = sc.nextLine();
		byte b[] = content.getBytes();
		fos.write(b);
		fos.close();
	}

	public static void main(String[] args) throws IOException {
		CreateNewFile newFile = new CreateNewFile();

		newFile.file("C:\\Users\\User\\git\\Practice-Programs\\com.practice\\src\\utils\\createFile.txt");

		newFile.fos();
	}
}
