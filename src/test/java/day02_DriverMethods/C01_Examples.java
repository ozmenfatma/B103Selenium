package day02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {
   /*
        İlk önce browser'i maximize yapalım sonra tüm sayfa için max bekleme süresi olarak 15 saniye belirtelim
        Sırasıyla amazon,facebook ve youtube sayfalarına gidelim.
        Amazon sayfasına tekrar dönelim.
        Amazon sayfasının Url'inin https://www.amazon.com/ adresine eşit olduğunu test edelim
        Sayfanın konumunu ve size'ını yazdıralım
        Sayfanın konumunu ve size'inı istediğimiz şekilde ayarlıyalım
        ve istediğimiz şekilde olduğunu test edelim
        ve sayfayı kapatalım
         */
   public static void main(String[] args) {


     WebDriverManager.chromedriver().setup();
     WebDriver driver= new ChromeDriver();


//       İlk önce browser'i maximize yapalım sonra tüm sayfa için max bekleme süresi olarak 15 saniye belirtelim
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//       Sırasıyla amazon,facebook ve youtube sayfalarına gidelim.
       driver.get("https://www.amazon.com");
       driver.get("https://www.facebook.com");
       driver.get("https://www.youtube.com");

//       Amazon sayfasına tekrar dönelim.
       driver.navigate().back();
       driver.navigate().back();

//       Amazon sayfasının Url'inin https://www.amazon.com/ adresine eşit olduğunu test edelim
       String actualurl= driver.getCurrentUrl();
       String ExpectedUrl="https://www.amazon.com";
       if (actualurl.equals(ExpectedUrl)){
           System.out.println("Url test Passed");
       }else System.out.println("Url test Failed");

//       Sayfanın konumunu ve size'ını yazdıralım
       System.out.println("Sayfanin size :" + driver.manage().window().getSize());
       System.out.println("Sayfanin Konumu : " + driver.manage().window().getPosition());

//       Sayfanın konumunu ve size'inı istediğimiz şekilde ayarlıyalım
       driver.manage().window().setSize(new Dimension(600,600));
       driver.manage().window().setPosition(new Point(50,50));

//       ve istediğimiz şekilde olduğunu test edelim
       System.out.println("Sayfanin yeni size :" + driver.manage().window().getSize());
       System.out.println("Sayfanin yeni Konumu : " + driver.manage().window().getPosition());

       Dimension actualYeniSize =driver.manage().window().getSize();
       if (actualYeniSize.getWidth()==603 && actualYeniSize.getWidth()==603){
           System.out.println("Size Test Passed");
       }else System.out.println("Size Test Failed");

       Point actualYeniKonum=driver.manage().window().getPosition();
       if (actualYeniKonum.getX()==49 && actualYeniKonum.getY()==49){
           System.out.println("Position Test Passed");
       }else System.out.println("Position Test Failed");

//       ve sayfayı kapatalım

      driver.quit();
}
}