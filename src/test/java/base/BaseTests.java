package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTests {

    private WebDriver driver;

    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
       driver = new ChromeDriver();
//       driver.manage().timeouts().pageLoadTimeout()
//       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        goGome();

       // Definir tamanho da tela
//        driver.manage().window().setSize(new Dimension(375, 812));

        homePage = new HomePage(driver);

    }

    @BeforeMethod
    public void goGome(){
        driver.get("https://the-internet.herokuapp.com/");
    }



    @AfterClass
    public void tearDown(){
//        driver.quit();
    }




}
