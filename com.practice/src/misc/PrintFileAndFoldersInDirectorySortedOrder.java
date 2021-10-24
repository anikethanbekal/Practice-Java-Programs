package misc;

import java.io.File;
import java.util.Arrays;

public class PrintFileAndFoldersInDirectorySortedOrder {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\User\\Downloads");
		File downloadDir[] = file.listFiles();
		Arrays.sort(downloadDir);
		for (File e : downloadDir) {
			if (e.isDirectory()) {
				System.out.println("Directory : " + e.getName());
			} else if (e.isFile()) {
				System.out.println("File : " + e.getName());
			} else {
				System.out.println("Not Known : " + e.getName());
			}
		}
	}

}
