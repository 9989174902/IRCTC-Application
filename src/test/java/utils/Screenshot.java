package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot extends Base {

	public static String getScreenshot(String scrShotName, WebDriver driver) {

		Date date = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy_HH_mm_ss");

		String dataTime = sdf.format(date);

		String fileName = scrShotName + " _ " + dataTime + ".png";

		TakesScreenshot scrShot = (TakesScreenshot) driver;

		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);

		File destFile = new File(".\\screenshots\\" + fileName);

		try {

			FileUtils.copyFile(scrFile, destFile);

		} catch (IOException e) {

			e.printStackTrace();

		}
		return fileName;

	}



	public static String captureScreenshotBase64(WebDriver driver, String errorName) {



	byte[] imageByte = null;

	try {

	TakesScreenshot scrShot = (TakesScreenshot) driver;

	File srcFile = scrShot.getScreenshotAs(OutputType.FILE);

	String screenshotFolder = PropertyReader.loadProperties().getProperty("ScreenshotPath");

	System.out.println("*********** Screenshot: " + screenshotFolder);



	String scrnShotName = screenshotFolder + errorName + ".png";

	File destFile = new File(scrnShotName);



	FileUtils.copyFile(srcFile, destFile);

	imageByte = IOUtils.toByteArray(new FileInputStream(scrnShotName));



	} catch (FileNotFoundException fnfe) {

	System.out.println("File path or file name is not corrrect");

	} catch (IOException e) {

	System.out.println("Input output Exceiption");

	}



	return Base64.getEncoder().encodeToString(imageByte);






	}

}