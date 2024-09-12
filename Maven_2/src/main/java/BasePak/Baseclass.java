package BasePak;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Baseclass {
public static	WebDriver driver;
public static Properties pro;
  @BeforeMethod
  public void BC() throws IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  FileInputStream f=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Maven_2\\src\\data\\java\\data");
	 pro =new Properties();
	  pro.load(f);
	  System.out.println(pro.getProperty("chinna"));	  
  }
}
