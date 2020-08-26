import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;


public class LoginTest {

    public static WebDriver driver;


    public static void main(String[] args) {
        // launch the browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // navigating to google-----------
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // find the search box and entering the keyword-------------
        driver.findElement(By.name("q")).sendKeys("way2automation");

        // click enter
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

        // taping the 1st link from web page
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.close();

        System.out.println("test done");
    }
}
