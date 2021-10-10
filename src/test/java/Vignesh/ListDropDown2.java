package Vignesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ListDropDown2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Tasne\\Documents\\git\\Summer2021_Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://in.hotels.com/");
        Thread.sleep(5000);


        driver.findElement(By.xpath("//input[@aria-label='Destination']")).sendKeys("Mumbai");
        Thread.sleep(2000);
        List <WebElement> hotel = driver.findElements(By.xpath("//main//form//span"));

        for (WebElement h : hotel)
        {
            System.out.println(h.getText());
            if (h.getText().contains("Mumbai (BOM - Chhatrapati Shivaji Intl.), India)"));
            h.click();
            break;
        }

    }
}

/**
 Scanner in = new Scanner(System.in);
 System.out.println("Input an Alphabet: ");
 String input = in.next().toLowerCase();

 boolean vowels = input.equals("a") || input.equals("e") ||
 input.equals("i") || input.equals("o") || input.equals("u") ||input.equals("y") ;

 if (input.length() > 1)
 {
 System.out.println("Error. Not a single character");
 }
 else if (vowels)
 {
 System.out.println("Input letter is Vowel");
 }
 else
 {
 System.out.println("Input letter is Consonant");
 }*/
