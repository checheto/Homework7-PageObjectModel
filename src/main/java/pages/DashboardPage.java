package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.WaitTool;

import static java.awt.SystemColor.text;

public class DashboardPage extends BasePage {
    private static final By logoutButtonLocator = By.xpath("//*[@id=\"header\"]/div/ul/li[2]/a/span");

    public static void verifyLogoutButtonText (String expectedText) {
        WaitTool.waitForElementVisibility(By.xpath("//*[@id=\"header\"]/div/ul/li[2]/a/span"), 3);
        WebElement logoutButtonElement = driver.findElement(logoutButtonLocator);
        Assert.assertEquals(logoutButtonElement.getText(), expectedText);
    }
}
