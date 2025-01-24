package myfirstSeleniumProject.day07_RelativeLocators_dropdown;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C01_RelativeLocators {

    // mehmet hocanin kaydindan yapildi.

    // go to https://www.calculator.net/
    // Locate button '1'
    // Find button '0' using Relative Locator (below '1')
    // Find button '2' using Relative Locator (right of '1')
    // Find button '3' using Relative Locator (right of '2')
    // Find button '4' using Relative Locator (above '1')
    // Find button '5' using Relative Locator (right of '4')
    // Find button '6' using Relative Locator (right of '5')
    // Find button '7' using Relative Locator (above '4')
    // Find button '8' using Relative Locator (right of '7', above '5')
    // Find button '9' using Relative Locator (right of '8', above '6')
    // Find the result row using Relative Locator (above '7,8,9')
    // Click each button (her dugmeye tikla)
    // Print result (sonucu yazdir)
    // Close browers (tarayiciyi kapat)

    @Test
    void test01() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // go to https://www.calculator.net/

        driver.get("https://www.calculator.net/");

        // Locate button '1'

        WebElement one = driver.findElement(By.xpath("//span[.='1']"));

        // Find button '0' using Relative Locator (below '1')

        WebElement zero = driver.findElement(RelativeLocator.with(By.tagName("span")).below(one));

        // Find button '2' using Relative Locator (right of '1')

        WebElement two = driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(one));

        // Find button '3' using Relative Locator (right of '2')

        WebElement three = driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(two));

        // Find button '4' using Relative Locator (above '1')

        WebElement four = driver.findElement(RelativeLocator.with(By.tagName("span")).above(one));

        // Find button '5' using Relative Locator (right of '4')

        WebElement five = driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(four));

        // Find button '6' using Relative Locator (right of '5')

        WebElement six = driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(five));

        // Find button '7' using Relative Locator (above '4')

        WebElement seven = driver.findElement(RelativeLocator.with(By.tagName("span")).above(four));

        // Find button '8' using Relative Locator (right of '7', above '5')

        WebElement eight = driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(seven).above(five));

        // Find button '9' using Relative Locator (right of '8', above '6')

        WebElement nine = driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(eight).above(six));

        // Find the result row using Relative Locator (above '7,8,9')

        WebElement result = driver.findElement(RelativeLocator.with(By.tagName("div")).above(nine).above(seven));

        // Click each button (her dugmeye tikla)

        one.click();
        Thread.sleep(1000);

        two.click();
        Thread.sleep(1000);

        three.click();
        Thread.sleep(1000);

        four.click();
        Thread.sleep(1000);

        five.click();
        Thread.sleep(1000);

        six.click();
        Thread.sleep(1000);

        seven.click();
        Thread.sleep(1000);

        eight.click();
        Thread.sleep(1000);

        nine.click();
        Thread.sleep(1000);

        zero.click();
        Thread.sleep(1000);

        // Print result (sonucu yazdir)

        System.out.println("sonuc = " + result.getText());

        // Close browers (tarayiciyi kapat)

        driver.quit();



    }





}
