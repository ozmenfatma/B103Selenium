package day02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_ClassWork {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("city bike", Keys.ENTER);

//Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramasonuclari = driver.findElements(By.className("sg-col-inner"));
        String aramaSonucu = aramasonuclari.get(0).getText();

        String [] aramaSonucArr = aramaSonucu.split(" ");
        System.out.println("aramaSonucArr[2] = " + aramaSonucArr[2]);
//Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List <WebElement> firstImg = driver.findElements(By.className("s-image"));
        firstImg.get(0).click();
//sayfayi kapatin
        driver.close();
    }
}
