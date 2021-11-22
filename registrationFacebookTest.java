import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class registrationFacebookTest {

    @Test
    public void fullRegistrationTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        List<WebElement> botonesFacebook = driver.findElements(By.tagName("button"));
        for (WebElement boton : botonesFacebook){
            if(boton.getText().equals("Permitir todas las cookies")){
                boton.click();
            }
        }

        driver.findElement(By.linkText("Crear cuenta nueva")).click();

        Thread.sleep(2000);

        driver.findElement((By.name("firstname"))).sendKeys("John");
        driver.findElement((By.name("lastname"))).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("555555");
        driver.findElement(By.id("password_step_input")).sendKeys("123456789");

        WebElement elementoDia = driver.findElement(By.name("birthday_day"));
        Select selectDia = new Select(elementoDia);
        selectDia.selectByVisibleText("26");

        WebElement elementoMes = driver.findElement(By.name("birthday_month"));
        Select selectMes = new Select(elementoMes);
        selectMes.selectByVisibleText("jun");

        WebElement elementoAnio = driver.findElement(By.name("birthday_year"));
        Select selectAnio = new Select(elementoAnio);
        selectAnio.selectByVisibleText("1980");

        List<WebElement> radioButtonGender = driver.findElements(By.name("sex"));
        WebElement radioButtonHombre = radioButtonGender.get(1);
        radioButtonHombre.click();



    }
}
