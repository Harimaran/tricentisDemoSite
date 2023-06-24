package testScripts;

import org.pages.BooksPage;
import org.pages.CartPage;
import org.pages.HomePage;
import org.pages.LogInPage;
import org.test_manager.TestManager;
import org.testng.annotations.Test;
import org.utility.BasePlatform;

import static org.test_manager.TestManager.driver;

public class SmokeTest extends TestManager {

    @Test
    public void test1() throws InterruptedException {
        HomePage home = new HomePage();
        LogInPage login = home.clickLogin();
        login.enterEmailAndPassword();
        login.clickLoginBtn();
        home.gotoCamera();
        Thread.sleep(3000);
    }

    @Test
    public void testBookPage() throws InterruptedException {
        HomePage home = new HomePage();
        BooksPage books = home.gotoBooks();
        CartPage cart = books.clickBook();
        cart.AddInCart();
        Thread.sleep(3000);
    }

}
