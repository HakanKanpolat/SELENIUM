package DENEMELER;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Deneme02 {

    static WebDriver driver;

    @BeforeAll
    static void beforeAll() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

    }

    @Test
    void test() throws InterruptedException {

        driver.get("https://allovercommerce.com/");
        Faker faker10 = new Faker();
        Thread.sleep(5000);

        WebElement register = driver.findElement(By.xpath("//a[@class='register inline-type']"));
        register.click();
        Thread.sleep(5000);

        WebElement username = driver.findElement(By.xpath("//input[@id='reg_username']"));
        username.sendKeys(faker10.name().username());
        Thread.sleep(5000);

        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(faker10.internet().emailAddress());
        Thread.sleep(5000);

        WebElement passwoord = driver.findElement(By.xpath("//input[@id='reg_password']"));
        passwoord.sendKeys(faker10.internet().password());
        Thread.sleep(5000);


        driver.findElement(By.xpath("//input[@id='register-policy']")).click();
        Thread.sleep(5000);


        driver.findElement(By.xpath("//button[@name='register']")).click();
        Thread.sleep(5000);

    }

    @AfterAll
    static void afterAll() {

        driver.close();
    }
}
