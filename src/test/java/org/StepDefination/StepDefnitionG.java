package org.StepDefination;

import org.base.Helperclass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.pojoClass.Pojoclass1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefnitionG extends Helperclass{
	@Given("Open google")
	public void open_google() {
		lanchuChromeBrowser();
		url("https://www.google.co.in/");


	}

	@When("Type different {string}")
	public void type_different(String name) {
	  
		Pojoclass1 p = new Pojoclass1();
		p.getGooglesearch().sendKeys(name);
		p.getGooglesearch().sendKeys(Keys.ENTER);

	}

	
	@When("Type different name")
	public void type_different_name() throws InterruptedException {
	    
		Pojoclass1 p1 = new Pojoclass1();
		p1.getGooglesearch().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement findElement = driver.findElement(By.xpath
				("//*[contains(text(),'Selenoim') ]"));
		Thread.sleep(3000);

		String text = findElement.getText();
		Thread.sleep(3000);
		System.out.println(text);
		System.out.println("1234");
		
	}

	@Then("see the page")
	public void see_the_page() throws InterruptedException {


	
		
	
		/*if (findElement.getText().contains("Java")){
			System.out.println(" Java pass");
		}

		
		if (findElement.getText().contains("Selenium")){
			System.out.println(" Selenium pass");
			
			
		}

		if (findElement.getText().contains("AWS")){
			System.out.println(" AWS pass");
		}
		
		
		else {
			System.out.println("fail");
	//	driver.quit();

	}*/
	}
}
	/*@Given("OPen google Chrome")
	public void open_google_Chrome() {
		lanchuChromeBrowser();
		url("https://www.google.co.in/");
	}

	@When("Type different {string}")
	public void type_different(String name) throws InterruptedException {
		Pojoclass1 p = new Pojoclass1();
		p.getGooglesearch().sendKeys(name);
		p.getGooglesearch().sendKeys(Keys.ENTER);
		
	}

	@Then("See the pages")
	public void see_the_pages() throws InterruptedException {
		Thread.sleep(5000);
		WebElement findElement = driver.findElement(By.xpath("//*[contains(text(),'Showing results')]"));
		System.out.println(findElement.getText());
		if (findElement.getText().contains("Showing")){
			System.out.println("pass");
		} else {
			System.out.println("fail");

		}
		driver.quit();
	}

*/







