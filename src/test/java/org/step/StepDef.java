package org.step;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojo.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends BaseClass {

//	@Given("user is on facebook application")
//	public void userIsOnFacebookApplication() {
//
//	}
//
//	@When("user enter user name and password")
//	public void userEnterUserNameAndPassword(io.cucumber.datatable.DataTable dataTable) {
//		List<Map<String, String>> asMaps = dataTable.asMaps();
//		Map<String, String> map = asMaps.get(1);
//		String string = map.get("username");
//		WebElement txtUserName = driver.findElement(By.id("email"));
//		txtUserName.sendKeys(string);
//		String string2 = map.get("password");
//		WebElement txtPassword = driver.findElement(By.id("pass"));
//		txtPassword.sendKeys(string2);
//	}
//
//	@When("user should click login button")
//	public void userShouldClickLoginButton() {
//		WebElement btnLogin = driver.findElement(By.name("login"));
//		btnLogin.click();
//		Assert.assertTrue(false);
//	}
//
//	@Then("user need to validate")
//	public void userNeedToValidate() {
//		System.out.println("Invalid Login");
//	}

}
