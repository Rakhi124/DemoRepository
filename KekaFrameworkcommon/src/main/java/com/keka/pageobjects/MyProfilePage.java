/**
 * 
 */
package com.keka.pageobjects;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.keka.actiondriver.Action;
import com.keka.base.BaseClass;

/**
 * @author Techversant
 *
 */
public class MyProfilePage extends BaseClass {

	static Action action = new Action();

	public String validateMyProfilePage() {
		action.JSClick(getDriver(), action.getElementsbyXpath(getDriver(), getXpathProfileButton()));
		action.JSClick(getDriver(), action.getElementsbyXpath(getDriver(), getXpathProfileIcon()));
		String Act = action.getElementsbyXpath(getDriver(), getXpathProfileHeading()).getText();
		return Act;
	}

	@SuppressWarnings("deprecation")
	public void validateAddSignature() throws InterruptedException, IOException {
		action.JSClick(getDriver(), action.getElementsbyXpath(getDriver(), getXpathDocument()));
		Thread.sleep(2000);
		WebElement ele = action.getElementsbyXpath(getDriver(), getXpathSignature());
		action.scrollByVisibilityOfElement(getDriver(), ele);

		action.JSClick(getDriver(), action.getElementsbyXpath(getDriver(), getXpathSignature()));
		Thread.sleep(2000);
		action.JSClick(getDriver(), action.getElementsbyXpath(getDriver(), getXpathAddSignature()));
		action.click(getDriver(), action.getElementsbyXpath(getDriver(), getXpathAttachSignature()));
		
		Thread.sleep(2000);
		//fileupload using AutoIT
		Runtime.getRuntime().exec("C:\\Users\\Techversant\\Desktop\\AutoIT\\FileUpload.exe");
		Thread.sleep(2000);
		action.JSClick(getDriver(), action.getElementsbyXpath(getDriver(), getXpathCloseSignature()));

	}

	public void validateIdentityDocs() throws InterruptedException, AWTException {
		action.JSClick(getDriver(), action.getElementsbyXpath(getDriver(), getXpathIdentityDoc()));
		action.JSClick(getDriver(), action.getElementsbyXpath(getDriver(), getXpathaddDetail()));
		Thread.sleep(2000);
		action.click(getDriver(), action.getElementsbyXpath(getDriver(), getXpathAddAttchment()));
		Thread.sleep(2000);

		action.fileuploadRobotClass(getDriver(),getFilePath());
	
	}
	

}