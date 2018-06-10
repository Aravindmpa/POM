package createleadpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	public CreateLeadPage() {		
		PageFactory.initElements(driver,this);
	}
	
	
	//Sending data to companyName
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	@And("Enter the Company Name as (.*)")
	public CreateLeadPage enterCompanyName(String data) {
		type(eleCompanyName,data);
		return this;
	}
	//Sending data to FirstName
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	@And("Enter the FirstName as (.*)")
	public CreateLeadPage enterFirstName(String data) {
		type(eleFirstName,data);
		return this;
	}
	
	//Sending data to LastName
		@FindBy(how=How.ID,using="createLeadForm_lastName")
		private WebElement eleLastName;
		
		@And("Enter the LastName as (.*)")
		public CreateLeadPage enterLastName(String data) {
			type(eleLastName,data);
			return this;
		}
		
		
		@FindBy(how=How.CLASS_NAME,using="smallSubmit")
		private WebElement eleSubmitLead;
		
		@When("Click Submit Button")
		public  VerifyDataPage submitLeads() {
			//WebElement eleLogin = locateElement("LINK_TEXT","Create Lead");
			click(eleSubmitLead);
			return new VerifyDataPage();
	}
		@FindBy(how=How.ID,using="viewLead_companyName_sp")
		private WebElement elecompName;

		public VerifyDataPage verifyLoggedName(String data) {
			verifyPartialText(elecompName, data);
			return new VerifyDataPage() ;		
		}
		
		
	
	
	
	
	
}
