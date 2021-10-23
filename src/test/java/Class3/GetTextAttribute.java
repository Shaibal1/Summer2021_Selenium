package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class GetTextAttribute
{
    public void getTextAttribute()

    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tasne\\Documents\\git\\Summer2021_Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String loginTag = "button";
        By loginLocator = By.tagName(loginTag);
        WebElement loginButton = driver.findElement(loginLocator);

        /**
         * To get the text of a WebElement
         * Method : getText()
         * Return Type: String
         * */

        String loginButtonText = loginButton.getText();
        System.out.println("Login button text --> " + loginButtonText);

        /*To get the vvalue of any attributes
        * Methods: getAttributes()
        * input: String (attrName)
        * Return Type: String (attribute's value)
        * */

        String login_DataTestId_value = loginButton.getAttribute("data-testid");
        System.out.println("Login button (data-testid value) --> " + login_DataTestId_value);
    }
}




