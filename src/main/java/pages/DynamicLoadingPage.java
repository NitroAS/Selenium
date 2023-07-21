package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private String linkXpath_Format = ".//a[contains(text(), '%s')";
    private By link_Example = By.xpath(String.format(linkXpath_Format, "Example 1"));


    public  DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

//    public  DynamicLoadingExample1Page clickExample1() {
//        driver.findElement(link_Example).click();
//        return new DynamicLoadingExample1Page(driver);
//    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();

    }

    public DynamicLoadingExample1Page clickExample1(){
        clickLink("Example 1: Element on page that is hidden");
        return new DynamicLoadingExample1Page(driver);
    }
}
