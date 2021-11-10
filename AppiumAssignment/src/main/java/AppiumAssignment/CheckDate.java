package AppiumAssignment;

import PageClasses.BaseClass;
import PageClasses.POMClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckDate {

	String dayBefore;
	public AppiumDriver driver = BaseClass.baseDriver;
	POMClass pageObj;
	

	@When("click on Date Widgets")
	public void click_on_date_widgets() {
		
		pageObj = new POMClass(driver);
		
		//driver.findElementByXPath("//*[@text='Date Widgets']").click();
		pageObj.dtWidgetsOption.click();
	}
	@When("click on Dialog")
	public void click_on_dialog() {
	    
		//driver.findElementByXPath("//*[@text='1. Dialog']").click();
		pageObj.dialogOption.click();
	    
	}

	
	
	@Then("Check the date")
	public void check_the_date() {
	    
		//String dtBefore= driver.findElementById("io.appium.android.apis:id/dateDisplay").getAttribute("text");
		String dtBefore= pageObj.dtdisplayed.getAttribute("text");
		System.out.println("Date Before Change: "+ dtBefore);
		
		dayBefore= dtBefore.split("-")[1];
		
	}
	@Then("change the date")
	public void change_the_date() throws InterruptedException 
	{
	    
		//driver.findElementByXPath("//*[@text='CHANGE THE DATE']").click();
		pageObj.cngDateBtn.click();
		Thread.sleep(1000);
		int day= Integer.valueOf(dayBefore);
		day = day+ 1;
		driver.findElementByXPath("//*[@text='"+day+"']").click();
		pageObj.OKButton.click();
		
			  
}
		 
		
	@Then("verify the changed date")
	public void verify_the_changed_date() {
	    // Write code here that turns the phrase above into concrete actions
		String dtAfter= pageObj.dtdisplayed.getAttribute("text");
	    System.out.println("Date Changed to: "+ dtAfter);
	}



}
