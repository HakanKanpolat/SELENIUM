package myfirstSeleniumProject;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class day05_RadioButton {

    static WebDriver driver;

    @BeforeAll
    public static void setUp() {

        // 1. create driver object from WebDriver class

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void test01() {

//
//        https://testcenter.techproeducation.com/index.php?page=radio-buttons

        driver.get("https://testcenter.techproeducation.com/index.php?page=radio-buttons");

//        Click on Red
        WebElement redButton = driver.findElement(By.xpath("//input[@id='red']"));

//        redButton.click(); // radio button oldugu icin if conditionla bir kod yazmamiza gerek yok......


        if (!redButton.isSelected()) {

            redButton.click();
        }


//        Click on Football

        WebElement football = driver.findElement(By.cssSelector("input[id='football"));

        football.click();

    }

    @AfterAll
    public static void tearDown() {

        driver.close();
    }
}