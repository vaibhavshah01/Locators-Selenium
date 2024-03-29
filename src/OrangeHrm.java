import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeHrm {
    protected static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // enter a website
        driver.get("https://opensource-demo.orangehrmlive.com");
        // add user name
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        //add password
        driver.findElement(By.xpath("//input[@name=\"txtPassword\"]")).sendKeys("admin123");
        // click on login
        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.xpath("//a[@class='panelTrigger']")).click();
        driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();
        // driver.close

    }
}