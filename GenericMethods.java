package SeleniumHomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.management.StringValueExp;

public class GenericMethods {




    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-register")).click();



        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));

        /**
         * This method is used to select value from adrop down on the basis of given text
         * @param element
         * @param value
         * @author unify
         */
        selectValueFromDropDown(day, "27");
        selectValueFromDropDown(month, "November");
        selectValueFromDropDown(year, "2021");


    }


    public static void selectValueFromDropDown (WebElement element, String Value){
    Select select = new Select(element);

        select.selectByVisibleText(Value);
    }
}
