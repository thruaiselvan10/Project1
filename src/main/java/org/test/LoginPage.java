package org.test;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	
	          public LoginPage() {
				PageFactory.initElements(driver, this);
			}
	
	         
			@FindBy(id = "email")
	      	private WebElement txtusername;
	      	
	      	

	      	@FindBy(id = "pass")
	      	private WebElement txtpassword;
	      	
	      	@FindBy(name = "login")
	      	private WebElement loginbtn;
	
	
	
	
	      	public WebElement getTxtusername() {
				return txtusername;
			}

			public WebElement getTxtpassword() {
				return txtpassword;
			}

			public WebElement getLoginbtn() {
				return loginbtn;
			}
	
	
	
	
	
	
}
