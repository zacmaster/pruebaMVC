package vista;

import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculadoraVista extends JFrame{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private JTextField primerNumero = new JTextField(10);
	private JLabel etiquetaSuma = new JLabel("+");
	private JTextField segundoNumero = new JTextField(5);
	private JButton botonCalcular = new JButton("=");
	private JTextField resultado = new JTextField(10);
	private JButton botonBorrar = new JButton("C");
	
	public CalculadoraVista() {
		JPanel calculadoraPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		
		calculadoraPanel.add(primerNumero);
		calculadoraPanel.add(etiquetaSuma);
		calculadoraPanel.add(segundoNumero);
		calculadoraPanel.add(botonCalcular);
		calculadoraPanel.add(resultado);
		calculadoraPanel.add(botonBorrar);
		
		
		this.add(calculadoraPanel);
		
		
	}
	
	public int getPrimerNumero() {
		return Integer.parseInt(primerNumero.getText());
	}
	
	public int getSegundoNumero() {
		return Integer.parseInt(segundoNumero.getText());
	}
	public int getResultado() {
		return Integer.parseInt(resultado.getText());
	}
	
	public void setResultado(int resultado) {
		this.resultado.setText(Integer.toString(resultado));
	}
	
	public void blanquear() {
		primerNumero.setText("");
		segundoNumero.setText("");
		resultado.setText("");
	}
	
	
	public void agregarListenerCalcular(ActionListener listenerBotonCalular) {
		botonCalcular.addActionListener(listenerBotonCalular);
	}
	
	public void agregarListenerBorrar(ActionListener listenerBotonBorrar) {
		botonBorrar.addActionListener(listenerBotonBorrar);
	}
	
	
	public void mostrarMensajeError(String mensajeError) {
		JOptionPane.showMessageDialog(this, mensajeError);
	}
	
	public void hacerVisible(boolean booleano) {
		this.setVisible(booleano);
	}
	
	
}