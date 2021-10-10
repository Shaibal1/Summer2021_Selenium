package Class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.security.mscapi.CPublicKey;


public class Basic_Methods_1
{
    //TC: Verify page title

    // Test Methods
    @Test
    public void verifyPageTitle() {
        // path of the driver (chrome)
       // System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");      // Mac
        // System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");   // Windows

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Tasne\\Documents\\git\\Summer2021_Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
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
         * Method 2 : navigate().to()
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
        System.out.println("page title -> " + pageTitle);

        String expPageTitle = "Facebook - Log In or Sign Up";

        // For Verification, we use Assert library from TestNG
        Assert.assertEquals(pageTitle, expPageTitle, "Page title is not as expected");

        /**
         * Assert class contains multiple methods, which we can use to implement the verification.
         *
         * assertEquals - when we need to verify actualValue against expectedValue
         *      Sample: Assert.assertEquals(value1, value2, "This error msg will print if Assertion fails");
         *
         * assertTrue - when we need to verify if a boolean value is true
         *      Sample: Assert.assertTrue(booleanValue, "This error msg will print if assertion fails");
         *
         * assertFalse - when we need to verify if a boolean value is false
         *      Sample: Assert.assertFalse(booleanValue, "This error msg will print if assertion fails");
         */

        driver.quit();
   }
   @Test
    public void verifyURL() {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Tasne\\Documents\\git\\Summer2021_Selenium\\Drivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();

       String url = ("https://www.facebook.com/");
       driver.get(url);
       /*
       * To get url of the window associated with driver
       *
       * Method: getCurrentUrl()
       *
       * */
       String actualUrl = driver.getCurrentUrl();
       Assert.assertEquals(url,actualUrl,"Page url is not as expected");

       /*
       To close a webpage

       Method 1: Close()
              will close only the web-window associated with the driver

       Method 2: quit()
              will close ALL web-window
       */
       driver.quit();
   }

   @Test
    public void verifyBackForwardFunctionality() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tasne\\Documents\\git\\Summer2021_Selenium\\Drivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();

       String url = ("https://www.facebook.com/");
       driver.get(url);

       driver.manage().window().maximize();

       try {
           Thread.sleep(5000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       driver.get("https://www.amazon.com");
       try {
           Thread.sleep(5000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

       // Go Backwards
       driver.navigate().back();

       try {
           Thread.sleep(5000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

       driver.navigate().forward();
       try {
           Thread.sleep(5000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

       driver.quit();
   }

       @Test
       public void refreshWebPage()
       {
           System.setProperty("webdriver.chrome.driver","C:\\Users\\Tasne\\Documents\\git\\Summer2021_Selenium\\Drivers\\chromedriver.exe");
           WebDriver driver = new ChromeDriver();

           String url = ("https://www.facebook.com/");
           driver.get(url);

           try
           {
               Thread.sleep(5000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }



       }


   }





