package com.Testscripts;
//2nd commit
import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login 
{
WebDriver driver;

@Given("^I launch Chrome Browser$")
public void i_launch_Chrome_Browser() 
{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shravan\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();
	
   
}

@When("^I entered valid Gmail URl Gmail \"(.*?)\"$")
public void i_entered_valid_Gmail_URl_Gmail(String arg1) throws Throwable {
  driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
  
}

@When("^i entered My creditionals \"(.*?)\" \"(.*?)\"$")
public void i_entered_My_creditionals_and(String arg1, String arg2) throws Exception 
{
	driver.findElement(By.xpath("//DIV[contains(@id, 'identifierLink')]")).click();
	driver.findElement(By.xpath("//INPUT[contains(@id, 'identifierId')]")).sendKeys(arg1,Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//DIV[contains(@id, 'password')]")).sendKeys(arg2,Keys.ENTER);
	
}

@Then("^my  gmail account home page should be displed$")
public void my_gmail_account_home_page_should_be_displed()
{
   System.out.println("Gmail home paage dispalyed");
	
	
}
}

