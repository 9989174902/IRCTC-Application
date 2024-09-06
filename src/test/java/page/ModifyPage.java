package page;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModifyPage {
private WebDriverWait wait;

private WebDriver driver;
public ModifyPage(WebDriver driver) {

this.driver=driver;
this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));

}
public void setFromLocation(String fromLocation) throws InterruptedException {
wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#origin > span > input"))).click();
   driver.findElement(By.cssSelector("#origin > span > input")).sendKeys(fromLocation);
   
   wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#pr_id_1_list > li:nth-child(2)"))).click();
}
public void setToLocation(String ToLocation) throws InterruptedException {
wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#destination > span > input"))).click();
driver.findElement(By.cssSelector("#destination > span > input")).sendKeys(ToLocation);

wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#pr_id_2_list > li:nth-child(1) > span"))).click();
}
public void setTravelDate(String TravelDate) throws InterruptedException {

	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#jDate > span > input"))).click();

	driver.findElement(By.cssSelector("#jDate > span > div > div > div.ui-datepicker-header.ui-widget-header.ui-helper-clearfix.ui-corner-all.ng-tns-c58-10 > a.ui-datepicker-next.ui-corner-all.ng-tns-c58-10.ng-star-inserted > span")).click();//month year
// move next month
	driver.findElement(By.cssSelector("#jDate > span > div > div > div.ui-datepicker-header.ui-widget-header.ui-helper-clearfix.ui-corner-all.ng-tns-c58-10 > div")).click(); //move next month
	//month and year
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#jDate > span > div > div > div.ui-datepicker-calendar-container.ng-tns-c58-10.ng-star-inserted > table > tbody > tr:nth-child(3) > td:nth-child(4) > a"))).click(); //date
}


public void clickSearchButton() throws InterruptedException {
driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div[1]/button")).click();//Clicks to find the trains


}

    public void clickallClasses() throws InterruptedException {
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#divMain > div > app-train-list > div.level_1.hidden-xs.ng-star-inserted > app-modify-search > div > form > div.col-md-9.col-sm-12 > div:nth-child(1) > div:nth-child(4) > p-dropdown > div > div.ui-dropdown-label-container.ng-tns-c65-30 > span"))).click();
    driver.findElement(By.cssSelector("#divMain > div > app-train-list > div.level_1.hidden-xs.ng-star-inserted > app-modify-search > div > form > div.col-md-9.col-sm-12 > div:nth-child(1) > div:nth-child(4) > p-dropdown > div > div.ng-trigger.ng-trigger-overlayAnimation.ng-tns-c65-30.ui-dropdown-panel.ui-widget.ui-widget-content.ui-corner-all.ui-shadow.ng-star-inserted > div > ul > p-dropdownitem:nth-child(6) > li")).click();
    }

    public void clickModifySearch() {
   
    driver.findElement(By.cssSelector("#divMain > div > app-train-list > div.level_1.hidden-xs.ng-star-inserted > app-modify-search > div > form > div.col-md-2.text-center.pull-left.col-sm-offset-3.col-sm-6.col-xs-12.sBtn > button.hidden-xs.search_btn.btn")).click();

    }
   

}