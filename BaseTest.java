package test;
	import java.util.Properties;

	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;

	import Factory.driverFactory;
	import pages.firstPage;
	import Utils.elementUtiils;
	public class BaseTest {
		
		public driverFactory driverfactory;
		public WebDriver driver;
		public Properties prop;
		public elementUtiils elementutils;
		public firstPage firstPage;

		
		@BeforeTest
		public void setup() {
			driverfactory = new driverFactory();
			prop = driverfactory.init_prop();
			driver = driverfactory.init_driver(prop);
			elementutils = new elementUtiils(driver);
			firstPage = new firstPage(driver);
			
		}
		
		//@AfterTest
		//public void tearDown() {
			
			//driver.close();
			
			
		//}
	}

