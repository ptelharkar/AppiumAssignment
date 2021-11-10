package AppiumAssignment;



import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import PageClasses.BaseClass;
import PageClasses.POMClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckTimer {

	
		
		public AppiumDriver driver;
		POMClass pageObj;
		public DesiredCapabilities capability;
		
		@Given("^I Launch API Demos Application$") public void
		  i_Launch_API_Demos_Application() throws Throwable { 
			 
		  String sFile =  "C:\\Users\\ptelh\\Downloads\\ApiDemos-debug.apk"; 
		  capability = new DesiredCapabilities(); // OS Name 
		  capability.setCapability("device", "Android"); 
		  capability.setCapability(CapabilityType.BROWSER_NAME, ""); //Mobile OS version. In My case its running on Android 4.2
		  capability.setCapability(CapabilityType.VERSION, "11.0");
		  capability.setCapability("app", sFile); // To Setup the device name
		  capability.setCapability("deviceName", "Pixel 2 API 30 2");
		  capability.setCapability("platformName", "Android"); // set the package name of the app 
		  capability.setCapability("app-package", "io.appium.android.apis");
		  // set the Launcher activity name of the app
		  capability.setCapability("app-activity", ".ApiDemos"); 
		  // driver object with new Url and Capabilities 
		  driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		  pageObj = new POMClass(driver);
		  BaseClass.baseDriver=driver;
		  
		  }

	@When("^I click on Views$")
	public void i_click_on_Views() throws Throwable {

		//driver.findElementByXPath("//*[@text='Views']").click();
		pageObj.viewsOption.click();
	}

	@When("^click on Chronometer$")
	public void click_on_Chronometer() throws Throwable {
	    
		//driver.findElementByXPath("//*[@text='Chronometer']").click();
		pageObj.ChronometerOption.click();
	}

	@Then("^Chronometer page is displayed$")
	public void chronometer_page_is_displayed() throws Throwable {
	    
		//String pageText= driver.findElementByXPath("//*[@text='Views/Chronometer']").getText();
		String pageText= pageObj.ChronometerPage.getText();
		System.out.println(pageText);
	}

	@Then("^Check Timer$")
	public void check_Timer() throws Throwable {
	    	    
	  //System.out.println(driver.findElementById("io.appium.android.apis:id/chronometer").getAttribute("text"));
		System.out.println(pageObj.Timer.getAttribute("text"));
	 	    
	}

	@Then("^click on Start button$")
	public void click_on_Start_button() throws Throwable {
	    
		//driver.findElementByXPath("//*[@text='START']").click();
		pageObj.stButton.click();
		Thread.sleep(2000);
	}

	@Then("^Check for Timer$")
	public void check_for_Timer() throws Throwable {
	    
		 //System.out.println(driver.findElementById("io.appium.android.apis:id/chronometer").getAttribute("text"));
		 System.out.println(pageObj.Timer.getAttribute("text"));
	}

	@Then("^Click on Stop button$")
	public void click_on_Stop_button() throws Throwable {
	    
		//driver.findElementByXPath("//*[@text='STOP']").click();
		pageObj.stopButton.click();
	}

	@Then("^Click on Reset button$")
	public void click_on_Reset_button() throws Throwable {
	    
		//driver.findElementByXPath("//*[@text='RESET']").click();
		pageObj.resetButton.click();
	}
	
	
	@Then("close the driver")
	public void close_the_driver() 
	{
	    
	    BaseClass.baseDriver.quit();
	}



		
	}


