package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef 
{
	WebDriver driver;
	@Given("If user is on home page")
	public void if_user_is_on_home_page() {
		 WebDriverManager.firefoxdriver(); 
			driver=new FirefoxDriver();
			driver.get("http://demo.cyclos.org/ui/home");

	}

	@When("click on login link")
	public void click_on_login_link() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='login-link']")).click();    
	}

	@When("enter login details")
	public void enter_login_details() {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");

		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();	    
	}

	@Then("verify logout link")
	public void verify_logout_link() throws Exception {
		Thread.sleep(4000);

		driver.findElement(By.id("logout-trigger")).click();
		Thread.sleep(4000);

		driver.quit();		}

}
