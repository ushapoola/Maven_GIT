package Testpak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class reused_class extends Execute{

	public WebElement xp(String x) {
		
		
		return driver.findElement(By.xpath(pro.getProperty(x)));
		
	}
	public void T(int x) throws InterruptedException {
		int t=x*1000;
		Thread.sleep(t);
	}
	
}
