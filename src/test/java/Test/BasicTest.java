package Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class BasicTest {

    private WebDriver driver;
    private String URL_PAGE = "file:///C:/Users/Eduardo%20Barbosa/AppData/Local/Temp/Temp1_campo_treinamento.zip/componentes.html";
    private String URL_RAIZ_PROJETO = "src/ressources/componentes.html";
    private String Patch;
    private DSL dsl;

    @Before
    public void inicializa() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eduardo Barbosa\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.navigate().to(URL_PAGE);
        this.driver.manage().window().setPosition(new Point(100, 100));
        dsl = new DSL(driver);
    }

    @After
    public void fecha() {
        this.driver.quit();

    }


    @Test
    public void testeTextField() {
        dsl.escreveNome("elementosForm:nome", "Eduardo Barbosa");
        Assert.assertEquals("Eduardo Barbosa", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));

    }

    @Test
    public void testeTextArea() {
        dsl.escreveTexto("elementosForm:sugestoes", "Deus é fiel, Sempre em todo o tempo");
        Assert.assertEquals("Deus é fiel, Sempre em todo o tempo",  driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));


    }
        @Test
        public void testeRadioButton () {
            dsl.clicarRadioButton("elementosForm:sexo:0");
            Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());

        }

        @Test
        public void testeRadioButtonFeminino () {
            dsl.clicarRadioButton_Feminino("elementosForm:sexo:1");
            Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:1")).isSelected());

        }
        @Test
        public void testeCombo () {
            WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
            Select combo = new Select(element);
            combo.selectByVisibleText("Superior");

        }
        @Test
        public void testeComboMultiplaEscolha () {
            dsl.selecionarComboBox("doutorado", "mestrado", "elementosForm:escolaridade");



        }
    }

