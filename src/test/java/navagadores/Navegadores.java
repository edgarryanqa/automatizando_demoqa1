package navagadores;


import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriversFactory;
import pages.AlertsPage;


/**
 * Class responsável por criar a conexão e configuração do navegador
 * 
 * @param Navegadores
 * @author Edgar Ryan
 */
public class Navegadores  extends DriversFactory{
	
	
	
	public static void abrirNavegador() {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com");
		driver.manage().window().maximize();
		AlertsPage.acessarAlerts();	
		
		
		
	}
	
	
	public static void fecharNavegador() {
		driver.quit();
		
		
	}

	

}
