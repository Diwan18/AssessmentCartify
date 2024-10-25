import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cartify {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cartify.pk/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()='Shop By Categories'] ")).click();
		driver.findElement(By.xpath("(//div[@class='collection-grid-item__title h3'])[3]")).click();
		Thread.sleep(5000);
		
		WebElement JS = driver.findElement(By.xpath("//a/span[text()='Floor-Standing Cloth Rack With Wheels']"));
		
		driver.executeScript("arguments[0].click();", JS);

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@name='add']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),'View cart')]")).click();
		
		Thread.sleep(5000);
		
		String text = driver.findElement(By.xpath("//span[@class='cart-subtotal__price']")).getText();
		
		System.out.println(text);
		
		
		driver.quit();

	
		
	}

}
