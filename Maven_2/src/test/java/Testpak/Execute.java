package Testpak;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import BasePak.Baseclass;

public class Execute extends Baseclass{
  @Test
  public void Login() throws IOException, InterruptedException, AWTException {
	  Coding_class e=new Coding_class();          
	 // e.BC();
	 e.loogin();
	 e.create();
	e.edit();
	e.Delet();
	// e.Excedata();
  }
}
