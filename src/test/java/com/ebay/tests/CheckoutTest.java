package com.ebay.tests;

import com.ebay.pageobjects.desktop.BasePage;
import com.ebay.pageobjects.desktop.CheckoutPage;
import com.ebay.pageobjects.desktop.HomePage;
import com.ebay.pageobjects.desktop.LoginPage;
import com.ebay.utils.Utils;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckoutTest {

	//@Test(dataProvider="testdata")
	@Test
	@Parameters({ "browser", "userName", "password" })
	public void checkoutItems(String browser, String userName, String password)
			throws Exception {

		WebDriver driver = Utils.getDriver(browser);
		BasePage basePage = new BasePage(driver);
	/*	
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		CheckoutPage checkoutPage = new CheckoutPage(driver);

		loginPage = basePage.gotoLoginPage();
		loginPage.enterUserName(userName);
		loginPage.enterPassword(password);
		homePage = loginPage.login();
		checkoutPage = homePage.searchFor("Erasers");
		checkoutPage.addItemsFromSearchToCart(2);
		// assert checkout count message.
		SoftAssert softAssertion= new SoftAssert();
		softAssertion.assertTrue(checkoutPage.validateItemCountInTheCartAndMessage());

		// clean up for next execution
		checkoutPage.removeItems();

		// sign out

		checkoutPage.logout();
		
		
		
*/
		Thread.sleep(5000);
		driver.quit();

	}
//	
//	@DataProvider(name="testdata")
//	public Object[][] getData(){
//		
//		Object [][] data=new Object[2][3];
//
//		// Enter data to row 0 column 0
//		data[0][0]="chrome";
//		// Enter data to row 0 column 1
//		data[0][1]="virgil.jenkins@rediffmail.com";
//		// Enter data to row 1 column 0
//		data[0][2]="Ebay0007";
//		// Enter data to row 1 column 0
//		data[1][0]="chrome";
//		// Enter data to row 0 column 1
//		data[1][1]="virgil.jenkins@rediffmail.com";
//		// Enter data to row 1 column 0
//		data[1][2]="Ebay0007";
//		// return arrayobject to testscript
//		return data;
//		
//	}
}
