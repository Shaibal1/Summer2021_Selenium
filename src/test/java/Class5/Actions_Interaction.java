package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_Interaction
{

    @Test
    public void Actions_Interaction()
        {
            /**
             * mouseHover --> moveToElement
             * click()
             * sendKeys()
             * Drag and Drop --> dragAndDrop()
             * right click --> contextClick()
             * double click --> doubleClick()
             **/
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tasne\\Documents\\git\\Summer2021_Selenium\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://yahoo.com");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement bellIcon = driver.findElement(By.xpath("//input[@id='ybarNotificationMenu']"));

            Actions act = new Actions(driver);

            act.moveToElement(bellIcon).build().perform();

            /**
             * .build().perform() vs .perform()
             *
             * when a method (of Actions class) is doing only1 action --> .perform () is enough
             *  [but, we can use .build().perform() as well]
             *
             *  when method is doing more than 1 action --> .build() .perform()
             * */



        }


}
