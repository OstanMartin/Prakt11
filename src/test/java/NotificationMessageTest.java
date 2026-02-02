import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessageTest {
    @Test
    public void NotificationMessageTest1(){
        WebDriver driver=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64");
        driver.get("https://the-internet.herokuapp.com/notification_message_rendered");
        driver.findElement(By.xpath("//*[@id=\"flash\"]"));
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/p/a")).click();
        boolean IsDifferent=driver.findElement(By.xpath("//*[@id=\"flash\"]")).isDisplayed();
        Assert.assertFalse(IsDifferent);
        driver.quit();
    }
}
