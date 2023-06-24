package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test_manager.TestManager;

public class LogInPage extends TestManager {
    public LogInPage(){
        PageFactory.initElements(TestManager.driver, this);
    }

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(xpath = "//input[@value='Log in']")
    public WebElement login;

    public void enterEmailAndPassword(){
        email.sendKeys("hari25@gmail.com");
        password.sendKeys("12345678");
    }
    public void clickLoginBtn(){
        login.click();

    }

}
