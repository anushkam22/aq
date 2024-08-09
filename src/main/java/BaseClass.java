

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class BaseClass {

	public WebDriver driver = null;
//	public FileUtility flib = new FileUtility();
//	public ExcelUtility elib = new ExcelUtility();
//	public JavaUtility jlib = new JavaUtility();
//	public WebDriverUtility wlib = new WebDriverUtility();
//	public DatabaseUtility dlib = new DatabaseUtility();
//	public static WebDriver sdriver = null;
//
//	@BeforeSuite(alwaysRun = true)
//	public void configBS() throws Throwable {
//		dlib.getDbConnection();
//
//	}

//	@BeforeClass(groups = "ST")
//	public void configBs() throws Throwable {
//		String browser = flib.getDataFromPropertiesFile("browser");
//		String url = flib.getDataFromPropertiesFile("url");
//		if (browser.equals("chrome")) {
//			driver = new ChromeDriver();
//		} else if (browser.equals("firefox")) {
//			driver = new FirefoxDriver();
//		}
//		sdriver = driver;
//		wlib.maximizeWindow(driver);
//		driver.get(url);
//		UtilityClassObject.setDriver(driver);
//	}

//	//for cross browser execution
	@Parameters("BROWSER")
	@BeforeClass(alwaysRun = true)
	public void configBsCross(String browser) throws Throwable {
		String BROWSER = browser;
	//	String url = flib.getDataFromPropertiesFile("url");
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
//		sdriver = driver;
//		wlib.maximizeWindow(driver);
//		driver.get(url);
//		UtilityClassObject.setDriver(driver);
	}

	@BeforeMethod(alwaysRun = true)
	public void login() throws IOException {
//		String url = flib.getDataFromPropertiesFile("url");
//		String username = flib.getDataFromPropertiesFile("username");
//		String password = flib.getDataFromPropertiesFile("password");
//		LoginPage lp = new LoginPage(driver);
//		lp.login(url, username, password);
	}

	@AfterMethod(alwaysRun = true)
//	public void logOut() throws IOException {
//		HomePage hp = new HomePage(driver);
//		hp.logOut();
	

	@AfterClass(alwaysRun = true)
	public void ConfigAC() {
		driver.quit();
	}

	@AfterSuite(alwaysRun = true)
	public void ConfigAs() throws Throwable {
	//	dlib.closeConnection();
	}

}
