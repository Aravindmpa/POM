package deletelead;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyHomePage_3 extends ProjectMethods {
	//PageFactory.initElements(driver,this);

	
	public MyHomePage_3() {		
		PageFactory.initElements(driver,this);
	}
		//
		@FindBy(how=How.LINK_TEXT,using="Leads")
		private WebElement eleLeads;
		
		public  FindLeadsPage_5 clickingLeads() {
			//WebElement eleLogin = locateElement("LINK_TEXT","Leads");
			click(eleLeads);
			return new FindLeadsPage_5();
		}
		

		}
		



