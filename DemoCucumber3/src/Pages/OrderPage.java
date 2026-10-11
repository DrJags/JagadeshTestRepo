package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
	
	@FindBy(xpath="//*[@id='ctl00_menu']/li[3]/a")
	WebElement orderLink;
	
	public WebElement getOrderLink() {
		return orderLink;
	}

	public void setOrderLink(WebElement orderLink) {
		this.orderLink = orderLink;
	}

	public WebElement getQuantity() {
		return Quantity;
	}

	public void setQuantity(WebElement quantity) {
		Quantity = quantity;
	}

	public WebElement getPricePerUnit() {
		return PricePerUnit;
	}

	public void setPricePerUnit(WebElement pricePerUnit) {
		PricePerUnit = pricePerUnit;
	}

	@FindBy(xpath="//*[@id='ctl00_MainContent_fmwOrder_txtQuantity']")
	WebElement Quantity;
	
	@FindBy(xpath="//*[@id='ctl00_MainContent_fmwOrder_txtUnitPrice']")
	WebElement PricePerUnit;
	
	WebDriver driver;
	   
	 public OrderPage(WebDriver webdriver)
	 {
		 driver=webdriver;
		 PageFactory.initElements(driver, this);
	 }
	

}