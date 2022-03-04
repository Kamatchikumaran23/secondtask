package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import Utils.elementUtiils;

public class firstPage {
//	private By username = By.xpath("//input[@id='email']");
//	private By password = By.xpath("//input[@id='pass']");
	private By status = By.xpath("//table[@id='instanceInfo']//td[text()='UP']");
	//private By environment = By.xpath("//table[@id='generalInfo']//tr[2]/td[2]");
	private By value = By.xpath("(//table[@id='instances']/tbody)[3]//td");
	
	private WebDriver driver;
	private elementUtiils elementutils;
	
	public firstPage(WebDriver driver) {
		this.driver=driver;
		elementutils = new elementUtiils(this.driver);
	}
	
	
//	public firstPage doLogin(String uname, String pwd) {
//		elementutils.doSendKeys(username, uname);
//		elementutils.doSendKeys(password, pwd);
//		return this;
//	}
		
		public firstPage validation() {
		
			String sts = elementutils.dogetText(status);
			//String env = elementutils.dogetText(environment);
			
			Reporter.log("Test Result: ");
			String Expct =  ("UP");
			Reporter.log("Expected Result : Status = " + Expct);
			String Actl = (sts);
			Reporter.log("Actual Result : Status = " + Actl);
			if(Expct.equals(Actl)) { //env.equalsIgnoreCase("test")) {
				
				Reporter.log("Result: Passed");
			}else {
				System.out.println(Expct);
				System.out.println(Actl);
				Reporter.log("Result: Failed");
			}
			return this;
		}
			
			public firstPage getValue() {
				
				String val = elementutils.dogetText(value);
				System.out.println(val);
				Reporter.log("Application : " + val);
				
				return this;
				
			}
			public firstPage getPageUrl() {
				String pageUrl = elementutils.getPageUrl();
				Reporter.log("Deployed MicroService URL : " + pageUrl);
				
				return null;
				
			}
	}