package org.pojoClass;

import org.base.Helperclass;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo1 extends Helperclass {
	public LoginPojo1() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/button")
	private WebElement login;


	public WebElement getLogin() {
		return login;
	}
	@FindBy(name="email")
	private WebElement email1;

	public WebElement getEmail1() {
		return email1;
	}
	@FindBy(name="password")
	private WebElement pass1;
	public WebElement getPass1() {
		return pass1;
	}
	{


	}



}
