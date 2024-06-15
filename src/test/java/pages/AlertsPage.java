package pages;



import org.openqa.selenium.By;

import elementos.Elementos;

/**
 * Class responsável por estrurar as ações  utilizadas na Page Alerts
 * 
 * @param Alerts Page
 * @author Edgar Ryan
 */

import metodos.Metodos;

public class AlertsPage extends  Elementos{
	
	
		public static void acessarAlerts() {
			Metodos.clicarPorTexto("h5","Alerts, Frame & Windows" );
			Metodos.clicar(alerts);
						
		}
		
	
		public static void click1(String msgEsperada) {
			Metodos.clicar(click1);
			Metodos.validarMsgAlert(msgEsperada);
			Metodos.clicarAlert();
			
			
		}
		public static void click2(String msgEsperada) throws InterruptedException {
			Metodos.clicar(click2);
			Metodos.pausa();
			Metodos.validarMsgAlert(msgEsperada);
			Metodos.clicarAlert();
		}
		public static void click3(String msgEsperada) {
			Metodos.clicar(click3);
			Metodos.clicarAlert();
			Metodos.validarTexto(msgBt3, msgEsperada);
			
		}
		public static void click4(String nome, String msgesperada) {
			Metodos.clicar(click4);
			Metodos.escreverNoAlert(nome);
			Metodos.clicarAlert();
			Metodos.validarTexto(msgbt4, msgesperada);
			
		}
		public static void clickAlert() {
			Metodos.clicarAlert();
		}
		
		
		public static void validarTexto(By elemento,String textoEsperado) {
			Metodos.validarTexto(elemento, textoEsperado);
			
			
		}
		public static void validarTitle(String tituloEsperado) {
			Metodos.validarTitle(tituloEsperado);
			
			
		}
		public static void textAlert(String msgEsperada) {
			Metodos.validarMsgAlert(msgEsperada);
			
			
		}
		public static void pausaAlert() throws InterruptedException {
			Metodos.pausa();
			
		}
		public static void escreverAlert(String nome) {
			Metodos.escreverNoAlert(nome);
		}
		
		
		
		
		
		
		
		
	

	
}
