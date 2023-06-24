package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BooksPage{

    public CartPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//input[@value='Add to cart'])[1]")
    public WebElement addToCart;

    public void AddInCart(){
        addToCart.click();
    }
}
