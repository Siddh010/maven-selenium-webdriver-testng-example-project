package testcases.mytheresa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
	
	public WebDriver driverSettings() {
 ChromeOptions capabilities = new ChromeOptions();
		capabilities.addArguments("--ignore-ssl-errors=yes");
		capabilities.addArguments("--ignore-certificate-errors");
		capabilities.addArguments("--allow-running-insecure-content");
		capabilities.addArguments("--remote-allow-origins=*");
		capabilities.setAcceptInsecureCerts(true);
   		WebDriver driver = new RemoteWebDriver(new URL("http://143.199.99.240:4444/wd/hub"), capabilities);
		
		return driver;
	}

}
