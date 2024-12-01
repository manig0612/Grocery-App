package com.grocery;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Grocery_UsingBase extends BaseClass{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Grocery_UsingBase grocery = new Grocery_UsingBase();
		
		grocery.toLaunchBrowser("CHROME");
		grocery.maximizeTheWindow();
		grocery.toGetURl("https://www.omrbranch.com/");
		
		WebElement findloacator = grocery.toFindLocatorById("email");
		
		
		grocery.toSendKeys(findloacator, grocery.getCellData("Grocery", 1, 0));
		
		WebElement passText = grocery.toFindLocatorById("pass");
		
		grocery.toSendKeys(passText, grocery.getCellData("Grocery", 1, 1));
		
		
		WebElement clickLginBtn = grocery.toFindLocatorByXpath("//button[text() = 'Login']");
		grocery.toClickBtn(clickLginBtn);
		
		Thread.sleep(5000);
		WebElement tomovecatgaries = grocery.toFindLocatorByXpath("//a[text() = 'CATEGORIES ']");
		grocery.moveToelementacn(tomovecatgaries);
		
		Thread.sleep(3000);
		WebElement grocerycatgory = grocery.toFindLocatorByXpath("//a[text() = 'Grocery']");
		grocery.moveToelementacn(grocerycatgory);
		
		Thread.sleep(3000);
		WebElement toclickfruit = grocery.toFindLocatorByXpath("//a[contains(text(), 'Fruit')]");
		grocery.toClickBtn(toclickfruit);
		
		Thread.sleep(3000);
		WebElement toClickAddBtn = grocery.toFindLocatorByXpath("//a[text() = 'Add'][1]");
		grocery.toClickBtn(toClickAddBtn);
		
		Thread.sleep(3000);
		WebElement toAddKgBtn = grocery.toFindLocatorById("cart-53");
		grocery.toClickBtn(toAddKgBtn);
		
		Thread.sleep(3000);
		WebElement toCart = grocery.toFindLocatorByXpath("//a[text() = ' Go To Cart ']");
		grocery.toClickBtn(toCart);
		
		Thread.sleep(3000);
		WebElement toclickAddressBtn = grocery.toFindLocatorByXpath("//div[@class = 'diffAddres addAddress d-flex justify-content-center align-items-center mb-md-0 mb-2']");
		grocery.toClickBtn(toclickAddressBtn);
		
		Thread.sleep(3000);
		WebElement addAddress = grocery.toFindLocatorById("address_type");
		grocery.toSelectbyText(addAddress, "Office");
		
		Thread.sleep(3000);
		WebElement fillFirstTxt = grocery.toFindLocatorByName("first_name");
		grocery.toSendKeys(fillFirstTxt, grocery.getCellData("Grocery", 1, 2));
		
		Thread.sleep(3000);
		WebElement fillLastTxt = grocery.toFindLocatorByName("last_name");
		grocery.toSendKeys(fillLastTxt, grocery.getCellData("Grocery", 1, 3));
		
		Thread.sleep(2000);
		WebElement fillMobile = grocery.toFindLocatorByName("mobile");
		grocery.toSendKeys(fillMobile, grocery.getCellData("Grocery", 1, 4));
		
		Thread.sleep(3000);
		WebElement fillApartment = grocery.toFindLocatorByName("apartment");
		grocery.toSendKeys(fillApartment, grocery.getCellData("Grocery", 1, 5));
		
		Thread.sleep(3000);
		WebElement fillSecondAddress = grocery.toFindLocatorByName("address");
		grocery.toSendKeys(fillSecondAddress, grocery.getCellData("Grocery", 1, 6));
		
		Thread.sleep(3000);
		WebElement selState = grocery.toFindLocatorByXpath("//select[@name = 'state']");
		grocery.toSelectbyText(selState, "Tamil Nadu");
		
		Thread.sleep(3000);
		WebElement selCity = grocery.toFindLocatorByXpath("//select[@name = 'city']");
		grocery.toSelectbyText(selCity, "Chennai");
		
		Thread.sleep(3000);
		WebElement toSendZipCode = grocery.toFindLocatorByXpath("//input[@name = 'zipcode']");
		grocery.toSendKeys(toSendZipCode, grocery.getCellData("Grocery", 1, 7));
		
		Thread.sleep(3000);
		WebElement clickSaveBtn = grocery.toFindLocatorByXpath("//button[@class = 'saveAddress font18 fontSemiBold colorWhite bgTheme radius50 borderNone px-5 py-2 hover1']");
		grocery.toClickBtn(clickSaveBtn);
		
		Thread.sleep(3000);
		WebElement selPayment = grocery.toFindLocatorById("payment_type");
		grocery.toSelectByValue(selPayment, "debit_card");
		
		Thread.sleep(3000);
		
		WebElement toSelectCard = grocery.toFindLocatorByXpath("//label[text() = ' Visa ']");
		grocery.nexplicitWaitToclickableConditions(toSelectCard, 60);
		grocery.toClickBtn(toSelectCard);
		
		Thread.sleep(3000);
		WebElement toSendCardNum = grocery.toFindLocatorByName("card_no");
		grocery.toSendKeys(toSendCardNum, grocery.getCellData("Grocery", 1, 8));
		
		Thread.sleep(3000);
		WebElement toSelMonth = grocery.toFindLocatorById("month");
		grocery.toSelectByIndex(toSelMonth, 11);
		
		Thread.sleep(3000);
		WebElement selYear = grocery.toFindLocatorById("year");
		grocery.toSelectbyText(selYear, "2030");
		
		Thread.sleep(3000);
		WebElement sendCvv = grocery.toFindLocatorByName("cvv");
		grocery.toSendKeys(sendCvv, grocery.getCellData("Grocery", 1, 9));
		
		Thread.sleep(3000);
		WebElement pressPlaceOrderBtn = grocery.toFindLocatorById("placeOrder");
		grocery.toClickBtn(pressPlaceOrderBtn);
		
		///Thread.sleep(5000);
		System.out.println("User has been logged out after placing the order.");
		
		grocery.driver.manage().deleteAllCookies();
	    grocery.toGetURl("https://www.omrbranch.com/");
		
	    WebElement findloacator2 = grocery.toFindLocatorById("email");
		grocery.explicitWaitToFindLocatorConditions(findloacator2, 60);
		
		grocery.toSendKeys(findloacator2, grocery.getCellData("Grocery", 1, 0));
		
		WebElement passText2 = grocery.toFindLocatorById("pass");
		
		grocery.toSendKeys(passText2, grocery.getCellData("Grocery", 1, 1));
		
		Thread.sleep(3000);
		WebElement clickLginBtn2 = grocery.toFindLocatorByXpath("//button[text() = 'Login']");
		grocery.toClickBtn(clickLginBtn2);
		
		Thread.sleep(3000);
		WebElement selcHome = grocery.toFindLocatorByXpath("//a[contains(text(), 'Welcome')]");
		grocery.toClickBtn(selcHome);
		
		Thread.sleep(3000);
		WebElement toselMyAccount = grocery.toFindLocatorByXpath("//a[contains(text(), 'My')]");
		grocery.toClickBtn(toselMyAccount);
		
		Thread.sleep(3000);
		WebElement toselorder = grocery.toFindLocatorByXpath("//a[text() = 'orders']");
		grocery.toClickBtn(toselorder);
		
		Thread.sleep(3000);
		WebElement toSeleceOrderDetails = grocery.toFindLocatorByXpath("//a[text() = 'More Details'][1]");
		grocery.toClickBtn(toSeleceOrderDetails);
		
		Thread.sleep(3000);
		WebElement toGetOrderid = grocery.toFindLocatorByXpath("//p[text() = 'Order No: ']");
		String orderId = grocery.toGetTextFromWebpage(toGetOrderid);
	    grocery.toWriteExcel(1, 10, orderId);
		
		
		
		
		
		
		
		
	}

}
