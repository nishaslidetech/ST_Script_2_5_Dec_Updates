package SetupClass.TestStep;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.junit.Assert;
import SetupClass.Set;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class pdp_Email_Sign_UP_Correct_Data_2 extends Set {

	WebDriverWait wait = new WebDriverWait(driver,50);
	 JavascriptExecutor js = (JavascriptExecutor) driver;

	@Given("^user is already on PDP Page FP ii$")
	public void user_is_already_on_PDP_Page_FP_ii() throws Throwable {
		
		driver.get("https://www.slideteam.net/technology-powerpoint-templates/private-public-cloud-computing/0115-big-data-icon-set-data-analytics-icon-set-cloud-computing-networking-funnel-ppt-slide.html");
		Thread.sleep(2000);
	    
	}

	@Then("^User click on Download button to download the product ii$")
	public void user_click_on_Download_button_to_download_the_product_ii() throws Throwable {
		
		WebElement download_btn_pdp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Download this presentation']")));
		js.executeScript("arguments[0].scrollIntoView();", download_btn_pdp);
		Thread.sleep(2000);
		download_btn_pdp.click();
		Thread.sleep(2000);
	   
	}

	@Then("^user is redirected to sign up page ii$")
	public void user_is_redirected_to_sign_up_page_ii() throws Throwable {
	    
		// move to sign up form
		/*+WebElement sign_up_page = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign up")));
		Thread.sleep(2000);
		sign_up_page.click();
		Thread.sleep(2000);*/
		
	}

	@Then("^user enter new email and correct details to sign up ii$")
	public void user_enter_new_email_and_correct_details_to_sign_up_ii() throws Throwable {
		
		//generate new email id  to sign up
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();
	 
	    System.out.println(generatedString);
	    
	    String signup_email=generatedString;
	    String full_email="selenium.testing."+generatedString+"@gmail.com";
	    System.out.println(full_email);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		Thread.sleep(2000);
		WebElement new_email_signup = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@title= 'Email Address']")));
		Thread.sleep(2000);
		new_email_signup.sendKeys(full_email);
		Thread.sleep(2000);

		WebElement new_fname_signup = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@title= 'First Name']")));
		Thread.sleep(2000);
		new_fname_signup.sendKeys("Selenium");
		Thread.sleep(2000);

		WebElement new_lname_signup = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@title= 'Last Name']")));
		Thread.sleep(2000);
		new_lname_signup.sendKeys("Testing");
		Thread.sleep(2000);

		WebElement new_pwd_signup = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@class= 'input-text popupform-pass']")));
		Thread.sleep(2000);
		new_pwd_signup.sendKeys("selenium@123");
		Thread.sleep(2000);

		WebElement new_captcha_signup = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[@name= 'captcha[downloadable_ajax_loginform]']")));
		Thread.sleep(2000);
		new_captcha_signup.sendKeys("Aj7W2mtf9namwf55");

		WebElement new_btn_signup = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title= 'Sign UP']")));
		Thread.sleep(2000);
		new_btn_signup.click();
		Thread.sleep(4000);
		
		
			   
	}

	@Then("^user is redirected to pricing page And then user navigates to free ppt page ii$")
	public void user_is_redirected_to_pricing_page_And_then_user_navigates_to_free_ppt_page_ii() throws Throwable {
	   
		// free ppt pg
		/*Thread.sleep(2000);
		WebElement free_ppt_btn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'Free PPTs')]")));
		Thread.sleep(2000);
	    free_ppt_btn.click();
		Thread.sleep(1000);*/
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement free_ppt_btn1=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Free Stuff")));
		actions.moveToElement(free_ppt_btn1).moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Free PPTs')]"))).click().build().perform();
		Thread.sleep(7000);
	}

	@Then("^user downloads a free product ii$")
	public void user_downloads_a_free_product_ii() throws Throwable {
	   
		//driver.findElement(By.cssSelector("li.product:nth-child(1) > div:nth-child(1) > div:nth-child(2) > strong:nth-child(1) > span:nth-child(1) > a:nth-child(1)")).click();
		driver.get("https://www.slideteam.net/free-download-diverging-process-arrow-chart-4-steps-cycle-diagram-powerpoint-slides.html");
		Thread.sleep(3000);
		WebElement Dow_nload= driver.findElement(By.cssSelector("#clicking"));
		js.executeScript("arguments[0].scrollIntoView();",Dow_nload);
		Dow_nload.click();
		Thread.sleep(3000);
	   driver.get("https://www.slideteam.net/");
	   Thread.sleep(3000);
		
	}

	@Then("^user delete the account ii$")
	public void user_delete_the_account_ii() throws Throwable {
	   

		 driver.findElement(By.cssSelector("ul.header > li:nth-child(1) > a:nth-child(1)")).click();
		 Thread.sleep(3000);
		 
		


/*try {
			WebElement iframe = driver.findElement(By.id("livechat-full-view"));
			if(iframe.isDisplayed()) {
				driver.switchTo().frame(iframe);   
				 Actions act = new Actions(driver);
				 act.moveToElement(driver.findElement(By.cssSelector("#title .icon-minimize"))).build().perform();
				 Thread.sleep(2000);
					WebElement chat1=driver.findElement(By.cssSelector("#title .icon-minimize"));
					 Thread.sleep(1000);
						chat1.click();
						 Thread.sleep(1000);
						 driver.switchTo().defaultContent();
						 Thread.sleep(1000);
						 driver.switchTo().parentFrame();
					 Thread.sleep(1000);
			}
			else {
				

			System.out.println("chat window does not open");
			}
		}
				catch(NoSuchElementException NCP) {
					
				}



		 WebElement delete_account = driver.findElement(By.xpath("//a[contains(text(),'Delete Account')]"));
		js.executeScript("arguments[0].scrollIntoView();",delete_account);
		 delete_account.click();
		 Thread.sleep(3000);
		 WebElement continue_delete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"deleteaccount-form\"]/button[1]")));
		js.executeScript("arguments[0].scrollIntoView();",continue_delete); 
		continue_delete.click();
		 Thread.sleep(3000);
		
	}*/
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
		String verifySignout = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[@class='base']")))
				.getText();
		System.out.println("verifySignout = " + verifySignout);

		Assert.assertTrue("Your are not Signout from application ", verifySignout.contentEquals("YOU ARE NOW LOGGED OUT"));

	}


	
}
