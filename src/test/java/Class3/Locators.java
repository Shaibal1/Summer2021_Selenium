package Class3;

import org.openqa.selenium.By;

public class Locators
{
    /**
     *
     * Locator: It's kind of route to reach/ find the desired webElement.
     * Datatype of a locator  -->
     *
     * Steps to interact with WebElement:
     *
     * 1. Find the unique address to reach using DOM
     *
     * 2. Depending upon the type of address or info,
     *    we use specific method from By-Class to create the locator
     *
     * 3. Use locator to find the WebElement (using  findElement() method)
     *
     * 4. When WebElement is found, interact with it.
     *
     * Address:
     * 1. id attribute (unique)
     *       In ChroPath, check if id is unique --> //*[@id='value]
     *       By locatorUsingId = By.id("idValue")
     *
     * 2. name attribute
     *       In ChroPath, check if name is unique --> //*[@name='nameValue']
     *       By locatorUsingId = By.id("idValue")
     *
     * 3. className
     *       In ChroPath, check if className is unique --> //*[@class='classValue']
     *       By locatorUsingName = By.className("classValue")
     *
     * 4. linkText
     *       In ChroPath, check if linkText is unique --> //a[text(),'link text')]
     *       By locatorUsinglinkText = By.linkText("linkText")

     * 5. partialLinkText
     *       In ChroPath, check if link has unique partial text -->//a[contains(text(), 'partial link text')]
     *       By locatorUsingPartiallinkText = By.partialLinkText("linkText")
     *
     * 6. tagName
     *       In ChroPath, check if tagName is unique  --> //tagName
     *       By locatorUsingTagname = By.("tagNameValue")
     *
     * 7. xPath
     *       l
     *
     *
     *
     *
     * */

    /**
     *  Links:
     *      1. Always with a 'a' tag
     *      2. "href" attribute's value defines the webpage
     *          use will go if clicked on the link
     *      3. Text associated with a link is called linkText.
     *
     *
     */



}
