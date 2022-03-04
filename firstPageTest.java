	package test;

	import org.testng.annotations.Test;

	public class firstPageTest extends BaseTest { 
		
//		@Test
//		public void firstPageTest() {		
//			firstPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));		
//		}
		
		@Test
		public void firstPageTest() {
			
			firstPage.validation();
			firstPage.getValue();
			firstPage.getPageUrl();
		
			
		}
		
		
	}
