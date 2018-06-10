package createleadpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class VerifyDataPage extends ProjectMethods{
	public  VerifyDataPage() {		
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement elecompName;
	
	@Then("Verify Company Name")
	public CreateLeadPage verifyLoggedName(String data) {
		verifyPartialText(elecompName, data);
		return null;		
	}

}
