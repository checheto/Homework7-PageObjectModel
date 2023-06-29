package tests;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.ShoppingPage;

public class ShoppingPageTest extends BaseTest {

    @Test
    public static void checkoutTest() {
        ShoppingPage.goToShoppingPage();
        ShoppingPage.clickOnIphoneLink();
        ShoppingPage.clickOnAddToCartButton();
        ShoppingPage.clickOnShoppingCartButton();
        ShoppingPage.clickOnCheckoutButton();
        ShoppingPage.verifyCheckoutText("Checkout");
    }

    @Test
    public static void viewCartTest() {
        ShoppingPage.goToShoppingPage();
        ShoppingPage.clickOnIphoneLink();
        ShoppingPage.clickOnAddToCartButton();
        ShoppingPage.clickOnShoppingCartButton();
        ShoppingPage.clickOnViewCartButton();
        ShoppingPage.verifyShoppingCart("iPhone");
    }
}
