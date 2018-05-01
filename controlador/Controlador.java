package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.CalculadoraModelo;
import vista.CalculadoraVista;

public class Controlador {
	private CalculadoraModelo calculadoraModelo;
	private CalculadoraVista calculadoraVista;
	
	public Controlador(CalculadoraModelo calculadoraModelo, CalculadoraVista calculadoraVista) {
		this.calculadoraModelo = calculadoraModelo;
		this.calculadoraVista = calculadoraVista;
		
		this.calculadoraVista.agregarListenerCalcular(new ListenerCalcular());
		this.calculadoraVista.agregarListenerBorrar(new ListenerBorrar());
	}
	
	private class ListenerCalcular implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			int primerNumero, segundoNumero = 0;
			try {
				primerNumero = calculadoraVista.getPrimerNumero();
				segundoNumero = calculadoraVista.getSegundoNumero();
				
				calculadoraModelo.sumarDosNumeros(primerNumero, segundoNumero);
				calculadoraVista.setResultado(calculadoraModelo.getResultado());
			}
			catch(NumberFormatException ex){
				calculadoraVista.mostrarMensajeError("Debe ingresar 2 enteros!");
			}
			
		}
		
	}
	
	private class ListenerBorrar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			calculadoraVista.blanquear();
		}
		
	}
	
	
}
