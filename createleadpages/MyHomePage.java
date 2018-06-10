package createleadpages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods {
	//PageFactory.initElements(driver,this);

	
	public MyHomePage() {		
		PageFactory.initElements(driver,this);
	}
		//
		@FindBy(how=How.LINK_TEXT,using="Leads")
		private WebElement eleLeads;
		@And("Click Leads Button")
		public  MyLeadsPage clickingLeads() {
			//WebElement eleLogin = locateElement("LINK_TEXT","Leads");
			click(eleLeads);
			return new MyLeadsPage();
		}
		

		}
		



