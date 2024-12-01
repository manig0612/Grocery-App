package com.grocery;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GroceryTest_1 {
	
	
	
	public static void main (String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("manikandang0612@gmail.com");
		WebElement passtxt = driver.findElement(By.id("pass"));
		passtxt.sendKeys("Mani@0612");
		WebElement loginButtonPressed = driver.findElement(By.xpath("//button[text() = 'Login']"));
		loginButtonPressed.click();
		
		Thread.sleep(2000);
		WebElement dropdowncat = driver.findElement(By.xpath("//a[text() = 'CATEGORIES ']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(dropdowncat).perform();
		
		WebElement catGrocery = driver.findElement(By.xpath("//a[text() = 'Grocery']"));
		action.moveToElement(catGrocery).perform();
		
		WebElement carFruit = driver.findElement(By.xpath("//a[contains(text(), 'Fruit')]"));
		action.moveToElement(carFruit).click().perform();
		
		Thread.sleep(5000);
		WebElement addbtnPressed = driver.findElement(By.xpath("//a[text() = 'Add'][1]"));
		addbtnPressed.click();
		
		Thread.sleep(2000);
		WebElement addCartBtn = driver.findElement(By.id("cart-53"));
		addCartBtn.click();
		
		Thread.sleep(2000);
		WebElement goToCart = driver.findElement(By.xpath("//a[text() = ' Go To Cart ']"));
		goToCart.click();
		
		Thread.sleep(3000);
		WebElement addDeliverAddress = driver.findElement(By.xpath("//div[@class = 'diffAddres addAddress d-flex justify-content-center align-items-center mb-md-0 mb-2']"));
		addDeliverAddress.click();
		
		Thread.sleep(3000);
		WebElement SelectDeleiveryOption = driver.findElement(By.id("address_type"));
		SelectDeleiveryOption.click();
		
		Select select = new Select(SelectDeleiveryOption);
		select.selectByVisibleText("Office");
		
		Thread.sleep(2000);
		WebElement firstnametxt = driver.findElement(By.xpath("//input[@name = 'first_name']"));
		firstnametxt.sendKeys("mani");
		
		Thread.sleep(2000);
		WebElement lastNameTxt = driver.findElement(By.xpath("//input[@name = 'last_name']"));
		lastNameTxt.sendKeys("kandan");
		
		Thread.sleep(2000);
		WebElement phNumText = driver.findElement(By.xpath("//input[@name = 'mobile']"));
		phNumText.sendKeys("9176209907");
		
		Thread.sleep(2000);
		WebElement firstAddressText = driver.findElement(By.xpath("//input[@name = 'apartment']"));
		firstAddressText.sendKeys("140 post office street");
		
		Thread.sleep(3000);
		WebElement lastAddressTxt = driver.findElement(By.xpath("//input[@name = 'address']"));
		lastAddressTxt.sendKeys("Thuraipakkam");
		
		Thread.sleep(2000);
		WebElement selectState = driver.findElement(By.xpath("//select[@name = 'state']"));
		Select stSelect = new Select(selectState);
		
		stSelect.selectByVisibleText("Tamil Nadu");
		
		Thread.sleep(3000);
		WebElement selectCity = driver.findElement(By.xpath("//select[@name = 'city']"));
		
		Select ctSelect = new Select(selectCity);
		ctSelect.selectByVisibleText("Chennai");
		
		Thread.sleep(3000);
		WebElement zipCodeText = driver.findElement(By.xpath("//input[@name = 'zipcode']"));
		zipCodeText.sendKeys("600097");
		
		Thread.sleep(3000);
		WebElement PressSaveBtn = driver.findElement(By.xpath("//button[@class = 'saveAddress font18 fontSemiBold colorWhite bgTheme radius50 borderNone px-5 py-2 hover1']"));
		PressSaveBtn.click();
		
		
		Thread.sleep(3000);
		WebElement placeOrder = driver.findElement(By.xpath("//button[@id = 'placeOrder']"));
		placeOrder.click();
		
		
		
	}

}
