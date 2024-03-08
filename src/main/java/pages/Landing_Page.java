package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.BaseUtil;

public class Landing_Page extends BaseUtil{

	private BaseUtil base;
	public Landing_Page(BaseUtil base) {
		this.base = base;
	}

	
	By cookieAgreeButton = By.xpath("//span[contains(text(),'AGREE')]/..");
//	By cookieAgreeButton = By.xpath("/html/body/div[1]/div/div/div/div[2]/div/button[3]");
	By searchField = By.xpath("//input[@type='search']");
	
	
	public void handCookiePopup() {
		WebDriverWait wait = new WebDriverWait(base.driver, 20);
		WebElement agreeButton = wait.until(ExpectedConditions.
				visibilityOfElementLocated(cookieAgreeButton));
		agreeButton.click();
	}
	
	public void enterDataIntoSearchField(String postcode) {
		WebElement search = base.driver.findElement(searchField);
		boolean status = search.isDisplayed();
		assertTrue(status);
		
		base.driver.findElement(searchField).click();
		base.driver.findElement(searchField).sendKeys(postcode);
	}
	
	public void validateSearchFieldData(String expectedData) {
		WebElement search = base.driver.findElement(searchField);
		String actualData = search.getAttribute("value");
		
		boolean status = actualData.equals(expectedData);
		assertTrue(status);
		
		
		
	}

}
