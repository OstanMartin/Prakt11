import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkboxes {
    @Test
    public void ClickCheckboxTest() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64");
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
        boolean IsChecked = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isEnabled();
        Assert.assertTrue(IsChecked);
        driver.quit();
    }

    @Test
    public void ClickCheckboxTest1() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64");
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();
        boolean IsChecked1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).isEnabled();
        Assert.assertFalse(IsChecked1);
        driver.quit();
    }
}
