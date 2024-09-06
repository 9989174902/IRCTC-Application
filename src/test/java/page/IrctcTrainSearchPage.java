package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v125.page.model.Screenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IrctcTrainSearchPage {

private WebDriver driver;
private WebDriverWait wait;




public IrctcTrainSearchPage(WebDriver driver) {
	
this.driver=driver;
this.wait=new
WebDriverWait(driver,Duration.ofSeconds(5));

}

// Methods to interact with the search form
public void enterFromLocation(String fromLocation)  {
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#origin > span > input"))).click();

driver.findElement(By.cssSelector("#origin > span > input")).sendKeys(fromLocation);
	
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pr_id_1_list > li:nth-child(2)"))).click();
}

public void enterToLocation(String ToLocation)  {

	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#destination > span > input"))).click();
driver.findElement(By.cssSelector("#destination > span > input")).sendKeys(ToLocation);

wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pr_id_2_list > li:nth-child(1) > span"))).click();

}


public void selectTravelDate(String TravelDate)  {

	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#jDate > span > input"))).click();

wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#jDate > span > input"))).click();



}

public void clickSearchButton() throws InterruptedException {



try {

WebElement loginError = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div[1]/button")));

loginError.click();

//Screenshot.getScreenshot("Invalid Credentials", driver);

} catch (Exception toe) {

toe.printStackTrace();

//Screenshot.getScreenshot("Invalid Credentials", driver);
}
}

//public void clickonInvalidSearch() {
	// TODO Auto-generated method stub
	
}


