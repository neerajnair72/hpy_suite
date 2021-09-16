package frameworkUtils;

/*import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;*/
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;


// TODO: Auto-generated Javadoc
/**
 * The Class ScreenShotRobot.
 */
public class ScreenShotRobot {

	
	/**
	 * Save as image.
	 *
	 * @param imageAsByteArray the image as byte array
	 * @param name the name
	 */
	public void saveAsImage(byte[] imageAsByteArray, String name) {
        InputStream in = new ByteArrayInputStream(imageAsByteArray);
        BufferedImage bImageFromConvert = null;
        File file;
        try {
            file = new File("./Images/"+name);
            bImageFromConvert = ImageIO.read(new ByteArrayInputStream(imageAsByteArray));
            ImageIO.write(bImageFromConvert, "jpg", file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Capture.
     *
     * @param filePath the file path
     */
    public static void capture(String filePath) {
        try {
            BufferedImage screencapture = new Robot().createScreenCapture(
                    new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            File file = new File(filePath);
            ImageIO.write(screencapture, "jpg", file);

        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Capture PNG.
     *
     * @param filePath the file path
     */
    public static void capturePNG(String filePath) {
        try {
            BufferedImage screencapture = new Robot().createScreenCapture(
                    new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            File file = new File(filePath);
            ImageIO.write(screencapture, "png", file);

        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Capture PNG.
     *
     * @return the byte[]
     */
    public static byte[] capturePNG() {
        byte[] out = null;
        try {
            BufferedImage screencapture = new Robot().createScreenCapture(
                    new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ImageIO.write(screencapture, "png", bo);
            out = bo.toByteArray();
            bo.close();

        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return out;
    }

    /**
     * Capture.
     *
     * @return the byte[]
     */
    public static byte[] capture() {
        byte[] out = null;
        try {
            BufferedImage screencapture = new Robot().createScreenCapture(
                    new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ImageIO.write(screencapture, "jpg", bo);
            out = bo.toByteArray();
            bo.close();
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return out;
    }
}
