package TaskCheckConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Few {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://coderslab.pl/pl");
        Thread.sleep(4000);
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        Thread.sleep(4000);
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        Thread.sleep(4000);
        driver.quit();
    }
}
