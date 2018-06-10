package deletelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadsPage_4 extends ProjectMethods {
	public void ClickMyContacts() {
		PageFactory.initElements(driver, this);
	}
		@FindBy(how=How.LINK_TEXT,using="Leads")
		private WebElement eleclickLeads;
		public FindLeadsPage_5 clickingContacts() {
			
			click(eleclickLeads);
			return new FindLeadsPage_5();
			
		
	}

}
