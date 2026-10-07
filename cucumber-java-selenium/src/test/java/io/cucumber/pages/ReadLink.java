package io.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.List;

public class ReadLink extends Page{

    //this helps call the driver/get url
    public ReadLink(WebDriver driver) {
        super(driver);
    }

    //define xpaths
    public String ul ="#content > ul";
    public String li = "li";
    public List<String> expectedList = Arrays.asList(
            "A/B Testing",
            "Add/Remove Elements",
            "Basic Auth (user and pass: admin)",
            "Broken Images",
            "Challenging DOM",
            "Context Menu",
            "Digest Authentication (user and pass: admin)",
            "Disappearing Elements",
            "Drag and Drop",
            "Dropdown",
            "Dynamic Content",
            "Dynamic Controls",
            "Dynamic Loading",
            "Entry Ad",
            "Exit Intent",
            "File Download",
            "File Upload",
            "Floating Menu",
            "Forgot Password",
            "Form Authentication",
            "Geolocation",
            "Horizontal Slider",
            "Infinite Scroll",
            "Inputs",
            "JavaScript Alerts",
            "JavaScript onload event error",
            "Key Presses",
            "Large & Deep DOM",
            "Multiple Windows",
            "Nested Frames",
            "Notification Messages",
            "Redirect Link",
            "Secure File Download",
            "Shadow DOM",
            "Shifting Content",
            "Slow Resources",
            "Sortable Data Tables",
            "Status Codes",
            "Typos",
            "WYSIWYG Editor"
    );

    public boolean checkList() {
        WebElement lists = driver.findElement(By.cssSelector(ul));
        String tagName = lists.getTagName();
        List<WebElement> linkElements = lists.findElements(By.cssSelector(li));

        for (WebElement variable : linkElements) {
            String linkName = variable.getText();
            if (!expectedList.contains(linkName)){
                return false;
            }
        }
       return true;
    }


}
