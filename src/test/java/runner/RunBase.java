package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunBase {

	static WebDriver driver;

	public enum Browser {Chrome, Firefox}

	public static WebDriver getDriver() {
		if (driver == null) {
			return getDriver(Browser.Chrome);
		} else {
			return driver;
		}
	}

	public static WebDriver getDriver(Browser browser) {
		if (driver != null) {
			driver.quit();
		}
		switch (browser) {
			case Chrome:
				driver = new ChromeDriver();
				break;
			case Firefox:
				driver = new FirefoxDriver();
				break;
			default:
				throw new IllegalArgumentException("Navegador inválido, repita.");
		}
		return driver;
	}

}
