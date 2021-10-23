package Class6;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolls {


        @Test
        public void scrolls ()
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tasne\\Documents\\git\\Summer2021_Selenium\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://hotels.com");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            /**
             * Use javascript to scroll
             *
             * scroll by pixel
             * scroll upto a webElement
             * scroll upto bottom
             */

            /**
             * 1. scroll by pixel
             *
             * scrollBy(0,10)
             *
             * scrollBy(0,+ve)          // scroll downwards pixels down
             * eg: scrollBy(0, 500)     // downwards 500 pixels
             *
             * scrollBy(0,-ve)          // scroll upwards pixels down
             * eg: scrollBy(0, -500)     // upwards 500 pixels
             *
             *
             */
        /*
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // type casting -> changing the driver-datatype into JavascriptExecutor
        // and storing the result in JavascriptExecutor variable
        js.executeScript("scrollBy(0, 1000)");
        try {
            Thread.sleep(10000);     // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        js.executeScript("scrollBy(0,-500)");
         */


            /**
             * scroll upto a webElement
             *
             * "elem.scrollIntoView(true)"
             *
             */
//        WebElement element = driver.findElement(By.xpath(""));
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", element);


            /**
             * scroll up to bottom
             *
             * "window.scrollTo(0, document.body.scrollHeight);"
             *
             */
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");


        }
    }
