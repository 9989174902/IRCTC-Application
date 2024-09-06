 package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page.ModifyPage;
import utils.Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import stepdefinitions.Hooks; // Import Hooks to access ExtentReports instance

public class ModifySearchSteps extends Base {
    private ModifyPage modifySearch;
    private ExtentTest extentTest1;
    ExtentReports extentReport = Hooks.extentReport;
	
	 ExtentTest extentTest = Hooks.extentTest;
	
    @Given("the user is on the IRCTC home page for booking ticket")
    public void the_user_is_on_the_irctc_home_page_for_booking_ticket() {
    	openBrowser();
    	
        extentTest1 = Hooks.extentReport.createTest("ModifySearch", "Opening IRCTC Page");
        extentTest1.pass("Navigating to IRCTC home page for booking ticket");
        modifySearch = new ModifyPage(driver);
        extentTest1 = Hooks.extentReport.createTest("Launching IRCTC", "Opening IRCTC Page");

        try {
            openBrowser();
            modifySearch = new ModifyPage(driver);
            extentTest1.pass("User navigated to the IRCTC home page for booking ticket.");
        } catch (Exception e) {
            extentTest1.fail("Failed to navigate to the IRCTC home page: " + e.getMessage());
        }
    }

    @When("the user enter {string} as the Departure Station")
    public void the_user_enter_as_the_departure_station(String fromLocation) {
        extentTest1 = Hooks.extentReport.createTest("the_user_enter_as_the_departure_station");
        try {
            modifySearch.setFromLocation(fromLocation);
            extentTest1.pass("Entered Departure Station: " + fromLocation);
        } catch (Exception e) {
            extentTest1.fail("Failed to enter Departure Station: " + e.getMessage());
        }
    }

    @When("the user enter {string} as the Arrival Station")
    public void the_user_enter_as_the_arrival_station(String toLocation) {
        extentTest1 = Hooks.extentReport.createTest("the_user_enter_as_the_arrival_station");
        try {
            modifySearch.setToLocation(toLocation);
            extentTest1.pass("Entered Arrival Station: " + toLocation);
        } catch (Exception e) {
            extentTest1.fail("Failed to enter Arrival Station: " + e.getMessage());
        }
    }

    @When("the user select {string} as the Date")
    public void the_user_select_as_the_date(String travelDate) {
        extentTest1 = Hooks.extentReport.createTest("the_user_select_as_the_date");
        try {
            modifySearch.setTravelDate(travelDate);
            extentTest1.pass("Selected Date: " + travelDate);
        } catch (Exception e) {
            extentTest1.fail("Failed to select Date: " + e.getMessage());
        }
    }

    @When("the user click the Search button")
    public void the_user_click_the_search_button() {
        extentTest1 = Hooks.extentReport.createTest("the_user_click_the_search_button");
        try {
            modifySearch.clickSearchButton();
            extentTest1.pass("Clicked on the Search button.");
        } catch (Exception e) {
            extentTest1.fail("Failed to click the Search button: " + e.getMessage());
        }
    }

    @When("user click on All Classes")
    public void user_click_on_all_classes() {
        extentTest1 = Hooks.extentReport.createTest("user_click_on_all_classes");
        try {
            modifySearch.clickallClasses();
            extentTest1.pass("Clicked on All Classes.");
        } catch (Exception e) {
            extentTest1.fail("Failed to click on All Classes: " + e.getMessage());
        }
    }

    @When("user click on the Modify Search")
    public void user_click_on_the_modify_search() {
        extentTest1 = Hooks.extentReport.createTest("user_click_on_the_modify_search");
        try {
            modifySearch.clickModifySearch();
            extentTest1.pass("Clicked on Modify Search.");
        } catch (Exception e) {
            extentTest1.fail("Failed to click on Modify Search: " + e.getMessage());
            driver.quit();
        }
    }
}