package myfirstSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day01_BasicNavigators {
    public static void main(String[] args) {


        // When user goes to walmart

        //1.ADIM driverin frameworkte nerede oldugunu tanimla

        System.setProperty("webdriver.chrome","drivers/chromedriver");


        // Then goes to amazon


        //2.driver olustur

        WebDriver driver = new ChromeDriver();


        // Navigate back to Walmart

        //3. ADIM SAYFAYI BUYUT

        driver.manage().window().maximize();


        //        Then goes to amazon
        driver.get("https://www.amazon.com/");


        // Navigate forward to amazon

        driver.navigate().to("https://www.walmart.com/");


        //        Navigate back to amazon

        driver.navigate().back();


       //        Navigate forward to Walmart


        driver.navigate().forward();

       //        Refresh the page

        driver.navigate().refresh();

      //        Close/Quit the browser

        driver.close();

      //



    }
}
