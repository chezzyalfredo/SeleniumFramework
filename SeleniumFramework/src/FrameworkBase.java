
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameworkBase {

    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.google.com/";
        String expectedTitle = "Google";
        String actualTitle = "";

        driver.get(baseUrl);

        actualTitle=driver.getTitle();

        if(actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed");
        }
        else {
            System.out.println("Test Failed");
        }

        driver.close();

    }



}
