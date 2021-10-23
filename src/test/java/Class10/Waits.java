package Class10;

import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Waits {
    @Test
    public void waits() {

        /**
         * sleep vs wait
         *
         * task -> ask home-service red shirt in closet
         *
         * enter in room
         * you sleep for 15mins
         * ask the person, is red-shirt there or not (found)
         * if there, found the shirt (approx ~15mins)
         * else, shirt not found
         *
         *
         * enter in room
         * you wait for 15mins
         * checking if red-shirt is there or not
         * if there, found the shirt
         * else, shirt not found
         *
         */

        /**
         * Timeout: max time driver will wait (30 seconds)
         * Polling period: Time after which driver will try to find the webElement (1 second)
         *
         * driver.findElement() 9:00:00pm
         * wait for polling period (1 sec) -> NoSuchElementException
         * driver.findElement() 9:00:01pm
         * wait for polling period (1 sec)
         * driver.findElement() 9:00:02pm
         * ..
         * ..
         * wait for polling period (1 sec)
         * driver.findElement() 9:00:30pm
         * NoSuchElementException
         *
         */

        /**
         * Types:
         * 1. Implicit Wait
         * 2. Explicit Wait
         * 3. Fluent Wait
         */


        /**
         * Implicit Wait:
         * (like, changing the settings in the driver)
         * Wait for a certain amount time before throwing NoSuchElementException
         * and stop waiting as soon the element is found.
         *
         * Implicit uses default polling period: 250ms
         *
         * During the wait time, implicit wait ignores only NoSuchElementException
         * if any other exception occurs, implicit-Wait will throw it right away.
         */

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tasne\\Documents\\git\\Summer2021_Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com/");

        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // driver.findElement(By.id("email")).sendKeys("adbcd@gmail.com");
        // driver.findElement(By.id("passssss")).sendKeys("abcd@1234");


        /**
         * Explicit wait
         * Wait for a certain amount of time until the specified condition is/are met.
         * As soon as the condition(s) met, driver will stop waiting and move ahead in the code.
         *
         * Timeout is always in Seconds-unit
         * Explicit uses default polling period: 500ms
         *
         * During the wait time, implicit wait ignores exception related to the condition(s)
         * if any other exception occurs, explicit-Wait will throw it right away.
         *
         */

        WebDriverWait eWait = new WebDriverWait(driver, 20);

        // eWait.until(ExpectedConditions.titleIs("Facebook"));
        // eWait.until(ExpectedConditions.titleContains("Facebook"));

        // eWait.until(ExpectedConditions.alertIsPresent());

        eWait.until(ExpectedConditions.and(
                ExpectedConditions.titleContains("Facebook"),
                ExpectedConditions.elementToBeClickable(By.xpath("")),
                ExpectedConditions.urlContains("facebook")
        ));

        eWait.until(ExpectedConditions.or(
                ExpectedConditions.titleContains("Facebook"),
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.tagName("iframe"))
        ));


        /**
         * Fluent Wait
         *
         * Wait for a certain amount of time until the element(s) is found or condition(s) is met.
         * If waiting time is over, throws TimeOutException
         *
         * user can
         *      define the polling period
         *      ignores the specific exception(s) during the wait time
         *      put a custom error message to display when timeout is over
         */

        Wait fWait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoAlertPresentException.class)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Element is no found within 30 seconds");

        // to use fluent wait with Explicit condition(s)
        fWait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));

        // to find a webElement using fluent wait
        WebElement ele = (WebElement) fWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id(""));
            }
        });



















    }
}
