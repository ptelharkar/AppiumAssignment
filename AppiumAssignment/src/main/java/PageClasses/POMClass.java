package PageClasses;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
public class POMClass {

	@FindBy(xpath = "//*[@text='Views']")
	public MobileElement viewsOption;
	
	@FindBy(xpath = "//*[@text='Chronometer']")
	public MobileElement ChronometerOption;
	
	@FindBy(xpath = "//*[@text='Views/Chronometer']")
	public MobileElement ChronometerPage;
	
	@FindBy(id= "io.appium.android.apis:id/chronometer")
	public MobileElement Timer;
	
	@FindBy(xpath = "//*[@text='START']")
	public MobileElement stButton;
					
	@FindBy(xpath = "//*[@text='STOP']")
	public MobileElement stopButton;
	
	@FindBy(xpath = "//*[@text='RESET']")
	public MobileElement resetButton;
	
	@FindBy(xpath = "//*[@text='Controls']")
	public MobileElement ControlsOption;
	
	@FindBy(xpath = "//*[@text='6. Holo or Old Theme']")
	public MobileElement Holo_Old_ThemeOption;
	
	@FindBy(xpath = "//*[@text='Checkbox 1']")
	public MobileElement chkBox1;
	
	@FindBy(xpath = "//*[@text='RadioButton 1']")
	public MobileElement rButton1;
	
	@FindBy(xpath = "//*[@text='Date Widgets']")
	public MobileElement dtWidgetsOption;
	
	@FindBy(xpath = "//*[@text='1. Dialog']")
	public MobileElement dialogOption;
	
	@FindBy(id= "io.appium.android.apis:id/dateDisplay")
	public MobileElement dtdisplayed;
	
	@FindBy(xpath = "//*[@text='CHANGE THE DATE']")
	public MobileElement cngDateBtn;
	
	@FindBy(xpath = "//*[@text='OK']")
	public MobileElement OKButton;
	
	@FindBy(xpath = "//*[@text='Expandable Lists']")
	public MobileElement ExpListOption;
	
	@FindBy(xpath = "//*[@text='1. Custom Adapter']")
	public MobileElement CustomAdapterOption;
	
	@FindBy(className = "android.widget.TextView")
	public MobileElement ExpandableItems;
	
	
	@FindBy(xpath = "//*[@text='People Names']")
	public MobileElement peopleNameList;
	
	@FindBy(xpath = "//*[@text='Tabs']")
	public MobileElement TabsOption;
	
	@FindBy(xpath = "//*[@text='2. Content By Factory']")
	public MobileElement ContentByFactoryOption;
	
	@FindBy(xpath = "//*[@text='TAB1']")
	public MobileElement tab1;
	
	@FindBy(xpath = "//*[@text='TAB2']")
	public MobileElement tab2;
	
	@FindBy(xpath = "//*[@text='TAB3']")
	public MobileElement tab3;
	
	@FindBy(xpath = "//*[@text='Content for tab with tag tab1']")
	public MobileElement tab1Contents;
	
	@FindBy(xpath = "//*[@text='Content for tab with tag tab2']")
	public MobileElement tab2Contents;
	
	@FindBy(xpath = "//*[@text='Content for tab with tag tab3']")
	public MobileElement tab3Contents;
	
	
	
	
	public POMClass(AppiumDriver appiumDriver) {

		// Initiate Page elements
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);

	}
}
