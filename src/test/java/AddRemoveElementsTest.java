import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveElementsTest {
    @Test
    public void AddElementsTest(){
        WebDriver driver=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64");
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
        boolean IsDisplay=driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).isDisplayed();
        Assert.assertTrue(IsDisplay);
        driver.quit();

    }
}
