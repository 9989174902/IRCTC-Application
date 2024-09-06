package stepdefinitions;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.SortBydurationLateFirst;
import utils.Base;

public class SortByDurationLateFirstSteps extends Base {

	private SortBydurationLateFirst sortbyduration;
	private ExtentTest extentTest;
	ExtentReports extentReport = Hooks.extentReport;
	
	 ExtentTest extentTest1 = Hooks.extentTest;
	
	

	@Given("the user is on the irctc home page for booking Ticket")

	public void the_user_is_on_the_irctc_home_page_for_booking_ticket() {
		extentTest = Hooks.extentReport.createTest("SortBydurationLateFirst", "Opening Irctc Page");
		try {
		openBrowser();
		
		
		sortbyduration = new SortBydurationLateFirst(driver);
		extentTest.pass("user is on the irctc home page for Booking Ticket.");
		} catch (Exception e) {
			extentTest.fail("Failed to open irctc home page for booking Ticket: "+e.getMessage());
			
		}



	}

	@When("the user enter {string} as the Departure station")

	public void the_user_enter_as_the_departure_station(String FromLocation) throws InterruptedException {
		extentTest = Hooks.extentReport.createTest("the_user_enters_as_the_departure_station");
		try {
			sortbyduration.enterFromLocation(FromLocation);
		extentTest.pass("Entered departure station: "+FromLocation);
		} catch (Exception e) {
			extentTest.fail("Failed to enter departure station: "+e.getMessage());
		}
		
		

	}

	@When("the user enter {string} as the Arrival station")

	public void the_user_enter_as_the_arrival_station(String ToLocation) throws InterruptedException {

		extentTest = Hooks.extentReport.createTest("the_user_enters_as_the_arrival_station");
		try {		
			sortbyduration.enterToLocation(ToLocation);
		extentTest.pass("Entered arrival station: "+ToLocation);
		} catch (Exception e) {
			extentTest.fail("Failed to enter arrival station: "+e.getMessage());
			
		}


	}

	@When("the user select {string} as the date")

	public void the_user_select_as_the_date(String TravelDate) throws InterruptedException {
		extentTest = Hooks.extentReport.createTest("the_user_selects_as_the_date");
		try {
			
		
			sortbyduration.selectTravelDate(TravelDate);
			extentTest.pass("Entered travel date: "+TravelDate);
		} catch (Exception e) {
			extentTest.fail("Failed to enter travel date: "+e.getMessage());
			
		}


	}

	@When("user click the Search button")

	public void user_click_the_search_button() throws InterruptedException {
		extentTest = Hooks.extentReport.createTest("the_user_click_the_search_buton");
		try {
			sortbyduration.clickSearchButton();
			extentTest.pass("Clicked on the search button.");
		} catch (Exception e) {
			extentTest.fail("Failed to click on search button: "+e.getMessage());
			
		}
	

	}

	@When("the user click on Sort by Duration")

	public void the_user_click_on_sort_by_duration() throws InterruptedException {
    extentTest = Hooks.extentReport.createTest("the_user_click_on_sort_by_duration");
    try {
    	
		sortbyduration.clickSortByDuration();
		extentTest.pass("Clicked on Sort by Duration.");
    } catch (Exception e) {
    	extentTest.fail("Failed to click on Sort by Duration: "+e.getMessage());
    	
    }

	}

	@Then("Display All the Elements in the Sort By Duration")

	public void display_all_the_elements_in_the_sort_by_duration() throws InterruptedException {
      extentTest = Hooks.extentReport.createTest("display_all_the_elements_in_the_sort_by_duration");
      try {
    	  sortbyduration.AllElements();
    	  extentTest.pass("Displayed all the elements sorted by duration.");
      } catch (Exception e) {
    	  extentTest.fail("Failed to display all elements sorted by duration: "+e.getMessage());
    	  
      }

	}

	@When("user clicks on Duration Late First")

	public void user_clicks_on_duration_late_first() throws InterruptedException {
    extentTest = Hooks.extentReport.createTest("user_clicks_on_duration_late_first");
    try {
    	sortbyduration.ClickDurationLateFirst();
    	extentTest.pass("Clicked on Duration Late First.");
    } catch (Exception e) {
    	extentTest.fail("Failed to click on Duration Late First: "+e.getMessage());
    	driver.quit();
    }

	}
}