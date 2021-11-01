package misc;

import java.io.IOException;

public class LaunchExternalApp {
	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime runtime = Runtime.getRuntime();

		Process pr = runtime.exec("notepad.exe");
		Thread.sleep(2500);
		// to close
		pr.destroy();

		// launch app wit file path
		runtime.exec(
				"notepad.exe C:\\Users\\User\\eclipse-workspace\\Practice-Programs\\com.practice\\src\\utils\\newfile.txt");

		// launch browser and navigate

		String[] str = new String[] { "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe",
				"https://amazon.in" };
		runtime.exec(str);

	}
}
