package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page.IrctcTrainSearchPage;
import utils.Base;


public class IrctcTrainSearchSteps extends Base {
	
	private IrctcTrainSearchPage trainsearchpage;
	ExtentReports extentReport = Hooks.extentReport;
	
	 ExtentTest extentTest = Hooks.extentTest;
	

	@Given("the user is on the irctc home page for Booking Ticket")
	public void the_user_is_on_the_irctc_home_page_for_booking_ticket() {
//openBrowser();
    	
        extentTest = Hooks.extentReport.createTest("IrctcTrainSearchSteps", "Opening IRCTC Page");
        extentTest.pass("Navigating to IRCTC home page for booking ticket");
        trainsearchpage = new IrctcTrainSearchPage(driver);
        extentTest = Hooks.extentReport.createTest("Launching IRCTC", "Opening IRCTC Page");
   //     extentTest = Hooks.extentReport.createTest("the_user_is_on_the_irctc_home_page_for_booking_ticket");
		try {
		openBrowser();
		
		trainsearchpage = new IrctcTrainSearchPage(driver);
		extentTest.pass("user is on the irctc home page for Booking Ticket.");
		} catch (Exception e) {
			extentTest.fail("Failed to open irctc home page for booking Ticket: "+e.getMessage());
			
		}
	}

	

	@When("the user enters {string} as the departure station")
	public void the_user_enters_as_the_departure_station(String FromLocation) throws InterruptedException {
		extentTest = Hooks.extentReport.createTest("the_user_enters_as_the_departure_station");
		try {
		trainsearchpage.enterFromLocation(FromLocation);
		extentTest.pass("Entered departure station: "+FromLocation);
		} catch (Exception e) {
			extentTest.fail("Failed to enter departure station: "+e.getMessage());
		}
		

	}

	@When("the user enters {string} as the arrival station")
	public void the_user_enters_as_the_arrival_station(String ToLocation) throws InterruptedException {
		extentTest = Hooks.extentReport.createTest("the_user_enters_as_the_arrival_station");
		try {		
		trainsearchpage.enterToLocation(ToLocation);
		extentTest.pass("Entered arrival station: "+ToLocation);
		} catch (Exception e) {
			extentTest.fail("Failed to enter arrival station: "+e.getMessage());
			
		}


	}

	@When("the user selects {string} as the date")
	public void the_user_selects_as_the_date(String TravelDate) throws InterruptedException {
	extentTest = Hooks.extentReport.createTest("the_user_selects_as_the_date");
	try {
		
	
		trainsearchpage.selectTravelDate(TravelDate);
		extentTest.pass("Entered travel date: "+TravelDate);
	} catch (Exception e) {
		extentTest.fail("Failed to enter travel date: "+e.getMessage());
		
	}
				

	}
	@When("the user click the search button")
	public void the_user_click_the_search_button() throws InterruptedException {
	extentTest = Hooks.extentReport.createTest("the_user_click_the_search_buton");
	try {
		trainsearchpage.clickSearchButton();
		extentTest.pass("Clicked on the search button.");
	} catch (Exception e) {
		extentTest.fail("Failed to click on search button: "+e.getMessage());
		driver.quit();
		
	}
		}
}

