import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {

        private WebDriver driver;
        private WebDriverWait wait;

        @Before
        public void start () {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex-Work\\Desktop\\Work\\chromedriver.exe");
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, 10);
        }

        @Test
        public void myFirstTest() {
            driver.get("http://localhost/litecart/admin/");

            driver.findElement(By.name("username")).sendKeys("admin");
            driver.findElement(By.name("password")).sendKeys("admin");
            driver.findElement(By.xpath("//*[@id=\"box-login\"]/form/div[2]/button")).click();



        }

        @After
        public void stop(){
            driver.quit();
            driver = null;
        }
    }
