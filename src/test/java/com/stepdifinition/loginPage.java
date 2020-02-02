package com.stepdifinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginPage {
	WebDriver driver;
	@Given("User is on facebook page")
	public void user_is_on_facebook_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vignesh\\eclipse-Vijayakumar\\TestCucumber\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@When("User enter the username and password")
	public void user_enter_the_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("vijayakumar");
		driver.findElement(By.id("pass")).sendKeys("453sdfghj");
		
	}

	@Then("User click the login button")
	public void user_click_the_login_button() {
		driver.findElement(By.id("u_0_b")).click();
		driver.quit();
	}




}
