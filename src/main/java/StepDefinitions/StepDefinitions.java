package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class StepDefinitions {
    public WebDriver driver;
    public WebDriverWait wait;
    @Before
    public void SetUp(){
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    @Given("User is logged in")
    public void user_is_logged_in() throws InterruptedException {
        driver.navigate().to("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(),'Bank Manager Login')]")).click();
        throw new io.cucumber.java.PendingException();
    }
    @When("User selects Customers")
    public void user_selects(String string) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Customers')]")));
        driver.findElement(By.xpath("//button[contains(text(),'Customers')]")).click();
        throw new io.cucumber.java.PendingException();
    }
    @When("User clicks Delete")
    public void user_clicks(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("A customer is deleted")
    public void a_customer_is_deleted() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
