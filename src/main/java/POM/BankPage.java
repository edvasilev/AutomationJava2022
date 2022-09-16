package POM;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BankPage extends BaseClass {
    public BankPage(WebDriver driver, WebDriverWait wait) {
        super(driver, new WebDriverWait(driver, Duration.ofSeconds(5)));
    }

    public void NavigateToUrl() {
        Driver().navigate().to(environment + "/angularJs-protractor/BankingProject/#/login");
    }

    public void ClickOnLogin(){
        findElementWithWait(By.xpath("//button[contains(text(),'Customer Login')]")).click();
    }
    public void SelectFromDropdown(){

        Select se = new Select(findElementWithWait(By.id("userSelect")));
        se.selectByValue("2");
    }

    public void ClickLoginButton(){
        findElementWithWait(By.xpath("//button[contains(text(),'Login')]")).click();
    }

    public void ClickOnDeposit(){
        findElementWithWait(By.xpath("//button[contains(text(),'Deposit')]")).click();
    }

    public void EnterAmount(){
        findElementWithWait(By.xpath("//input[@placeholder='amount']")).sendKeys("1000");
    }

    public void SubmitAmount(){
        findElementWithWait(By.xpath("//button[@type='submit']")).click();
    }

    public void EnterSecondAmount(){
        findElementWithWait(By.xpath("//input[@placeholder='amount']")).sendKeys("1000");
    }

    public void SubmitSecondAmount(){
        findElementWithWait(By.xpath("//button[@type='submit']")).click();
    }

    public void VerifyDeposit(){
        WebElement element = findElementWithWait(By.xpath("//strong[contains(text(),'2000')]"));
        Assertions.assertEquals("2000", element.getText());
    }
}
