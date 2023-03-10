package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    private By ITEM_ADD_BUTTON = By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']");
    private By ITEM_NAME = By.xpath("//a[@id='item_4_title_link']/div");
    private By PRICE = By.xpath("//button[@id='remove-sauce-labs-backpack']/parent::div/div");
    private By SHOPPING_CARD_BUTTON = By.className("shopping_cart_link");
    private By LINKEDIN_LINK = By.xpath("//li[@class='social_linkedin']/a");

    public void clickAddToCard() {
        driver.findElement(ITEM_ADD_BUTTON).click();
    }

    public String receiveItemName() {
        return driver.findElement(ITEM_NAME).getText();
    }

    public String receivePrice() {
        return driver.findElement(PRICE).getText();
    }

    public void clickShoppingCard() {
        driver.findElement(SHOPPING_CARD_BUTTON).click();
    }

    public void waitLink() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(LINKEDIN_LINK));
    }

    public void clickLinkedInLink() {
        driver.findElement(LINKEDIN_LINK).click();
    }

    public void switchToLink() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
}