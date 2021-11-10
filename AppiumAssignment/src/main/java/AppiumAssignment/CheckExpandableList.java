package AppiumAssignment;

import java.util.List;

import PageClasses.BaseClass;
import PageClasses.POMClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckExpandableList {
	public AppiumDriver driver = BaseClass.baseDriver;
	POMClass pageObj;
	
	@When("click on Expandable Lists")
	public void click_on_expandable_lists() {
		
		pageObj= new POMClass(driver);
		//driver.findElementByXPath("//*[@text='Expandable Lists']").click();
		pageObj.ExpListOption.click();
	}
	@When("click on Custom Adapter")
	public void click_on_custom_adapter() {
	    
		//driver.findElementByXPath("//*[@text='1. Custom Adapter']").click();
		pageObj.CustomAdapterOption.click();
	}
	
	
	@Then("Check Expandable Items")
	public void check_expandable_items() throws InterruptedException {
	    //Listing down expandable elements
		
		pageObj.peopleNameList.click();
		for(MobileElement eachElement: (List<MobileElement>)driver.findElementsByClassName("android.widget.TextView")) 
		{
			
			System.out.println(eachElement.getAttribute("text"));
			
			
		}
		
		Thread.sleep(1000);
	}



}
