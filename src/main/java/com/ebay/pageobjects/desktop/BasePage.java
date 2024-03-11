package com.ebay.pageobjects.desktop;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ebay.pageobjects.desktop.LoginPage;
import com.ebay.utils.Utils;

public class BasePage {

	private WebDriver driver;
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	private WebElement singinLink;

	public BasePage(WebDriver driver) {
		this.driver = driver;

		driver.get(Utils.getValueFromConf("ebay.url"));

		PageFactory.initElements(driver, this);

		@SuppressWarnings("deprecation")
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofMinutes(60))
				.pollingEvery(Duration.ofMinutes(10))
		.ignoring(NoSuchElementException.class);
	}

	public LoginPage gotoLoginPage() {
		singinLink.click();
		return new LoginPage(driver);
	}
}
