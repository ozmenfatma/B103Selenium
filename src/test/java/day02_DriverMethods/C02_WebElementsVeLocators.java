package day02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElementsVeLocators {
    public static void main(String[] args) {


     WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

          //Amazon sayfasina gidelim.
        driver.get("https://www.amazon.com");

          // Search bolumunu locate edelim.
       WebElement searchbox= driver.findElement(By.id("twotabsearchtextbox"));

          // Search bolumunde Iphone aratalim
        searchbox.sendKeys("Iphone" , Keys.ENTER);
        /*
Eger bir webelementi (Web sayfasindaki her bir buton ya da text/yazi) locate (konumunu belirleme)
etmek istersek once manual olarak web sayfasini acip sayfa uzerinde sag click yapip incele/inspect butonuna tiklariz.
Karsimiza cikan HTML code'larindan locator'lardan (konum belirleyiciler) unique (essiz) olani seceriz.
Genellikle id Attribute'u kullanilir. Sectigimiz attribute degerini findElement() method'u icine
findElement(BY.id("attribute degeri")) seklinde yazariz.
 */

        List<WebElement> inputTags=driver.findElements(By.tagName("input"));
        System.out.println("Input Tag Sayisi =" + inputTags.size());  //input tagiyla basiyla ... web elementi var

        List<WebElement>linklerList =driver.findElements(By.tagName("a"));
        System.out.println("Link Sayisi " + linklerList.size());

        for (WebElement w:linklerList){
            System.out.println(w.getText());
        }



}
}