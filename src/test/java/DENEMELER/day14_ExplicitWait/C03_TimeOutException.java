package DENEMELER.day14_ExplicitWait;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NullPointerException {

    /*
   NullPointerException
   Eger bir object olusturup bu olusturdugumuz objecte assignment yapmadan
   kullanmak istersek bu exceptionu aliriz
    */
    Faker faker;
    WebDriver driver;
    @Test
    void test01() {
        // faker = new Faker();
        driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println(faker.name().fullName());
    }

}
