package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnabledDisplayedSelected
{
    @Test
    public void isElementEnabled()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tasne\\Documents\\git\\Summer2021_Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");

        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        /*
        * To verify if a webElement is displayed or not
        * Method : isDisplayed()
        * return type: boolean
        * */

        // is Login  button displayed

        String loginName = "login";
        By loginButtonLocator = By.name(loginName);
        WebElement loginButton = driver.findElement(loginButtonLocator);
        boolean isLoginDisplayed = loginButton.isDisplayed(); //expect True?
        System.out.println("Login button displayed status --> " +isLoginDisplayed);
        Assert.assertTrue(isLoginDisplayed,"Login is not displayed");

        /*
         * To verify if a webElement is Enabled or not
         * Method : isEnabled()
         * return type: boolean
         * */
        boolean isLoginEnabled = loginButton.isEnabled(); //expect True
        Assert.assertTrue(isLoginEnabled,"Login button is not enabled");

        /**
         * To verify if the WebElement is selected or not
         * Method: isSelected
         * return type: boolean
         * */


    }
}
