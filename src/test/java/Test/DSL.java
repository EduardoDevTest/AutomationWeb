package Test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DSL {
    public WebDriver driver;

    public DSL(WebDriver driver) {
        this.driver = driver;
    }

    public void escreveNome(String Id_campo, String nome ){
        driver.findElement(By.id(Id_campo)).sendKeys(nome);

        }

     public void retornaCampo(String elemento, String valor){
         driver.findElement(By.id(elemento)).getAttribute(valor);
     }

      public void clicarRadioButton(String elemento){
         this.driver.findElement(By.id(elemento)).click();


      }

    public void clicarRadioButton_Feminino(String elemento) {
        this.driver.findElement(By.id(elemento)).click();

    }

    public void escreveTexto(String elemento, String texto) {
        this.driver.findElement(By.id(elemento)).sendKeys(texto);



    }

public void selecionarComboBox(String Natacao, String Corrida, String elemento){
        WebElement element = driver.findElement(By.id(elemento));
        Select combo = new Select(element);
        combo.selectByValue(Natacao);
        combo.selectByValue(Corrida);
        List<WebElement> selectcombo = combo.getAllSelectedOptions();
         Assert.assertEquals(1, selectcombo.size());
    }


}
