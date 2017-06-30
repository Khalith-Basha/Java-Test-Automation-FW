package com.mh.ta.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mh.ta.page.BaseElements;

public class LoginElements extends BaseElements {

	public WebElement txtEmail() {
		return this.driver.findElement(By.id("identifierId"));
	}

	public WebElement btnNext() {
		return this.driver.findElement(By.xpath("//span[text()='Next']"));
	}

	public WebElement txtPassword() {
		return this.driver.findElement(By.id("Passwd"));
	}

	public WebElement btnSignIn() {
		return this.driver.findElement(By.id("signIn"));
	}
}