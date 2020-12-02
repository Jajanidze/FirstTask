import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class main {
    @Test
    public void openLink(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@href='/forgot_password']")).click();
        WebElement forgottenPassword = driver.findElement(By.id("email"));
        forgottenPassword.sendKeys("test@gmail.com");

        WebElement button = driver.findElement(By.id("form_submit"));
        button.click();

        driver.quit();
    }


}
