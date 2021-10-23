package Class4;

public class Locators_2
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
     *       In ChroPath, create xPath to find the webElement
     *       By locatorUsingTagName = By.xPath("//xPath//to//element")
     *
     * */

    /**
     * XPATH
     *
     * Types:
     *  1. Absolute xPath
            a) Starts with single slash (/)
            b) Tells the route of webElement from the root tag (or html tag)
            c) Not reliable, if any webElement is going to be
               added/removed in/ from the webPage the absolute xPath might not work.
     *
     *  2. Relative xPath
     *      a) Starts with double slash (//)
     *      b) reliable because we find the webElement using their tag, attributes
     *      and or text
     *
     * -->   Simple xPath(direct xPath)
     * -->   Simple xPath(direct xPath)
     *  */

    /**
     * Simple xPath(direct xPath
     *
     *  1. Using attribute
     *      // tag[@attrName= 'attribute']
     *
     *      --> find the tag in DOM, where the attribute (attrName) has value equals to attrValue
     * eg:  //input[@data-testid='royal_email']
     *      //input[@placeholder='Email or Phone Number']
     *
     *  2. Using text:
     *      //tag[text()='text value']
     *      -> find the tag in DOM where text value is equal to webElement textValue
     * eg:
     *      //button[text()='Log In']
     *
     *   3. Using partial attribute-value
     *      //tag[contains(@attrName, 'partial attr val'')]
     *      --> find the tag in DOM, where the attribute (attrName) has value equals to attrValue
     *  eg:
     *      //input[contains(@aria-label,'Last')]
     *
     *   4. Using partial text-value
     *      //tag[contains(text() ), 'partial textVal']
     *      --> find the tag in DOM, where text value contains 'partial textVal'
     *  eg:
     *      //div[contains(text(),'quick')]
     *
     *   5. Using starting portion of attribute value-value
     *      //tag[starts-with(@attrName, 'partial attr val'')]
     *     -> find the tag in DOM, where the attribute (attrName)'s value
     *        starts-with 'starting attrValue val'
     *  eg:
     *      //input[starts-with(@aria-label, 'Mob')]
     *
     *   6. Using start portion of text-value
     *      //tag[starts-with(text(),'starting textVal')]
     *       -> find the tag in DOM, where the text value starts-with 'starting textVal'
     *
     *  eg:
     *      //div[starts-with(text(), 'It')]
     *
     *   7. not() method
     *      find the tag where attr/text has value equal to the given value
     *
     *     //tag[not(@attrName)]
     *     //tag[not(@attrName='value')]
     *     //tag[not(text()='value')]
     *     //tag[not(contains(@attrName, 'attr value'))]
     *
     *  8. and/or Operator
     *      //tag[@attr='attrVal' and contains (text(), 'Text Val')]
     *      //tag[contains (text(), 'partial text val') or
     *      starts-with(@attrName, 'Starting Attr Val']]
     *
     * eg:
     *     //button[not(@disabled) and contains(@name, 'Eastern Daylight')]
     *
     *     //tag[text()='text value']
     *     -> find the tag in DOM, where textValue is equal to webElement textValue
     *
     *     //*[text()='webElement textValue']
     *     -> find the tag in DOM, where textValue is equal to webElement textValue
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     * */




}
