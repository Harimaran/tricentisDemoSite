package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BooksPage extends HomePage{

    public BooksPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@href='/fiction'])[4]")
    public WebElement FictionBook;

    public CartPage clickBook(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
        wait.until(ExpectedConditions.visibilityOf(FictionBook));
        FictionBook.click();
        return new CartPage();
    }
}
