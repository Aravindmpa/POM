package deletelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadsPage2_7 extends ProjectMethods {
	public void ClickMyContacts() {
		PageFactory.initElements(driver, this);
	}
		@FindBy(how=How.LINK_TEXT,using="Find Contacts")
		private WebElement eleclickContacts;
		public MyLeadsPage2_7 clickingContacts() {
			click(eleclickContacts);
			return this;
	}
		@FindBy(how=How.LINK_TEXT,using="//label[contains(text(),'Contact Id:')]/following::input[1]")
		private WebElement eleenteringId;
		public MyLeadsPage2_7 enteringId(String data) {
			return this;
		}
		
		
		
		@FindBy(how=How.LINK_TEXT,using="//button[contains(text(),'Find Contacts')]")
		private WebElement eleclickingFindContact;
		public MyLeadsPage2_7 clickingFindContact() {
			click(eleclickContacts);
			return this;
		}
		
			
		
		@FindBy(how=How.LINK_TEXT,using="//div[@class='x-paging-info']")
		private WebElement eleVerifyText;
		public MyLeadsPage2_7 VerifyText() {
			click(eleVerifyText);
			return this;
		}
		

}
