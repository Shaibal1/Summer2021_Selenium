package Vignesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Month;
import java.time.Year;
import java.util.List;

public class selectDropDown
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Tasne\\Documents\\git\\Summer2021_Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        Thread.sleep(2000);

        WebElement Day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
        Select daySelect = new Select(Day);
        daySelect.selectByValue("30");

        WebElement Month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
        Select monthSelect = new Select(Month);
        monthSelect.selectByVisibleText("Dec");

        WebElement Year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
        Select selectYear = new Select(Year);
        selectYear.selectByIndex(40);
        List <WebElement>yearList = selectYear.getOptions();
        System.out.println(selectYear.getOptions());

        for (WebElement Y : yearList) //Prints all the values(Years) that's inside the Year List.
        {
            System.out.println(Y.getText());
        }

    }
}