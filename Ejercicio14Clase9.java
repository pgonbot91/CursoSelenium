import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Ejercicio14Clase9 {

    @Test
    public void accederNetflix(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/uy/");
        driver.manage().window().maximize();

        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println(h1);

        WebElement h2 = driver.findElement((By.tagName("h2")));
        System.out.println(h2);

        driver.navigate().refresh();

        List <WebElement> listaBotones = driver.findElements(By.tagName("button"));
        for (WebElement boton : listaBotones){
            System.out.println("--->" + boton.getText());
        }
        int contadorDiv = 0;
        List <WebElement> listaDiv = driver.findElements(By.tagName("div"));
        for (WebElement div : listaDiv){
            System.out.println("----> " + listaDiv);
            contadorDiv++;
        }
        System.out.println("El numero de elementos div es: " + contadorDiv);

        String titulo = driver.getTitle();
        System.out.println(titulo);

        int contadorLink = 0;
        List <WebElement> listaLink = driver.findElements(By.tagName("link"));
        for (WebElement link : listaLink){
            System.out.println("---> " + link.getText());
            contadorLink++;
        }
        System.out.println("El numero de links de la página es: " + contadorLink);

    }
}
