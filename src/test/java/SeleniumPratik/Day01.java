package SeleniumPratik;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day01 {
    public static void main(String[] args) throws InterruptedException {


//    Youtube ana sayfasina gidelim . https://www.youtube.com/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       driver.get("https://www.youtube.com/");

//    Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

//    Tekrar YouTube’sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().back();

//    Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();

//    Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();

//    Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();
        driver.quit();
    }
}