package deletelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage_5 extends ProjectMethods{


	public FindLeadsPage_5() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeads;
	public FindLeadsPage_5 clickingFindLead() {
		click(eleFindLeads);
		return this;

	}
//	@FindBy(how=How.XPATH,using="//input[@name='id']")
//	private WebElement eleFindId;
//	//Here we send to send the data of id:10045
//	public FindLeadsPage enteringLeadId(String id) {
//		type(eleFindId,id);
//		return this;			
	//}
	//input[@name='firstName'])[3]
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFindFname;
	public FindLeadsPage_5 enteringFname(String Fname) {
		type(eleFindFname,Fname);
		return this;			
	}

	//	@FindBy(how=How.XPATH,using="(//input[@name='companyName'])[2]")
	//	private WebElement eleFindCompanyName;
	//	//Here we send to send the data of id:10045
	//	public FindLeadsPage enteringCompanyName(String cname) {
	//		type(eleFindCompanyName,cname);
	//		return this;			
	//	}

	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement elegetLeadId;
	public FindLeadsPage_5 getLeadId() {
		String data = getText(elegetLeadId);
		return this;
	}

	//getting id of first Lead
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleclickFindLead;
	public FindLeadsPage_5 clickFindLead() {
		click(eleclickFindLead);
		return this;
	}
	
	
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleclickId;
	public ViewLeadPage_6 clickFirstName() {
		click(eleclickId);
		return new ViewLeadPage_6();
	}









}
