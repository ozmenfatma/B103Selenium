package SeleniumPratik;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day01_2 {
    public static void main(String[] args) throws InterruptedException {
//        odev
//        Amazon soyfasina gidelim. https://www.amazon.com/
//        Sayfanin konumunu ve boyutlarini yazdirin
//        Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
//        Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
//        Sayfayi kapatin

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.techproed.com/");
        driver.manage().window().getPosition();
        driver.manage().window().getSize();

        driver.manage().window().setPosition(new Point(45,45));
        driver.manage().window().setSize(new Dimension(1200,1200));

        // 5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        int xkoordinati=driver.manage().window().getPosition().getX();
        int ykoordinat=driver.manage().window().getPosition().getY();
        int genislik=driver.manage().window().getSize().getWidth();
        int yukseklik=driver.manage().window().getSize().getHeight();

        Thread.sleep(5000);

        if ( genislik==1200 && yukseklik==1200){
            System.out.println("olceklendirme testi PASS");
        }else{
            System.out.println("olceklendirme testi FAILED");
        }
       driver.close();

    }
}
