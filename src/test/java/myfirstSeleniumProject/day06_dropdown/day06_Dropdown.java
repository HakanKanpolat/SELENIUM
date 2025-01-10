package myfirstSeleniumProject;

import myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class day06_Dropdown extends TestBase {

    //    Go to https://testcenter.techproeducation.com/index.php?page=dropdown
//
//    Create method selectByIndexTest and Select Option 1 using index
//    Create method selectByValueTest Select Option 2 by value
//    Create method selectByVisibleTextTest Select Option 1 value by visible text
//    Create method printAllTest Print all dropdown value
//    Verify the dropdown has Option 2 text
//    Create method printFirstSelectedOptionTest Print first selected option
//    Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.
//


    //    Go to https://testcenter.techproeducation.com/index.php?page=dropdown
//
//    Create method selectByIndexTest and Select Option 1 using index
//    Create method selectByValueTest Select Option 2 by value
//    Create method selectByVisibleTextTest Select Option 1 value by visible text
//    Create method printAllTest Print all dropdown value
//    Verify the dropdown has Option 2 text
//    Create method printFirstSelectedOptionTest Print first selected option
//    Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.
//


    @Test
    public void dropDownTest() throws InterruptedException {


        //    Go to https://testcenter.techproeducation.com/index.php?page=dropdown

        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
//
//    Create method selectByIndexTest and Select Option 1 using index

        //1.Adim dropdown icin locator al......

        WebElement simpleDropdown = driver.findElement(By.id("dropdown"));

        //2. Adim bir obje olustur Select classindan

        Select options = new Select(simpleDropdown);


        //3. adim index numarasina gore option 1 sec....

        options.selectByIndex(1);
        Thread.sleep(3000);

        Assertions.assertTrue(simpleDropdown.getText().contains("1"));




        //    Create method selectByVisibleTextTest Select Option 2 value by visible text

        //Select classindan objeyi olusturdugum icin  o objeyi kullanabilirim

        options.selectByVisibleText("Option 2");
        Thread.sleep(3000);

        Assertions.assertTrue(simpleDropdown.getText().contains("2"));





//    Create method selectByValueTest Select Option 1 by value

        options.selectByValue("1");

        Thread.sleep(3000);
        Assertions.assertTrue(simpleDropdown.getText().contains("1"));


//    Create method printAllTest Print all dropdown value

        List<WebElement> allElements = options.getOptions();

        for (WebElement eachElement:allElements) {

            System.out.println(eachElement.getText());

        }




//    Verify the dropdown has Option 2 text

        options.selectByValue("2");

        Assertions.assertTrue(simpleDropdown.getText().contains("2"));

//    Create method printFirstSelectedOptionTest Print first selected option

        WebElement firstSelectedOption = options.getFirstSelectedOption();

        System.out.println("Secilen elementi goster =>>> " + firstSelectedOption.getText());

        Assertions.assertTrue(firstSelectedOption.getText().contains("2"));

//    Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.


        List<WebElement> allItem =  options.getOptions();


        int numberOfElements = allItem.size();


        if (numberOfElements == 3){

            System.out.println("Test Passed");
        }else{

            System.out.println("Expected Is Not Equal Actual");
        }


    }

    @Test
    public void dob() throws InterruptedException {




        //    Go to https://testcenter.techproeducation.com/index.php?page=dropdown



        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");


//    Create method selectByIndexTest and Select 2015 using index

        //1.Adim year icin locator al.......
        WebElement year = driver.findElement(By.id("year"));

        //2.Adim select classiyla obje olustur ve year webelementini select construcorin icine at.....
        Select year2015 = new Select(year);


        //3.Adim 2015 yilini sec index numarasini kullanarak....

        year2015.selectByIndex(10);

        Thread.sleep(3000);

//    Create method selectByValueTest Select January by value



        WebElement month = driver.findElement(By.id("month"));

        Select months = new Select(month);

        months.selectByValue("0");

        Thread.sleep(3000);


//    Create method selectByVisibleTextTest Select 15 value by visible text

        WebElement day = driver.findElement(By.id("day"));


        Select days = new Select(day);

        days.selectByVisibleText("15");

        Thread.sleep(3000);



//    Create method printAllTest Print all dropdown value
//    Verify the dropdown has Option 2 text
//    Create method printFirstSelectedOptionTest Print first selected option
//    Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.
//
    }


    @Test
    public void state() throws InterruptedException {


        //sayfaya gitmek
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");


        // state dropdown icin locatori belirle

        WebElement state =  driver.findElement(By.id("state"));


        //select object olusturmak


        Select states = new Select(state);



        // California yi sec


        states.selectByVisibleText("California");
        Thread.sleep(3000);


        List<WebElement> allStates =  states.getOptions();


        for (WebElement eachState: allStates) {

            System.out.println(eachState.getText());

        }

        System.out.println("Number of All States = " + allStates.size());
    }
}