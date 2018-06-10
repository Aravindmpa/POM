package createleadpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{

	public HomePage() {		
		PageFactory.initElements(driver,this);
	}	
	//clicking on crmsfa
	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	private WebElement eleCRMSFA;
	
	@And("Click CRM/SFA")
	public MyHomePage clickCRMSFA() {
		//WebElement eleLogin = locateElement("LINK_TEXT","CRMSFA");
		click(eleCRMSFA);
		return new MyHomePage();
	}

	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogOut;

	public LoginPage clickLogOut() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogOut);
		return new LoginPage();		
	}

	@FindBy(how=How.XPATH,using="//h2[text()[contains(.,'Welcome')]]")
	private WebElement eleLoggedName;

	public HomePage verifyLoggedName(String data) {
		verifyPartialText(eleLoggedName, data);
		return this;		
	}

	//Verifying the new page after clicking the crmsfa
	
 





}
