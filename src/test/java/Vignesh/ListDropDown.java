package Vignesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ListDropDown
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Tasne\\Documents\\git\\Summer2021_Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.abhibus.com/");
        driver.findElement(By.xpath("//input[@id='source']")).sendKeys("del");
        Thread.sleep(2000);

        List <WebElement> source = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li")); // All 9 values
        for (WebElement s : source)
        {
            System.out.println(s.getText());
            if (s.getText().contains("Delwara"))
            {
                s.click();
                break;
            }
        }











    }
}
