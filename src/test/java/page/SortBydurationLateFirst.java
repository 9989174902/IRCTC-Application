package page;

import java.time.Duration;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SortBydurationLateFirst {

	private WebDriverWait wait;

	private WebDriver driver;

	

	public SortBydurationLateFirst(WebDriver driver) {

		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}


	public void enterFromLocation(String fromLocation) {

		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#origin > span > input"))).click();

		driver.findElement(By.cssSelector("#origin > span > input")).sendKeys(fromLocation);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pr_id_1_list > li:nth-child(2)")))
				.click();

	}

	public void enterToLocation(String ToLocation) {

		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#destination > span > input"))).click();

		driver.findElement(By.cssSelector("#destination > span > input")).sendKeys(ToLocation);

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pr_id_2_list > li:nth-child(1) > span")))
				.click();

	}

	public void selectTravelDate(String TravelDate) {

		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#jDate > span > input"))).click();

		

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#jDate > span > input"))).click();

	}

	public void clickSearchButton() {

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div[1]/button")))
				.click();// Clicks to find the trains

	}

	public void clickSortByDuration() {

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[3]/span[1]/button[1]"))).click();

	}

	public boolean AllElements() {

		return

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]"))).isDisplayed();

	}

	public void ClickDurationLateFirst() {

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div/div[1]/div[2]/button")))
				.click();

	}
}
