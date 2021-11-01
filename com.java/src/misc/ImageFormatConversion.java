package misc;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageFormatConversion {
	public static void main(String[] args) throws IOException {
		URL url = new URL(
				"https://png.pngtree.com/png-clipart/20190515/original/pngtree-coffee-time-png-image_3626459.jpg");
		BufferedImage image = ImageIO.read(url);
		ImageIO.write(image, "jpg",
				new File("C:\\Users\\User\\git\\Practice-Programs\\com.practice\\src\\utils\\image1.jpg"));
		ImageIO.write(image, "gif",
				new File("C:\\Users\\User\\git\\Practice-Programs\\com.practice\\src\\utils\\image2.gif"));

	}
}
