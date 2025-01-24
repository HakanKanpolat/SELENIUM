package myfirstSeleniumProject.day07_RelativeLocators_dropdown;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C03_DropdownMenu {

    /* Given kullanici https://testcenter.techproeducation.com/index.php?page=dropdown

    3 farkli test methodu olusturalim
       1. Method:
          a) yil,ay,gun dropdown meuleri locate ediniz
          b) select objesi olustur
          c) select objesi kullanarak 3 farkli sekilde secim yapiniz
       2. method:
          a) tum eyalet isimlerini yazdiralim
       3. method:
          a) state dropdown daki varsayilan secili secenegin 'select a state' oldugunu verify edelim

    */





    WebDriver driver;
    @BeforeEach
    void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

    }

    @Test
    void test02() {

//        2. method:
//        a) tum eyalet isimlerini yazdiralim

        WebElement states = driver.findElement(By.cssSelector("#state"));
        Select select = new Select(states);
        List<WebElement> statesList = select.getOptions();

        for (WebElement w : statesList) {

            System.out.println(w.getText());

        }

    }

    @Test
    void test02a() {
        List<WebElement> statesList = driver.findElements(By.xpath("//select[@id='state']/option"));
        statesList.forEach(t-> System.out.println(t.getText()));
    }

    @Test
    void test01Trick() {
        driver.findElement(By.id("year")).sendKeys("2016");
        driver.findElement(By.id("month")).sendKeys("November");
        driver.findElement(By.id("day")).sendKeys("18");
    }

    @Test
    void test03() {
//        3. method:
//        a) state dropdown daki varsayilan secili secenegin 'select a state' oldugunu verify edelim
        WebElement states = driver.findElement(By.cssSelector("#state"));
        Select select = new Select(states);
        String actualOption = select.getFirstSelectedOption().getText();
        String expectedOption = "Select a State";
        Assertions.assertEquals(expectedOption,actualOption);
    }

    @AfterEach
    void tearDown(){
        driver.quit();
    }
}
