import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilkclass {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techproeducation.com");

        //WebDriver driver = new ChromeDriver();// Bos bir browser açtık
       // driver.get("https://www.amazon.com"); // ilk olarak gitmek istediğimiz sayfayı belirtiriz
        System.out.println("Sayfa Başlığı : "+driver.getTitle());// sayfa basligi
        System.out.println("Sayfa Url'i : "+driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());// Bize o window'a ait hash değerini verir. Biz bu hash değerlerini
        // bir string'e atayıp pencereler arası geçiş yapabiliriz

    }


}
