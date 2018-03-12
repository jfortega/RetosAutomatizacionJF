/**
 * 
 */
package com.pruebaOficina;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.*;
/**
 * @author JFORTEGA
 *
 */
public class pruebaOficina {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String direccion= "";
		String navegador="";
		
		try {
			
		direccion= "Carrera 48";		
		
		if (navegador=="Chrome")
		{
			System.setProperty(
					"webdriver.chrome.driver",
				 "D:/Users/jfortega/Documents/Visual Studio 2015/Clases Selenium - Appium/PracticaBancolombia - SELENIUM/packages/Selenium.Chrome.WebDriver.2.32/driver/chromedriver.exe");
			
			
			WebDriver webDriver = new ChromeDriver();		
			
		}
		else
		{
						
			WebDriver webDriver = new InternetExplorerDriver();
		}	
		
			
		
	
	 	 
		webDriver.navigate().to("https://www.grupobancolombia.com/wps/portal/personas/buscador-sucursales");
		
		WebElement txtDireccion = webDriver.findElement(By.id("srch-term"));
	    txtDireccion.sendKeys(direccion);
			
		txtDireccion= webDriver.findElement(By.xpath("//*[@id='tab1']/div[1]/div[1]/div"));
		txtDireccion.click();
		Thread.sleep(15000);

		txtDireccion= webDriver.findElement(By.xpath("//*[@id=\'tab1\']/div[1]/div[6]/div[1]/div/div[1]/button"));
		txtDireccion.click();

//System.out.print(primeraOficina);

//webDriver.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
			
	}


}
