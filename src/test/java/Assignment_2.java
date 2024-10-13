import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Assignment_2 {
    WebDriver driver;

    @BeforeAll
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test
    public void FormFillUp() throws InterruptedException {
        driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");

        List<WebElement> inputData = driver.findElements(By.className("ur-frontend-field"));

        inputData.get(0).sendKeys("Jahurul Islam");
        inputData.get(1).sendKeys("redayk37@gmail.com");
        inputData.get(2).sendKeys("@RoadToSdet!!");


        inputData.get(3).sendKeys("Reday");
        inputData.get(4).click();
        inputData.get(8).sendKeys("01767367869");
        inputData.get(9).sendKeys("01867367869");
        inputData.get(10).sendKeys("Bangladeshi");

        Select select = new Select(driver.findElement(By.id("country_1665629257")));
        select.selectByVisibleText("Bangladesh");

        inputData.get(13).sendKeys("20");
        inputData.get(14).sendKeys("026");
        inputData.get(15).sendKeys("Student");
        inputData.get(16).click();
        inputData.get(18).click();
        inputData.get(21).click();


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        Select select1 = new Select(driver.findElement(By.id("select_1665628361")));
        select1.selectByIndex(2);

        Thread.sleep(2000);
        inputData.get(28).click();


        Thread.sleep(2000);
        driver.findElement(By.className("ur-submit-button")).click();


    }


}
