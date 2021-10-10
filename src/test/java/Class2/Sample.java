package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Sample
{
    public static void main(String[] args) throws InterruptedException {
        {

            System.setProperty("webdriver.chrome.driver","C:\\Users\\Tasne\\Documents\\git\\Summer2021_Selenium\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
            Thread.sleep(5000);

            WebElement Day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
            Select daySelect = new Select(Day);
            daySelect.selectByValue("30");

            WebElement Month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
            Select monthSelect = new Select(Month);
            monthSelect.selectByVisibleText("Dec");

            WebElement Year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
            Select yearSelect = new Select(Year);
            yearSelect.selectByIndex(10);






        }
    }
}
