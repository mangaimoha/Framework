package org.pom.locators;

import java.util.List;

import org.demo.LibGlobalClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CertificationPagePojo extends LibGlobalClass {

	public CertificationPagePojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(@href,'Certifications')]")
	private WebElement certifications;

	@FindBy(xpath = "(//a[contains(@href,'selenium-course')])[2]")
	private WebElement selenium;

	@FindBy(tagName = "marquee")
	private List<WebElement> text;

	@FindBy(tagName = "table")
	private List<WebElement> table;

	public WebElement getCertifications() {
		return certifications;
	}

	public WebElement getSelenium() {
		return selenium;
	}

	public List<WebElement> getText() {
		return text;
	}

	public List<WebElement> getTable() {
		return table;
	}

}
