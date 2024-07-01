import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import support.Web;

public class SweetAlertTest {    
    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = Web.createFirefox();
    }

    @Test
    public void clickSweetAlertButton(){
        WebElement alertButton = driver.findElement(By.id("modern"));
        alertButton.click();
        WebElement alertText = driver.findElement(By.xpath("/html/body/app-root/app-alert/section[1]/div/div/div[1]/div/div/div[5]/div[2]"));
        System.out.println(alertText.getText()); 
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}