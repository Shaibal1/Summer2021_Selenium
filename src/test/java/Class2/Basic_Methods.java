package Class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.DocFlavor;

public class Basic_Methods {
    public static void main(String[] args) {

        // path of the driver (chrome)
        //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");      // Mac
        // System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");   // Windows

       System.setProperty("webdriver.chrome.driver","C:\\Users\\Tasne\\Documents\\git\\Summer2021_Selenium\\Drivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
      // driver.get("https://www.facebook.com/");

        //WebDriver driver = new ChromeDriver();
        /**
         * WebDriver driver = new ChromeDriver();
         *
         * WebDriver driver --> driver is a variable of WebDriver Interface
         * new ChromeDriver(); --> object of ChromeDriver class
         *
         * Storing object of ChromeDriver class into a WebDriver variable.
         *
         * ChromeDriver(C) extends RemoteWebDriver(C) ; RemoteWebDriver(C) implements WebDriver(I)
         *
         *
         */

        /**
         * To launch a webpage
         *
         * Method 1 : get()
         *
         * Method 2 : navigate().to()0
         *
         */

        String url = "https://www.facebook.com/";
        driver.get(url);
        // OR
        // driver.navigate().to(url);

        /**
         * get() vs navigate().to()
         *
         * get() -> launches the webpage and waits for few seconds (for webpage to load)
         *          before executing to the next command in code.
         *
         * navigate().to() -> launches the webpage,
         *          and goes to execute the next command in the code.
         *
         */

        /**
         * To maximize the webpage
         *
         * Method: maximize()
         */
        // driver.manage().window().maximize();

        /**
         * To get page title of window associated with driver
         *
         * Method: getTitle()
         */
        String pageTitle = driver.getTitle();
        System.out.println("Page title -> " + pageTitle);

        String expPageTitle = "Facebook - Get connected with Friends";
        if (pageTitle.equalsIgnoreCase(expPageTitle))
        {
            System.out.println("Title page is the same");
        }
        else
        {
            System.out.println("title page is not the same");
        }









    }
}
