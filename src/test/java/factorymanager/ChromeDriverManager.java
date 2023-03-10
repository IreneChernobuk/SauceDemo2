package factorymanager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.PropertyManager;

public class ChromeDriverManager extends DriverManager {

    @Override
    public void createDriver() {
        WebDriverManager.chromedriver().setup();
        PropertyManager propertyManager = new PropertyManager();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }
}