package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Base;

public class LoginPage extends Base {
	
	

	public void user_enter_username_and_password() {
		WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys(prop.getProperty("username"));
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys(prop.getProperty("password"));
		WebElement loginbtn= driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbtn.click();
	}
	public boolean validate_successfull_login() {
		return driver.findElement(By.xpath("//span[@class='title']")).isDisplayed();
	}
}
