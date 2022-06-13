import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSessions {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\chandu\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in");
    }
}
