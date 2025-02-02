package myfirstSeleniumProject;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class day04_Xpath {

    //When user goes to :
    //    https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
    //And enter username
    //And enter password
    //And click on submit button
    //Then verify the login is successful
    //Then logout the application
    //Then verify the logout is successful
    //app i kapat


    static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void xpath() {
        //When user goes to :
        //    https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //And enter username
        //1. adım web elementi oluştur
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));

        //2. adım username gönder
        username.sendKeys("Admin");
        //And enter password
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("admin123");


        //And click on login button

        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();

        //Then verify the login is successful
        WebElement dashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));

        Assertions.assertTrue(dashboard.getText().contains("Dashboar"));

        //Then logout the application
        driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).click();//profile tıkla

        driver.findElement(By.xpath("(//a[@role='menuitem'])[4]")).click();//logout a tıkla

        //Then verify the logout is successful
        WebElement logoutSucces = driver.findElement(By.xpath("//*[.='Login']"));
        Assertions.assertTrue(logoutSucces.getText().contains("Login"));
    }

    @AfterAll
    public static void tearDown() {
        driver.close();

    }

}
