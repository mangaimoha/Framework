package org.pom.locators;
import java.util.List;

import org.demo.LibGlobalClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseJavaPojo extends LibGlobalClass {

	public CourseJavaPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//a[contains(@href,'course')])[1]")
	private WebElement course;
	@FindBy(xpath = "(//a[contains(@href,'java-training')])[1]")
	private WebElement javaContent;
	@FindBy(xpath = "(//a[contains(text(),'Core Java Training')])[1]")
	private WebElement coreJava;
	@FindBy(xpath = "//h2[contains(text(),'Reviews from Anitha')]")
	private WebElement reviews;
	@FindBy(xpath = "//p[contains(text(),'attended few demo classes')]")
	private WebElement para;
	public WebElement getCourse() {
		return course;
	}
	public WebElement getJavaContent() {
		return javaContent;
	}
	public WebElement getCoreJava() {
		return coreJava;
	}
	public WebElement getReviews() {
		return reviews;
	}
	public WebElement getPara() {
		return para;
	}

}
