package myfirstSeleniumProject.day07_RelativeLocators_dropdown;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C02_DropdownMenu {

    /* Dropdown menuyu automate etmek icin
    1- dropdown menuyu locate ederiz
    2- select objesi olusturulur
    3- select objesi uzerinden cesitli methodlar sayesinde dropdown seceneklerine erisim saglariz

    SYNTAX
    Select select = new Select(WebElement dropdown);
    select objesi uzerinden ddm handle edebilecegimiz methodlar

         a) selectByVisibleText() -> DDMenudeki elementi gorunur metin ile secer
         b) selectByIndex() -> DDMenudeki elementi index ile secer, index sifirdan baslar
         c) selectByValue() -> DDMenudeki elementi value attribute degeri ile secer (option tagi ile baslar)
         d) getOptions() -> Locate ettigimiz DD menudeki tum secenekleri liste koyarak bize verir.
         e) getFirstSelectedOption() -> DD Menudeki secili olan secenegi bize verir.

         NOT: ==> COGU ZAMAN BU DROPDOWN WEBELEMENTINE senKeys() methodunu ile alt basliklardan herhangi bir secenegi gonderebilir

     */

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
    void test01() {
//        1. Method:
//        a) yil,ay,gun dropdown meuleri locate ediniz

        WebElement year = driver.findElement(By.id("year"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement day = driver.findElement(By.id("day"));

//        b) select objesi olustur

        Select selectYear = new Select(year);
        Select selectMonth = new Select(month);
        Select selectDay = new Select(day);

//        c) select objesi kullanarak 3 farkli sekilde secim yapiniz

        selectYear.selectByIndex(0);// INDEX '0' DAN BASLAR, 0 yazarsak ilk element secilir, 3 yazarsak 4. element secilir
        selectMonth.selectByValue("10");//<option value="9">October</option> value attriubute degerine gore secim
        selectDay.selectByVisibleText("10");// ekranda gorunur metine gore secim yapar


    }

    @AfterEach
    void tearDown(){
        //driver.quit();
    }
}
