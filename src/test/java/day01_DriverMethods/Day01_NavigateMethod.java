package day01_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigateMethod {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //Amazon sayfasına gidelim
        driver.navigate().to("https://amazon.com");

        //techproeducation sayfasına gidelim
        Thread.sleep(3000);
        driver.navigate().to("https://techproeducation.com");

        //Tekrar amazon sayfasına dönelim
        Thread.sleep(3000);
        driver.navigate().back(); // Amazon sayfasına geri döner

        //Tekrar techproeducation sayfasına gidelim
        Thread.sleep(3000);
        driver.navigate().forward(); // Techproya gider

        //Son sayfada sayfayı yenileyelim(refresh)
        Thread.sleep(3000);
        driver.navigate().refresh();

        //Ve sayfayı kapatalım
        driver.close();

  //get(), belirli bir URL’de (web sitesinde) gezinmek ve sayfa yüklenene kadar beklemek için kullanılır. sürücü.
        // Navigation(), belirli bir URL’ye gitmek için kullanılır ve sayfanın yüklenmesini beklemez
    }
}
