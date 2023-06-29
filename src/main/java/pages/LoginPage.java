package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private static final String LOGIN_PAGE_URL = "http://shop.pragmatic.bg/admin/";
    private static final By USERNAME_INPUT_FIELD = By.id("input-username");
    private static final By PASSWORD_INPUT_FIELD = By.id("input-password");
    private static final By LOGIN_INPUT_BUTTON = By.className("btn-primary");

    public static void goToLoginPage(){
        driver.get(LOGIN_PAGE_URL);
    }
    public static void writeTextInUsernameInputField(String username){
        driver.findElement(USERNAME_INPUT_FIELD).sendKeys(username);
    }
    public static void writeTextInPasswordInputField(String password){
        driver.findElement(PASSWORD_INPUT_FIELD).sendKeys(password);
    }
    public static void clickLoginButton() {
        driver.findElement(LOGIN_INPUT_BUTTON).click();
    }
}
