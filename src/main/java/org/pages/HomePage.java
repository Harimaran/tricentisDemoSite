package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test_manager.TestManager;

public class HomePage extends TestManager {

    public HomePage() {
        PageFactory.initElements(TestManager.driver, this);
    }

    @FindBy(css = "a[href='/login']")
    public WebElement login;

    @FindBy(xpath = "//ul[@class='top-menu']//a[@href='/books']")
    public WebElement headerBook;

    @FindBy(xpath = "(//a[@href='/computers'])[1]")
    public WebElement headerComputers;

    @FindBy(xpath = "//ul[@class='top-menu']//a[@href='/desktops']")
    public WebElement headerDesktops;

    @FindBy(xpath = "//ul[@class='top-menu']//a[@href='/notebooks']")
    public WebElement headerNoteBooks;

    @FindBy(xpath = "//ul[@class='top-menu']//a[@href='/accessories']")
    public WebElement headerAccessories;

    @FindBy(xpath = "(//a[@href='/electronics'])[1]")
    public WebElement headerElectronics;

    @FindBy(xpath = "//ul[@class='top-menu']//a[@href='/electronics']/ancestor::li/descendant::li[1]/a")
    public WebElement headerCamera;

    @FindBy(xpath = "//ul[@class='top-menu']//a[@href='/electronics']/ancestor::li/descendant::li[2]/a")
    public WebElement headerCellPhone;

    @FindBy(xpath = "//ul[@class='top-menu']//li//a[@href='/apparel-shoes']")
    public WebElement headerApparelAndShoes;

    @FindBy(xpath = "//ul[@class='top-menu']//li//a[@href='/digital-downloads']")
    public WebElement headerDigitalDownloads;

    @FindBy(xpath = "//ul[@class='top-menu']//li//a[@href='/jewelry']")
    public WebElement headerJewelry;

    @FindBy(xpath = "//ul[@class='top-menu']//li//a[@href='/gift-cards']")
    public WebElement headerGiftCards;

    public BooksPage gotoBooks() {
        headerBook.click();
        return new BooksPage();
    }

    public void gotoDesktops() {
        Actions action = new Actions(TestManager.driver);
        action.moveToElement(headerComputers).perform();
        headerDesktops.click();
    }

    public void gotoNoteBooks() {
        Actions action = new Actions(TestManager.driver);
        action.moveToElement(headerComputers).perform();
        headerNoteBooks.click();
    }

    public void gotoAccessories() {
        Actions action = new Actions(TestManager.driver);
        action.moveToElement(headerComputers).perform();
        headerAccessories.click();
    }

    public void gotoCamera() {
        Actions action = new Actions(driver);
        action.moveToElement(headerElectronics).build().perform();
        action.moveToElement(headerCamera).click().build().perform();
    }

    public void gotoCellPhones() {
        Actions action = new Actions(driver);
        action.moveToElement(headerElectronics).build().perform();
        action.moveToElement(headerCellPhone).click().build().perform();
    }

    public void gotoApparel() {
        headerApparelAndShoes.click();
    }

    public void gotoJewelry() {
        headerJewelry.click();
    }

    public void gotoGiftCards() {
        headerGiftCards.click();
    }

    public LogInPage clickLogin() {
        login.click();
        return new LogInPage();
    }

}
