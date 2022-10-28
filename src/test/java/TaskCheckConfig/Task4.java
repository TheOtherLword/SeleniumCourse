package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.className("user_login")).click();
        driver.findElement(By.className("account_input")).sendKeys("test23847@test.com");
        driver.findElement(By.id("SubmitCreate")).submit();
        Thread.sleep(2500);
        driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("Piotr");
        driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Kowalski");
        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test23847@test.com");
        driver.findElement(By.xpath("//*[@id=\"submitAccount\"]")).click();
    }
}
