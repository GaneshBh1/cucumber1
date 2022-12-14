package org.StepDefination;

import org.base.Helperclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojoClass.LoginPojo1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends Helperclass {
	@Given("open login page")
	public void open_login_page() {
		lanchuChromeBrowser();
		url("https://automationexercise.com/login");


	}


@When("enter {string} and {string}")
public void enter_and(String name1, String Pass1) {
LoginPojo1 l = new LoginPojo1();
l.getEmail1().sendKeys(name1);
l.getPass1().sendKeys(Pass1);
	}
	@Then("click login")
	public void click_login() {
		LoginPojo1 l= new  LoginPojo1();
		l.getLogin().click();
	}

	@Then("Show {string}")
	public void show(String warning) {
		System.out.println(warning);
		WebElement findElement = driver.findElement(By.xpath("//*[contains(text(),'Your email or password is incorrect!')]"));
		
		String text = findElement.getText();
		if (text.contains(text)) {
			System.out.println("Pass");
		} else {
			System.out.println("Faill");

		}

	}


}
