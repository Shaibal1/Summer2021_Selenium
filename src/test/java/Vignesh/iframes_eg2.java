package Vignesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes_eg2
{
    public static void main(String[] args)
    {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tasne\\Documents\\git\\Summer2021_Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.get("https://pay.facebook.com/");
        driver.findElement(By.xpath("//a[@id='home_customer_learn-more']")).click();

        if (driver.getPageSource().contains("Speed through online checkout with Facebook Pay"))
        {
            System.out.println("Text is present");
        }
        else {
            System.out.println("Text is absent");


        }
    }
}