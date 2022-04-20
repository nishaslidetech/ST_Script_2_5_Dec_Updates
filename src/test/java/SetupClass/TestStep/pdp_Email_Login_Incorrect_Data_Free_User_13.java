package SetupClass.TestStep;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.junit.Assert;
import SetupClass.Set;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class pdp_Email_Login_Incorrect_Data_Free_User_13 extends Set {
	WebDriverWait wait = new WebDriverWait(driver,50);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@Given("^user is already on PDP Page NA xiii$")
	public void user_is_already_on_PDP_Page_NA_xiii() throws Throwable {
		 driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.get("https://www.slideteam.net/papa-johns-company-profile-overview-financials-and-statistics-from-2014-2018.html");
		Thread.sleep(3000);
		
	}

	@Then("^User click on Download button to download the product xiii$")
	public void user_click_on_Download_button_to_download_the_product_xiii() throws Throwable {
		Thread.sleep(1000);
		WebElement download_btn_pdp= wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Download this presentation']")));
		 js.executeScript("arguments[0].scrollIntoView();",download_btn_pdp);	
	         download_btn_pdp.click();
	         Thread.sleep(3000);
	         WebElement registeredUsers = wait
				.until(ExpectedConditions.elementToBeClickable(By.linkText("Registered Users")));
	 
	         js.executeScript("arguments[0].click();", registeredUsers);
		 Thread.sleep(2000);
	}

	@Then("^user is redirected to Login page xiii$")
	public void user_is_redirected_to_Login_page_xiii() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^user enter incorrect details to login xiii$")
	public void user_enter_incorrect_details_to_login_xiii() throws Throwable {
		WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']")));
		Thread.sleep(2000);
		username.sendKeys("*&#@Y #RHFGHJEGFYUJEh");
		Thread.sleep(2000);
		
		WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']")));
		Thread.sleep(2000);
		password.sendKeys("jhjhddhjdhdfhfhfh");
		Thread.sleep(2000);
		
		WebElement login_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//fieldset[@class='fieldset login']//button[@id='send2']")));
		Thread.sleep(2000);
		login_btn.click();
		Thread.sleep(2000);
	}

	@Then("^error message is displayed xiii$")
	public void error_message_is_displayed_xiii() throws Throwable {
		
		WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']")));
		Thread.sleep(2000);
		username.clear();
		Thread.sleep(2000);
		
		WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']")));
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
	   
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

	@Then("^user login with correct details xiii$")
	public void user_login_with_correct_details_xiii() throws Throwable {
		WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']")));
		Thread.sleep(2000);
		username.sendKeys("slideteam.qa@yahoo.com");
		Thread.sleep(2000);
		
		WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']")));
		Thread.sleep(2000);
		password.sendKeys("123456");
		Thread.sleep(2000);
		
		WebElement login_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//fieldset[@class='fieldset login']//button[@id='send2']")));
		Thread.sleep(2000);
		login_btn.click();
		Thread.sleep(2000);
		
		
		
		
	}
	
	@Then("^user is reedirected to pricing page xiii$")
	public void user_is_reedirected_to_pricing_page_xiii() throws Throwable {
		
		Thread.sleep(1000);
	    
	}

	@Then("^user logout from website xiii$")
	public void user_logout_from_website_xiii() throws Throwable {
	    
		Thread.sleep(1000);
		try {
			WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
			if (logout.isEnabled()) {
				logout.click();
				Thread.sleep(8000);
				driver.navigate().refresh();
				Thread.sleep(2000);
			}
		} catch (NoSuchElementException Ext) {
			
			

		}
		Thread.sleep(2000);
		String verifySignout = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[@class='base']")))
				.getText();
		System.out.println("verifySignout = " + verifySignout);

		Assert.assertTrue("Your are not Signout from application ", verifySignout.contentEquals("YOU ARE NOW LOGGED OUT"));
	}

	


}
