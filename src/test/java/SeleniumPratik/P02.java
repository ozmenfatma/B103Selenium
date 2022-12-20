package SeleniumPratik;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class P02 {
    public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    //2- https://www.amazon.com/ adresine gidin
       driver.get("https://www.amazon.com");

    //3- Browseri tam sayfa yapin
        driver.manage().window().fullscreen();

    //4-Sayfayi “refresh” yapin
        driver.navigate().refresh();

    //5-”Salesforce Apex Questions Bank” icin arama yapiniz
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Salesforce Apex Questions Bank", Keys.ENTER);

    //6- Kac sonuc bulundugunu yaziniz


    //7-Sayfayi kapatin


}

}