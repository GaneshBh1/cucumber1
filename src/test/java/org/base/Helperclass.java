package org.base;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Helperclass {

	public static WebDriver driver;

	public static void lanchuChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	public static void maxi() {
		driver.manage().window().maximize();
	}

	public static void url(String url ) {
		driver.get(url);
	}


	public static void filltext(WebElement loc,String value ) {
		loc.sendKeys(value);
	}
	public static void btnClick(WebElement loc) {
		loc.click();
	}
	public static void text(WebElement element) {
		element.getText();	
	}
	public static void screenshot(String name) throws IOException {
		TakesScreenshot t=(TakesScreenshot)driver;
		File screenshotAs = t.getScreenshotAs(OutputType.FILE);
		File fl=new File("C:\\Users\\S.GANESH\\eclipse-workspace\\Maven5pm\\Screnshot\\"+name+".png");
		FileUtils.copyFile(screenshotAs, fl);
	}	
	public static void sleep() throws InterruptedException {
		Thread.sleep(3000);

	}
	private void title(String Title) {
		driver.getTitle();
	}

	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void action(WebElement prime) {
		Actions ref=new Actions(driver);
		ref.moveToElement(prime);
	}
	public static void doubleclick(WebElement location ) {
		Actions ref1=new Actions(driver);
		ref1.doubleClick(location).perform();
	}

	public static void drag(WebElement source,WebElement target ) {
		Actions ref2=new Actions(driver);
		ref2.dragAndDrop(source, target).perform();
	}
	public static void rightclick(WebElement target) {
		Actions ref3=new Actions(driver);
		ref3.contextClick(target).perform();
	}

	public static void keyDown( ) {
		Actions ref4=new Actions(driver);
		ref4.keyDown(Keys.SHIFT).build().perform();
	}
	public static void keyUp(  ) {
		Actions ref4=new Actions(driver);
		ref4.keyUp(Keys.SHIFT).build().perform();
	}
	public static void keypress() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
	}
	public static void keyrelease() throws AWTException {
		Robot r=new Robot();
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	public static void scrollDown(WebElement args) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", args);

	}
	public static void scrollup(WebElement args) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", args);	
	}
	//Alert
	public static void accept() {
		Alert a= driver.switchTo().alert();	
		a.accept();	
	}
	public static void dismiss() {
		Alert a= driver.switchTo().alert();	
		a.dismiss();
	}	

	public static void sendValue(String keysToSend ) {
		Alert a= driver.switchTo().alert();	
		a.sendKeys(keysToSend);
	}

	public static void jsSendKey(String script, WebElement args) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript(script, args);	

//Excel file reading
	}
	public static String readexcel(String Sheet1, int row,int cell) throws IOException {
	File f= new File("C:\\Users\\S.GANESH\\eclipse-workspace\\Maven5pm\\Sheet\\Book1.xlsx");
	
	FileInputStream fi=new FileInputStream(f); 
	
	Workbook book=new XSSFWorkbook(fi);
	
	Sheet sheet = book.getSheet(Sheet1);
	
	Row row1 = sheet.getRow(row);
	
	Cell cell2 = row1.getCell(cell);
	
	int type = cell2.getCellType();
	
	String name="";
	
	if (type==1) {
		
		 name = cell2.getStringCellValue();}
	else if (DateUtil.isCellDateFormatted(cell2)) {
		Date d = cell2.getDateCellValue();
		SimpleDateFormat s= new SimpleDateFormat("dd,MMM,yyy");
		name=s.format(d);
	}else {
		double d = cell2.getNumericCellValue();
		long l=(long)d;
		name= String.valueOf(1);
	}
	
	
	   return name;
}
public Float datetime() {

Date d= new Date();
SimpleDateFormat s= new SimpleDateFormat("dd/MM/yyy hh:mm:ss");
String format = s.format(d);

System.out.println(format);
return format();


}
private Float format() {
	return null;
}
}







