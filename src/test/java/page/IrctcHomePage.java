package page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class IrctcHomePage {

	private WebDriver driver;

	// Locators for the fields

	private By departureStationFieldLocator = By.xpath("//*[@id=\"origin\"]/span/input"); // Update the locator

	private By arrivalStationFieldLocator = By.xpath("//*[@id=\"destination\"]/span/input"); // Update the locator

	// private By travelDateFieldLocator =
	// By.xpath("//*[@id=\"jDate\"]/span/input"); // Update the locator

	private By allClassesFieldLocator = By.xpath("//*[@id=\"journeyClass\"]/div"); // Update the locator

	private By generalLocator = By.xpath("//*[@id=\"journeyQuota\"]/div"); // Update the locator

	// Constructor

	public IrctcHomePage(WebDriver driver) {

		this.driver = driver;

	}

	// Method to get the label text of a field

	public String getFieldLabel(By locator) {

		WebElement field = driver.findElement(locator);

		return field.getText();

	}

	// Methods to get labels for specific fields

	public String getDepartureStationLabel() {

		driver.findElement(departureStationFieldLocator).click();
		return null;

	}

	public String getArrivalStationLabel() {

		driver.findElement(arrivalStationFieldLocator).click();
		return null;

	}

	public String getAllClassesLabel() {

		driver.findElement(allClassesFieldLocator).click();
		return null;

	}

	/*public String getGeneralLbel() {

		driver.findElement(generalLocator).click();
		return null;

	} */
public String getGeneralLabel() {
	driver.findElement(generalLocator).click();
		// TODO Auto-generated method stub
		return null;
	}

public void allavailableLabels() {
    String expresult= driver.findElement(By.cssSelector("#divMain > div > app-main-page > div > div > div.level_2.slanted-div > div.col-xs-12.remove-padding.tbis-box.tbis-box-pad > div:nth-child(1) > app-jp-input > div > div > label")).getText();
    String actresult="BOOK TICKET";
    Assert.assertEquals(expresult, actresult);
    }

}

/*	public String getGeneralFieldLabel() {
		// TODO Auto-generated method stub
		return null;
	}*/


