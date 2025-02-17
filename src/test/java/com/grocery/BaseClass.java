package com.grocery;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	WebDriver driver;
	
	Select select;
	
	Actions actions;
	
	
	public void toLaunchBrowser(String browserType) {
		switch (browserType) {
		case "CHROME":
			driver = new ChromeDriver();
			break;
		case "FIREFOX":
			driver = new FirefoxDriver();
			break;
		case "EDGE":
			driver = new EdgeDriver();
			break;
		case "INTERNET EXPLORER":
			driver = new InternetExplorerDriver();
			break;
		default:
			break;
		}
	}
	
	public void maximizeTheWindow() {
		driver.manage().window().maximize();
	}
	
	public void toGetURl (String url) {
		driver.get(url);
	}
	
	public String toGetTextFromWebpage(WebElement element) {
		String txt = element.getText();
		return txt;
	}
	
	public WebElement toFindLocatorById (String Id) {
		WebElement element = driver.findElement(By.id(Id));
		return element;
	}
	
	public WebElement toFindLocatorByName(String Name) {
		WebElement element = driver.findElement(By.name(Name));
		return element;
	}
	
	public WebElement toFindLocatorByClassName(String clsName) {
		WebElement element = driver.findElement(By.name(clsName));
		return element;
	}
	
	public WebElement toFindLocatorByXpath(String xxpath) {
		WebElement element = driver.findElement(By.xpath(xxpath));
		return element;
	}
	
	
	public void toClickBtn(WebElement element) {
		element.click();

	}
	
	public String getCellData(String sheet, int row, int column) throws IOException {
		
		File file = new File("C:\\Users\\Cyntexia\\eclipse-workspace\\GroceryAppTest\\TestDatas\\grocerydata.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet gotsheet = workbook.getSheet(sheet);
		Row gotrow = gotsheet.getRow(row);
		
		Cell gotcell = gotrow.getCell(column);
		
		CellType type = gotcell.getCellType();
		String sendKeys = null;
		switch (type) {
		 
		case STRING:
			sendKeys = gotcell.getStringCellValue();
			break;
			
		case NUMERIC :
			
			if (DateUtil.isCellDateFormatted(gotcell)) {
				Date datecellvalue = gotcell.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("dd-mmm-yy");
				 sendKeys = dateformat.format(datecellvalue);
				
			}
			
			else {
				 long numvalue = (long) gotcell.getNumericCellValue();
				sendKeys = String.valueOf(numvalue);
			}
			
			break;

		default:
			break;
		}
		
		return sendKeys;
		
		
	}
	
	public void toWriteExcel(int saverow, int saveCell,String saveToExcel) throws IOException {
		File file = new File("C:\\Users\\Cyntexia\\eclipse-workspace\\GroceryAppTest\\TestDatas\\grocerydata.xlsx");
        FileInputStream stream = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(stream);
        Sheet sheet = workbook.getSheet("Grocery");
        
        Row row = sheet.getRow(saverow);
        
		Cell cell = row.createCell(saveCell);
		cell.setCellValue(saveToExcel);
		FileOutputStream fs = new FileOutputStream(file);
		workbook.write(fs);
	}
	
	
	public void toSendKeys (WebElement element,String keystosend) {
		element.sendKeys(keystosend);
	}
	
	public void moveToelementacn(WebElement element) {
		actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	public void toSelectbyText(WebElement element, String selText) {
		
			select = new Select(element);
			select.selectByVisibleText(selText);
						
	}
	
	public void toSelectByValue(WebElement element, String selvalue) {
		select = new Select(element);
		select.selectByValue(selvalue);
	}
	
	public void toSelectByIndex (WebElement element, int index) {
		select = new Select(element);
		select.selectByIndex(index);
	}
	
	public void nexplicitWaitToclickableConditions(WebElement element, int waittime) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waittime));
	     wait.until(ExpectedConditions.elementToBeClickable(element));
		
		
	}
	
	public void explicitWaitToFindLocatorConditions(WebElement element, int wait) {
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait2.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	
	
	

}
