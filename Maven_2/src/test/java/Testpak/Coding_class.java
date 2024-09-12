package Testpak;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.interactions.Actions;

public class Coding_class extends reused_class{
	public static Actions a;
public void loogin() throws InterruptedException, AWTException, FileNotFoundException {
	driver.get(pro.getProperty("URL"));
	xp(("U")).sendKeys(pro.getProperty("UN"));
	xp("P").sendKeys(pro.getProperty("PWD"));
	xp("S").click();
}
public void create() throws InterruptedException, AWTException, IOException {
	
	//T(2);
	Actions a=new Actions(driver);
			a.moveToElement(xp("pim")).perform();
			
			xp("addemp").click();
			driver.switchTo().frame(xp("Eframe"));
			
	
	//Thread.sleep(2000);
	xp("Eid").clear();
	xp("Eid").sendKeys(pro.getProperty("ENUM"));
	//Thread.sleep(2000);
	xp("EL").sendKeys(pro.getProperty("ELN"));
	xp("EF").sendKeys(pro.getProperty("EFN"));
	xp("EM").sendKeys(pro.getProperty("EMN"));
	xp("EN").sendKeys(pro.getProperty("ENN"));
	a.moveToElement(xp("EP")).click().perform();
	T(1);
	StringSelection s=new StringSelection("C:\\Users\\admin\\Pictures\\Hanuman.jpeg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	T(2);
	
	Robot R=new Robot();
	R.keyPress(KeyEvent.VK_CONTROL);
	R.keyPress(KeyEvent.VK_V);
	T(2);
	//R.keyRelease(KeyEvent.VK_CONTROL);
	R.keyRelease(KeyEvent.VK_CONTROL);
	R.keyRelease(KeyEvent.VK_V);
	T(4);
    R.keyPress(KeyEvent.VK_ENTER);	
	R.keyRelease(KeyEvent.VK_ENTER);
	
	xp("ES").click();
	xp("EB").click();
}
		
	public void edit() {
		driver.switchTo().frame(xp("Eframe"));
		xp("ED").click();
		xp("EE").click();
		xp("EEM").clear();
		xp("EEM").sendKeys(pro.getProperty("EEN"));
		
		xp("ESS").click();
		xp("EB").click();
	}
	
	public void Delet() {
		driver.switchTo().frame(xp("Eframe"));
		xp("ED").click();
		xp("END").click();		
	}
	
	
	
}
