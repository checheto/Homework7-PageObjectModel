package components;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import utils.WaitTool;

public class AdminLeftNavigationBar extends BasePage {
    @FindBy(css = "#menu-sale > a")
    private static WebElement salesElement;
    @FindBy(xpath = "//*[@id=\"collapse4\"]/li[1]/a")
    private static WebElement ordersElement;
    @FindBy(xpath = "//i[@class='fa fa-list']/ ..")
    private static WebElement orderListElement;
    @FindBy(css = "#input-order-status")
    private static WebElement orderStatusDropdown;
    @FindBy(id = "button-filter")
    private static WebElement filterButton;
    @FindBy(xpath = "//*[@id=\"form-order\"]/div/table/tbody/tr/td[2]")
    private static WebElement orderIdNumber;

    static {
        PageFactory.initElements(driver, AdminLeftNavigationBar.class);
    }

    public static void clickOnOrdersElement() {
        WaitTool.waitForElementToBeClickable(By.xpath("//*[@id=\"collapse4\"]/li[1]/a"),3);
        clickOnElement(ordersElement);
    }

    public static void clickOnSalesElement() {
        clickOnElement(salesElement);
    }

    public static void clickOnOrderStatusDropdown(){
        clickOnElement(orderStatusDropdown);
    }
    public static void verifyPresentsOfOrderList(String expectedText){
        String actualText = orderListElement.getText();
        Assert.assertEquals(actualText,expectedText);
    }
    public static void verifyPresentsOfIdNumber(String expectedNumber){
        WaitTool.waitForElementVisibility(By.xpath("//*[@id=\"form-order\"]/div/table/tbody/tr/td[2]"),10);
        String actualIdNumber = orderIdNumber.getText();
        Assert.assertTrue(actualIdNumber.contains(expectedNumber));
    }
    public static void selectShippedDropdownOption (String value){
        Select selectOption = new Select(orderStatusDropdown);
        selectOption.selectByValue(value);
    }
    public static void clickOnFilterButton(){
        clickOnElement(filterButton);
    }
}

