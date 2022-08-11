
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;


public class HomeWork14 {
    public WebDriver driver;


    @Test
    public void Test() throws InterruptedException {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/main/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://todomvc.com/examples/vue/");
        driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("Shopping",Keys.ENTER);

        WebElement checkbox = driver.findElement(By.xpath("//input[@class='toggle']"));
        checkbox.click();
        WebElement task = driver.findElement(By.xpath("//li[@class='todo completed']"));

        String checkboxExpected = "todo completed";
        String checkboxActual = task.getAttribute("class");

        Assert.assertEquals(checkboxExpected, checkboxActual);


    }
    @AfterEach
    public void AfterTest(){driver.close();}
    }
