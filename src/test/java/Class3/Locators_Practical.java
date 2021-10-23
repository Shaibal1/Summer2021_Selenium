package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators_Practical
{
    @Test
    public void loginInvalid() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Tasne\\Documents\\git\\Summer2021_Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        /**
         *To find a webElement
         * method: findElement()
         * input: locator(by dataType)
         * output:
         *      if the element if found, WebElement will be returned
         *      else NoSuchElement exception
         * */

        /**
         * To type in a webElement
         * method: sendKeys()
         * input: String(data that we want to type in WebElement)
         * */


        /**
         * To click on a webElement
         * method: click()
         **/


        String emailAddressName = "email";
        By emailLocator = By.name(emailAddressName);
        WebElement emailBox = driver.findElement(emailLocator);
        emailBox.sendKeys("abcd@test.com");

        String passIdValue = "pass";
        By passwordLocator = By.id(passIdValue);
        WebElement passBox = driver.findElement(passwordLocator);
        passBox.sendKeys("abcd@1234");

        String loginTag = "button";
        By loginLocator = By.tagName(loginTag);
        WebElement loginButton = driver.findElement(loginLocator);
        loginButton.click();
    }




}
