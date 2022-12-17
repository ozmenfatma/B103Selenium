package day01_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day01_ClassWork02 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // bu method sayfadaki her bir web element icin
                                                                         // max bekleme suresi belirler

       // ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
      //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://facebook.com");
        String actualTitle=driver.getTitle();
        if (actualTitle.contains("facebook")){
            System.out.println("title testi passed");
        }else System.out.println("title testi failed" + actualTitle);

        // Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i  yazdirin.
        String actualurl=driver.getCurrentUrl();
        if (actualurl.contains("facebook")){
            System.out.println("Url test Passed");
        }else System.out.println("Url Test Failed" + actualurl);

       //https://www.walmart.com/ sayfasina gidin.
        driver.get("http://www.Walmart.com");

        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualWalmartTitle=driver.getTitle();
        String expectedWalmarttitle="Walmart.com";

        if (actualWalmartTitle.contains(expectedWalmarttitle)){
            System.out.println("Title Test Passed");
        }else System.out.println("Title Test Failed");

      //Tekrar “facebook” sayfasina donun
        driver.navigate().back();

     // Sayfayi yenileyin
        driver.navigate().refresh();
     // 9.Browser’i kapatin
         driver.close();

    }
}
