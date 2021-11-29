package SeleniumHomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class GetDropDownValues {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-register")).click();

        driver.findElement(By.name("DateOfBirthDay"));
        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        Select select = new Select(day);
        List<WebElement> dayList = select.getOptions();
        System.out.println(dayList.size());

        for (int i = 0; i < dayList.size(); i++) {
            String value = dayList.get(i).getText();
            System.out.println(value);}

            driver.findElement(By.name("DateOfBirthMonth"));
            WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
            Select select1 = new Select(month);
            List<WebElement> MonthList = select1.getOptions();
            System.out.println(MonthList.size());

            for (int a = 0; a < MonthList.size(); a++) {
                String value1 = MonthList.get(a).getText();
                System.out.println(value1);}


                driver.findElement(By.name("DateOfBirthYear"));
                WebElement Year = driver.findElement(By.name("DateOfBirthYear"));
                Select select2 = new Select(Year);
                List<WebElement> YearList = select2.getOptions();
                System.out.println(YearList.size());

                for (int b = 0; b < YearList.size(); b++) {
                    String value2 = YearList.get(b).getText();
                    System.out.println(value2);}


                }
            }






