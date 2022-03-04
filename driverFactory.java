package Factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class driverFactory {
	public WebDriver driver;
	public Properties prop;
	public WebDriver init_driver(Properties prop) {
		
		String browser = prop.getProperty("browser");
		
		switch (browser.toUpperCase()) {
		case "CHROME":
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 break;
		case "IE":
			 WebDriverManager.iedriver().setup();
			 driver = new InternetExplorerDriver();
			 break;
		case "FIREFOX":
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			 break;
		default:
			System.out.println("please send the correct browser name ");
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;
	}
		
	public Properties init_prop() {
		prop = new Properties();
		try {
			prop.load(new FileInputStream("./src/test/java/config/config.properties"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
} 