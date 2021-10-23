package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators_2_Practical
{

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
        @Test
        public void verifyInvalidCredentials()
        {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Tasne\\Documents\\git\\Summer2021_Selenium\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://facebook.com");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //Enter login-id as "abcd@test.com"
            String emailXpath = "//input[@type='text']";
            By emailLocator = By.xpath(emailXpath);
            WebElement emailBox = driver.findElement(emailLocator);
            emailBox.sendKeys("abcd@test.com");

            By emailLocator_1 = By.xpath("//input[@type='text']");
            WebElement emailBox_1 = driver.findElement(emailLocator_1);
            emailBox_1.sendKeys("abcd@test.com");

            WebElement emailBox_2 = driver.findElement(By.xpath("//input[@type='text']"));
            emailBox_2.sendKeys("abcd@test.com");

            driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcd@test.com");

            // Enter "test@1234" as password
            String passwordXpath = "//input[contains(@data-testid,'royal_p')]";;
            By passwordLocator = By.xpath(passwordXpath);
            WebElement passwordBox = driver.findElement(passwordLocator);
            passwordBox.sendKeys("abcd@1234");

            //Click Login button
            String loginXpath = "//*[text()='Log In' and @ type = 'submit']";
            By loginLocator = By.xpath(loginXpath);
            WebElement loginButton = driver.findElement(loginLocator);
            loginButton.click();




        }


    }

