package InternetSayfasi;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HepsiBurada {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.hepsiburada.com/");
        driver.manage().window().maximize();
        System.out.println("driver.getTitle()="+driver.getTitle());

        String expectedTitle="Hepsi Burada | hepsiburada";

        String actualTitle= driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Baslik bekledigi gibi geldi.Dogrulama gecti");
        }else {
            System.out.println("Baslik beklendigi gibi GELMEDI. Dogrulama GECMEDI");
        }

    }
}
