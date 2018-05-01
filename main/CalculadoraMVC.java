package main;

import controlador.Controlador;
import modelo.CalculadoraModelo;
import vista.CalculadoraVista;

public class CalculadoraMVC {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		CalculadoraModelo calculadoraModelo = new CalculadoraModelo();
		CalculadoraVista calculadoraVista = new CalculadoraVista();
		Controlador controlador = new Controlador(calculadoraModelo, calculadoraVista);
		
		calculadoraVista.hacerVisible(true);
	}
	

}
