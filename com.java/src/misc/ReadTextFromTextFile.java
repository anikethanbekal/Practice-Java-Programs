package misc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFromTextFile {

	// method1 buffer reader
	public void bufferReader(String path) throws IOException {
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}

	}

	// method 2 using scanner
	public void scanner(String path) throws FileNotFoundException {
		File file = new File(path);
		Scanner sc = new Scanner(file);
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
	}

	// method 3

	public void delimeter(String path) throws FileNotFoundException {
		File file = new File(path);
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\z");
		System.out.println(sc.nextLine());
	}

	// method 4 : using FIS

	public void fis(String path) throws IOException {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		int c = 0;
		while ((c = fis.read()) != -1) {
			System.out.println((char) c);
		}
	}

	public static void main(String[] args) throws IOException {
		ReadTextFromTextFile read = new ReadTextFromTextFile();
		read.bufferReader("C:\\Users\\User\\git\\Practice-Programs\\com.practice\\src\\utils\\file.txt");

		read.scanner("C:\\Users\\User\\git\\Practice-Programs\\com.practice\\src\\utils\\file.txt");

		read.delimeter("C:\\Users\\User\\git\\Practice-Programs\\com.practice\\src\\utils\\file.txt");

		read.fis("C:\\Users\\User\\git\\Practice-Programs\\com.practice\\src\\utils\\file.txt");
	}
}
