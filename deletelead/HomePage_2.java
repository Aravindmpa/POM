package deletelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class HomePage_2 extends ProjectMethods{

	public HomePage_2() {		
		PageFactory.initElements(driver,this);
	}	
	//clicking on crmsfa
	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	private WebElement eleCRMSFA;
	public MyHomePage_3 clickCRMSFA() {
		//WebElement eleLogin = locateElement("LINK_TEXT","CRMSFA");
		click(eleCRMSFA);
		return new MyHomePage_3();
	}

	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogOut;

	public LoginPage_1 clickLogOut() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogOut);
		return new LoginPage_1();		
	}

	@FindBy(how=How.XPATH,using="//h2[text()[contains(.,'Welcome')]]")
	private WebElement eleLoggedName;

	public HomePage_2 verifyLoggedName(String data) {
		verifyPartialText(eleLoggedName, data);
		return this;		
	}

	//Verifying the new page after clicking the crmsfa
	
 





}
