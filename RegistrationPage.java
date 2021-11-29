package SeleniumHomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        // To write Explicit Wait
        //WebDriverWait wait = new WebDriverWait(driver, 30);
        //wait.until(ExpectedConditions.titleContains("nopCommerce demo store"));
        //System.out.println(driver.getTitle());  [I have put explicit wait but haven't used because it doesn't work.]

        driver.findElement(By.className("ico-register")).click();

        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#gender-female")).click();// cssSelector
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Hetal");// Xpath
        driver.findElement(By.xpath("//input[contains(@id,'LastName')]")).sendKeys("Nayi"); //Xpath with contains

        Thread.sleep(3000);
        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));

        Select select = new Select(day);
        select.selectByVisibleText("10");

        Select select1 = new Select(month);
        select1.selectByVisibleText("October");

        Select select2 = new Select(year);
        select2.selectByVisibleText("1988");



        Thread.sleep(3000);
        driver.findElement(By.id("Email")).sendKeys("bhumi18@hotmail.com");
        driver.findElement(By.id("Company")).sendKeys("UnifyTesting");

        driver.findElement(By.id("Newsletter")).click();// By default, newsletter checkbox was tick so i un tick.

        driver.findElement(By.id("Password")).sendKeys("Dasnadas");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Dasnadas");

        Thread.sleep(3000);
        driver.findElement(By.id("register-button")).click();


    }
}

