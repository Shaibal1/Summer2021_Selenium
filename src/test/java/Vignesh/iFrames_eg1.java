package Vignesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames_eg1
{
    public static void main(String[] args) throws InterruptedException

    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tasne\\Documents\\git\\Summer2021_Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
        driver.findElement(By.xpath("//a[@onclick='retheme()']")).click();

        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();





    }

 }
