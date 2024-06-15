package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;

import elementos.Elementos;
import metodos.Metodos;
import navagadores.Navegadores;
import pages.AlertsPage;





/**
 * Class responsável por fazer os testes
 * 
 * @param alerts
 * @author Edgar Ryan
 */

public class ValidarAlerts extends Navegadores{
	
	
	//Mensagens exibidas após cada click
	
	String msg1 = "You clicked a button";
	String msg2 = "This alert appeared after 5 seconds";
	String msg3 = "You selected Ok";
	String msg4 = "You entered Edgar";
	
	@BeforeEach
	public void setup () {
		Navegadores.abrirNavegador();
	
	}
	
	@AfterEach 
	public void afterTest() {
		Navegadores.fecharNavegador();
		
	}
	
	
	@Test
	public void validarClick1() {
		AlertsPage.click1(msg1);
		

	}
	@Test
	public void validarClick2() throws InterruptedException  {
		AlertsPage.click2(msg2);
	


	}
	@Test
	public void validarClick3()  {
		AlertsPage.click3(msg3);
		
		
		

	}
	@Test
	public void validarClick4()  {
		AlertsPage.click4("Edgar",msg4);
		
		
		
		
		

	}
	
	
	


}
