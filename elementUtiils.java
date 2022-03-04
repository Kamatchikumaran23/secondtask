package Utils;

 import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class elementUtiils {

	public WebDriver driver;
	
	public elementUtiils(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public WebElement getWebElement(By locator) { 
	return	(WebElement) driver.findElement(locator);        
	}

	public List<WebElement> getWebElements(By locator) {
		return (List<WebElement>) driver.findElements(locator);
	}
	
	public String getTetboxValue(By locator) {
		return  getWebElement(locator).getAttribute("value");
	}
	
	public void doSendKeys(By locator , String data) {
		WebElement ele = getWebElement(locator);
		if(!getTetboxValue(locator).equals("")) {
			ele.clear();
		}
		ele.sendKeys(data);
	
		
		
	}
	public void doClick(By locator) {
	
		getWebElement(locator).click();
		
	}
	public String dogetText(By locator) {
		return getWebElement(locator).getText().trim();
	
		
		
	}
	public List<String> dogetTexts(By locator) {
	
	List<WebElement> elements=  getWebElements(locator);
	List <String> texts = new ArrayList<>();
	
	for (WebElement ele : elements){
		texts.add(ele.getText());
	}
		return texts;
	}
	public String getPageTitle() {
		return driver.getTitle();
		
	}
	public String getPageUrl() {
		return driver.getCurrentUrl();
		
		
	}
	public boolean isElemntDisplayed(By locator) {
	
		return getWebElement(locator).isDisplayed();
		
	}
	public boolean isElementSelected(By locator) {
		
		return getWebElement(locator).isSelected();
	}
	public boolean isElementEnabled(By locator) {
		
		return getWebElement(locator).isEnabled();
	}

}
