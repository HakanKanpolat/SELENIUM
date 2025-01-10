package myfirstSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day02_VerifyURLTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

//    Navigate to TechProEducation/python developer page / Amazon homepage

        driver.get("https://www.techproeducation.com/program/full-stack-python-developer");


//    Verify if driver is on the python developer page....


        String actualResult = driver.getCurrentUrl();

        System.out.println(actualResult);


        if (actualResult.contains("python")){

            System.out.println("Test case passed");

        }else {

            System.out.println("Test case failed...");
        }



//    Close the window

        driver.quit();




    }
}
