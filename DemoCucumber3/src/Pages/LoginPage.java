package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	
   public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}

   @FindBy(xpath="//*[@id='ctl00_MainContent_username']")
   WebElement username;
   
   @FindBy(xpath ="//*[@name='ctl00$MainContent$password']")
   WebElement password;
   
   @FindBy(xpath="//*[@id='ctl00_MainContent_login_button']")
   WebElement login;
	
   WebDriver driver;
   
 public LoginPage(WebDriver webdriver)
 {
	 driver=webdriver;
	 PageFactory.initElements(driver, this);
 }
 
}

