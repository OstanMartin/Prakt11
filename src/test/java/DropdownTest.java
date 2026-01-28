import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest {
    @Test
    public void DropdownTest1() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64");
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.findElement(By.xpath("//*[@id=\"dropdown\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"dropdown\"]/option[2]")).click();
        boolean IsSelected = driver.findElement(By.xpath("//*[@id=\"dropdown\"]/option[2]")).isEnabled();
        Assert.assertTrue(IsSelected);
        driver.quit();
    }

    @Test
    public void DropdownTest2() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64");
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.findElement(By.xpath("//*[@id=\"dropdown\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"dropdown\"]/option[3]")).click();
        boolean IsSelected1 = driver.findElement(By.xpath("//*[@id=\"dropdown\"]/option[3]")).isEnabled();
        Assert.assertTrue(IsSelected1);
        driver.quit();
    }
}
