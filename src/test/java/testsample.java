import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testsample {
public static void main(String[] args) {
	WebDriverManager.chromedriver().clearDriverCache().setup();
	ChromeOptions op= new ChromeOptions();
	op.addArguments("--remote-allow-origins=*");
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
}
