package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	// public static global WebDriver reference
	public static WebDriver driver;
	public static Properties prop;

	public BaseClass() {

		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "//src//main/java//ConfigLayer//config.properties");
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// create static initialization() method
	public static void initialization() {
		// connect to the actual browser

		// Up casting
		driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();
		// implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// pageLoadTimeOut code
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		// delete all cookies
		driver.manage().deleteAllCookies();

		// open a url
		driver.get(prop.getProperty("url"));
	}

}