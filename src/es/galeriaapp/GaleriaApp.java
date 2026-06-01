package es.galeriaapp;

import javax.swing.SwingUtilities;

public class GaleriaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		//invokelater inicia Ventana Princiapl en el hilo especial de Swing
		SwingUtilities.invokeLater(()  -> new VentanaPrincipal());

	}

}
