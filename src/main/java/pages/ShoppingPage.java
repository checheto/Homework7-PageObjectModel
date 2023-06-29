package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.WaitTool;

public class ShoppingPage extends BasePage {
    private static final String SHOPPING_URL = "http://shop.pragmatic.bg/";

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/h4/a")
    private static WebElement iPhoneButtonLink;
    @FindBy(id = "button-cart")
    private static WebElement addToCartButton;
    @FindBy(id = "cart-total")
    private static WebElement shoppingCartButton;
    @FindBy(xpath = "//p[@class='text-right']/a[2]")
    private static WebElement checkoutButton;
    @FindBy(id = "content")
    private static WebElement checkoutLabel;
    @FindBy(xpath = "//*[@class='fa fa-shopping-cart']/..")
    private static WebElement viewCartButton;
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a")
    private static WebElement productElement;


    static {
        PageFactory.initElements(driver, ShoppingPage.class);
    }

    public static void goToShoppingPage() {
        driver.get(SHOPPING_URL);

    }

    public static void clickOnIphoneLink() {
        clickOnElement(iPhoneButtonLink);

    }

    public static void clickOnAddToCartButton() {
        clickOnElementByLocator(By.id("button-cart"));
    }

    public static void clickOnShoppingCartButton() {
        clickOnElement(shoppingCartButton);
    }

    public static void clickOnCheckoutButton() {
        WaitTool.waitForElementVisibility(By.xpath("//p[@class='text-right']/a[2]"), 3);
        clickOnElement(checkoutButton);
    }

    public static void verifyCheckoutText(String expectedText) {
        Assert.assertTrue(checkoutLabel.getText().contains(expectedText));
    }

    public static void clickOnViewCartButton() {
        WaitTool.waitForElementVisibility(By.xpath("//*[@class='fa fa-shopping-cart']/.."), 3);
        clickOnElement(viewCartButton);
    }

    public static void verifyShoppingCart(String expectedText) {
        String text = productElement.getText();
        System.out.println(text);
        Assert.assertTrue(text.contains(expectedText));
    }
}