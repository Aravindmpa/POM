package deletelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage_6 extends ProjectMethods{
	public ViewLeadPage_6() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eleclickDelete;
	public    MyLeadsPage2_7 clickDelete() {
		click(eleclickDelete);
		return new MyLeadsPage2_7() ;
	}
}
