package org.pom;
import org.demo.LibGlobalClass;
import org.openqa.selenium.WebElement;
import org.pom.locators.CareerPojo;
import org.pom.locators.CertificationPagePojo;
import org.pom.locators.ContactPojo;
import org.pom.locators.CourseJavaPojo;
import org.pom.locators.HomePageGreensPojo;
public class GreensTech extends LibGlobalClass {	
	public static void main(String[] args) throws InterruptedException {
		openChrome();
		launchUrl("http://www.greenstechnologys.com/");
		
		HomePageGreensPojo home = new HomePageGreensPojo();	
		toScrollDown(home.getCopyRights());
		System.out.println( home.getCopyRights().getText());		
		Thread.sleep(1000);
		toScrollUp(home.getInstDet());
		System.out.println(home.getInstDet().getText());
		
		CertificationPagePojo cert = new CertificationPagePojo();		
		toClick(cert.getCertifications());
		toClick(cert.getSelenium());
		System.out.println(cert.getText().get(0).getText());
		System.out.println(cert.getTable().get(0).getText());
		
		CourseJavaPojo java = new CourseJavaPojo();		
		toMouseHover(java.getCourse());	
		toMouseHover(java.getJavaContent());
		toMouseHover(java.getCoreJava());
		toClick(java.getCoreJava());
		toScrollDown(java.getReviews());
		System.out.println(java.getPara().getText());
		
		CareerPojo career=new CareerPojo();		
		toClick(career.getCareer());
		toScrollDown(career.getCopyRights());
		System.out.println(career.getEmail().getText());
		
		driver.navigate().to("http://www.greenstechnologys.com/");
		ContactPojo contact = new ContactPojo();
		toClick(contact.getContacts());
		System.out.println(contact.getBranch().getText());
		toScrollDown(contact.getCopyRights());
		System.out.println(contact.getCopyRights().getText());
		
	
		
	}

}
