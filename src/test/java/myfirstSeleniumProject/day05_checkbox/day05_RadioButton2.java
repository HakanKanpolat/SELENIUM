package myfirstSeleniumProject;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class day05_RadioButton2 {

    //Create a class : RadioButton
    //
    //Complete the following task.
    //
    //Go to https://www.facebook.com/
    //
    //Click on Create an Account button
    //
    //Locate the elements of radio buttons
    //
    //Then click on the radio buttons for your gender if they are not selected


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

//        Create a class : RadioButton
//
//        Complete the following task.
//
//        Go to https://www.facebook.com/

        driver.get("https://www.facebook.com/r.php?entry_point=login");

        Faker faker = new Faker();

//
//        Click on Create an Account button

        //1. adim firstName
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));

        firstName.sendKeys(faker.name().firstName());


        //2.adim surname

        WebElement surname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));

        surname.sendKeys(faker.name().lastName());


        //3.adim gender

        WebElement male = driver.findElement(By.xpath("//input[@value='2']"));

//        male.click();


        if (!male.isSelected()) {
            male.click();
        }


        //4.adim mail

        WebElement mail = driver.findElement(By.xpath("//input[@name='reg_email__']"));


        mail.sendKeys(faker.internet().emailAddress());


        //5.adim password

        WebElement password = driver.findElement(By.xpath("//input[@id='password_step_input']"));


        password.sendKeys(faker.internet().password().toLowerCase());


        //6.adim Signup


        WebElement signUp = driver.findElement(By.xpath("//button[@name='websubmit']"));

        signUp.click();


//
//        Locate the elements of radio buttons

//
//        Then click on the radio buttons for your gender if they are not selected


    }
}