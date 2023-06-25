package stepDefinitions;

import io.cucumber.java.en.*;
import org.pages.BooksPage;
import org.pages.CartPage;
import org.pages.HomePage;
import org.test_manager.TestManager;

public class HomePageDefinitions {

    HomePage home;
    BooksPage book;

    @Given("user navigates to homepage without login")
    public void user_navigates_to_homepage_without_login() {

        System.out.println("Entered cucumber");
//        home = new HomePage();
    }
    @When("clicks on Books link in header")
    public void clicks_on_books_link_in_header() {
        book = home.gotoBooks();
    }
    @Then("user should be taken to books section")
    public void user_should_be_taken_to_books_section() {
        CartPage cart = book.clickBook();
        cart.AddInCart();
    }

}
