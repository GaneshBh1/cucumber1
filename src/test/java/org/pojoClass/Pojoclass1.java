package org.pojoClass;

import org.base.Helperclass;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoclass1 extends Helperclass {
		public Pojoclass1() {
	PageFactory.initElements(driver, this);
	}
	
		@FindBy(name="q")
		private WebElement googlesearch;

		public WebElement getGooglesearch() {
			return googlesearch;
		}
	
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


