package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.id("hotel_location")).sendKeys("Warsaw");
        Thread.sleep(4000);
        driver.findElement(By.id("search_room_submit"));
        driver.findElement(By.id("newsletter-input")).sendKeys("test@test.com");
        Thread.sleep(4000);
        driver.quit();

    }
}
