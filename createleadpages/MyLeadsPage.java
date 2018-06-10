package createleadpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{

	
	public MyLeadsPage() {		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLead;
	
	@And("Click Create Leads Button")
	public  CreateLeadPage clickLeads() {
		//WebElement eleLogin = locateElement("LINK_TEXT","Create Lead");
		click(eleCreateLead);
		return new CreateLeadPage();
}
}
