package AppiumAssignment;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import PageClasses.BaseClass;
import PageClasses.POMClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckRadioSelection {

	public AppiumDriver driver = BaseClass.baseDriver;
	POMClass pageObj;

	
	@When("click on Controls")
	public void click_on_controls() {
		
		//driver.findElementByXPath("//*[@text='Controls']").click();
		pageObj = new POMClass(driver);
		pageObj.ControlsOption.click();
	}

	@When("click on Holo or Old Theme")
	public void click_on_holo_or_old_theme() {
		
		//driver.findElementByXPath("//*[@text='6. Holo or Old Theme']").click();
		pageObj.Holo_Old_ThemeOption.click();
	}

	@Then("select Checkbox")
	public void select_checkbox() {
	
		//driver.findElementByXPath("//*[@text='Checkbox 1']").click();
		pageObj.chkBox1.click();
		
	}

	@Then("verify that Checkbox is selected")
	public void verify_that_checkbox_is_selected() {
		
		//String scheckbox= driver.findElementByXPath("//*[@text='Checkbox 1']").getAttribute("checked");
		String scheckbox= pageObj.chkBox1.getAttribute("checked");
		if (scheckbox.equals("true"))
		{
			System.out.println("Checkbox 1 is selected");
		}
	}

	@Then("select radio button")
	public void select_radio_button() {
		
		//driver.findElementByXPath("//*[@text='RadioButton 1']").click();
		pageObj.rButton1.click();
		
	}

	@Then("verify that Radio button is selected")
	public void verify_that_radio_button_is_selected() {
		
		String sRbutton = pageObj.rButton1.getAttribute("checked");
		if (sRbutton.equals("true"))
		{
			System.out.println("Radio button 1 is selected");
		}
	}

}
