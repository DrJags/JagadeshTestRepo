import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import Pages.OrderPage;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Implementation {
	static WebDriver driver; // Static makes the scenario 2 will run else first
								// scenario only will run
	static Properties prop;
	LoginPage loginpage;
    OrderPage orderpage;
    
	@Before
	public void DBopen() {
		System.out.println("Database is opened");
	}

	@After
	public void DBClose() {
		System.out.println("Database is closed");
		// driver.close();
	}

	@Given("^open the browser$")
	public void open_the_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Open the Browser Here");
		System.setProperty("webdriver.chrome.driver", "G:\\Chrome Driver\\chromedriver.exe"); // use
																								// double
																								// slash
																								// (\\)
		driver = new ChromeDriver();
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\ADMIN\\workspace\\EndToEndAPack\\src\\Configuration\\objectRepository.properties");
		prop.load(fis);
	}

	/*
	 * @When("^navigate to the application$") public void
	 * navigate_to_the_application() throws Throwable { driver.get(
	 * "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
	 * ); //get belongs to Web Driver interface.
	 * driver.manage().window().maximize(); }
	 */

	@When("^enter username$")
	public void enter_username() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys("Tester");
	}

	@When("^enter password$")
	public void enter_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys("test");
	}
}
