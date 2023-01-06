import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CompraDeProdutos {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eduardo Barbosa\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.mercadolivre.com.br/");


    }
     @Test
     public void compraComSucesso(){

        driver.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("/html/body/main/div/section[2]/div/div[2]/div/ol/li[1]/div/a/div/img")).click();

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scrollBy(0,250)", "");
        driver.findElement(By.xpath("/html/body/main/div[2]/div[3]/div[1]/div[2]/div/div[1]/form/div[5]/div/button[1]")).click();

        driver.findElement(By.id("registration-link")).click();
        JavascriptExecutor jse2 = (JavascriptExecutor)driver;
        jse2.executeScript("scrollBy(0,250)", "");
        driver.findElement(By.id("terms-and-conds")).click();

        driver.findElement(By.xpath("/html/body/main/div/div[2]/div[3]/a[1]")).click();
        driver.findElement(By.xpath("/html/body/main/div/div[2]/div/ul/div/li/div[2]/span/button")).click();
        driver.findElement(By.name("email")).sendKeys("eduardo@karol.com.br");
        driver.findElement(By.xpath("/html/body/main/div/div[2]/form/button")).click();

    }
    @Test
    public void compra(){

        driver.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("/html/body/main/div/section[2]/div/div[2]/div/ol/li[1]/div/a/div/img")).click();

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scrollBy(0,250)", "");
        driver.findElement(By.xpath("/html/body/main/div[2]/div[3]/div[1]/div[2]/div/div[1]/form/div[5]/div/button[1]")).click();

        driver.findElement(By.id("registration-link")).click();
        JavascriptExecutor jse2 = (JavascriptExecutor)driver;
        jse2.executeScript("scrollBy(0,250)", "");
        driver.findElement(By.id("terms-and-conds")).click();

        driver.findElement(By.xpath("/html/body/main/div/div[2]/div[3]/a[1]")).click();
        driver.findElement(By.xpath("/html/body/main/div/div[2]/div/ul/div/li/div[2]/span/button")).click();
        driver.findElement(By.name("email")).sendKeys("ed@karol.com.br");
        driver.findElement(By.xpath("/html/body/main/div/div[2]/form/button")).click();

    }
    @After
    public void fecha(){
        driver.quit();
    }




}











