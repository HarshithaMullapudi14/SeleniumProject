import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class AlertPrograms {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91703\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("submit")).click();
		Alert alert=driver.switchTo().alert();
		String alertmessage=driver.switchTo().alert().getText();
		Thread.sleep(5000);
		System.out.println(alertmessage);
		alert.dismiss();
		
	}

}
