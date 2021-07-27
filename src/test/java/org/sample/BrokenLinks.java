package org.sample;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\7pmFasttrackCucumberClass\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		int brokenLink = 0;
		for (int i = 0; i < links.size(); i++) {
			String attribute = links.get(i).getAttribute("href");

			if (attribute != null) {
				URL url = new URL(attribute);
				URLConnection openConnection = url.openConnection();
				HttpsURLConnection connection = (HttpsURLConnection) openConnection;
				int responseCode = connection.getResponseCode();
				if (responseCode != 200) {
					System.out.println("Broken Link Name:" + attribute);
					brokenLink++;
				}
			}
		}
		System.out.println("Broken Link Count :" + brokenLink);

		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("welcomejava");
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("selenium java");
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();

	}
}
