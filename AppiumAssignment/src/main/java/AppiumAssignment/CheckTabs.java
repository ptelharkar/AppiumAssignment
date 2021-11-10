package AppiumAssignment;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import org.junit.Assert;

import java.time.Duration;

import PageClasses.BaseClass;
import PageClasses.POMClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckTabs {
	public AppiumDriver driver = BaseClass.baseDriver;
	POMClass pageObj;
	
	@When("click on Tabs")
	public void click_on_tabs() {
	    pageObj = new POMClass(driver);
		TouchAction touch=new TouchAction(driver);
		touch.press(point(505,2348)) 
		.waitAction(waitOptions(Duration.ofSeconds(5)))
		.moveTo(point(505,369)) 
		.release() 
		.perform();
		touch.press(point(505,2348)) 
		.waitAction(waitOptions(Duration.ofSeconds(5)))
		.moveTo(point(505,369)) 
		.release() 
		.perform();
		//driver.findElementByXPath("//*[@text='Tabs']").click();
		pageObj.TabsOption.click();
		
	}
	@When("click on Content By Factory")
	public void click_on_content_by_factory() {

		
		//driver.findElementByXPath("//*[@text='2. Content By Factory']").click();
		pageObj.ContentByFactoryOption.click();
		
	}
	
	@Then("Select diffrent tabs and validate text")
	public void select_diffrent_tabs_and_validate_text() throws InterruptedException {
	    
		//driver.findElementByXPath("//*[@text='TAB2']").click();
		pageObj.tab2.click();
		Thread.sleep(1000);
		
		String ActText1= pageObj.tab2Contents.getAttribute("text");
		
		Assert.assertEquals("Content for tab with tag tab2",ActText1);
		//Assert.assertEquals(
		//Selecting TAB3
		//driver.findElementByXPath("//*[@text='TAB3']").click();
		pageObj.tab3.click();
		String ActText2=pageObj.tab3Contents.getText();
		Assert.assertEquals("Content for tab with tag tab3",ActText2);
		//Selecting TAB1
		//driver.findElementByXPath("//*[@text='TAB1']").click();
		pageObj.tab1.click();
		//String ActText3= driver.findElementByXPath("//*[@text='Content for tab with tag tab1']").getText();
		String ActText3= pageObj.tab1Contents.getText();
		Assert.assertEquals("Content for tab with tag tab1",ActText3);
		Thread.sleep(2000);
		
	}





}
