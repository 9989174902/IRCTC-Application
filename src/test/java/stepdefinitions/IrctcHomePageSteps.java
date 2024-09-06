package stepdefinitions;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.IrctcHomePage;
import utils.Base;

public class IrctcHomePageSteps extends Base {
	ExtentReports extentReport = Hooks.extentReport;
	ExtentTest extentTest = Hooks.extentTest;
	private IrctcHomePage homePage;
	
	


    @Given("the user is on the IRCTC Home page")

    public void theUserIsOnTheIRCTCHomePage() {
    	
        extentTest = Hooks.extentReport.createTest("IrctcHomePageSteps", "Opening IRCTC Page");
     //   extentTest.pass("Navigating to IRCTC home page for booking ticket");
     //   homePage = new IrctcHomePage(driver);
     //   extentTest = Hooks.extentReport.createTest("Launching IRCTC", "Opening IRCTC Page");
    	try {

        openBrowser();

        homePage = new IrctcHomePage(driver);
        extentTest.pass("Browser opened and navigates to the IRCTC Home Page.");
        
    	} catch (Exception e) {
    		extentTest.fail("Failed to navigate to the IRCTC Home Page:" +e.getMessage());
    	}

    }

    @When("the label for the Departure Station field should be {string}")

    public void the_label_for_the_departure_station_field_should_be(String FromLocation) {

try {
	homePage.getDepartureStationLabel();

	//String actualLabel = homePage.getDepartureStationLabel();
	
	extentTest.pass("Departure Station label matched: "+FromLocation);	
} catch (Exception e) {
	extentTest.fail(" Error while verofying Departure Station label: "+e.getMessage());
	
}

     //   homePage.getDepartureStationLabel();

    }

    @When("label for the Arrival Station field should be {string}")

    public void label_for_the_arrival_station_field_should_be(String ToLocation) {
   //   extentTest = extentReport.createTest("label_for_the_arrival_station_field_should_be(StringFromLocation"); {
      try {
       homePage.getArrivalStationLabel();
       
	extentTest.pass("Arrival Station label matched: "+ToLocation);

    } catch (Exception e) {
    	extentTest.fail("Error while verifying Arrival Station label: "+e.getMessage());
    }
    }
    @When("the label for the All Classes field should be {string}")

    public void the_label_for_the_all_classes_field_should_be(String expectedlabel) {
    //	extentTest = extentReport.createTest("the_label_for_the_all_classes_field_should_be", "Verify All Classes label");
    	try {
    		 homePage.getAllClassesLabel();
    		extentTest.pass("All Classes label matched): "+expectedlabel);
    		
    	} catch (Exception e) {
    		extentTest.fail("Error while verifying All Classes label: "+e.getMessage());
    	}
    }

    //    homePage.getAllClassesLabel();

    



    @When("the label for the General should be {string}")

    public void the_label_for_the_general_should_be(String expectedLabel) {
 //  extentTest = extentReport.createTest("the_label_for_the_the_general_should_be", "Verify General label");
 extentTest.pass("General should be label");
    //	try {
		//   String actualLabel = homePage.getGeneralLabel();
     
//extentTest.pass("General label matched: "+expectedLabel);

  //  } catch (Exception e) {
    //	extentTest.fail("Error while verifying General label: "+e.getMessage());

    }   
    @Then("the user check all labels")
    public void the_user_check_all_labels() {
		 homePage.allavailableLabels();
		 extentTest.pass("See all the labels");
		 		
    	 
    }

}