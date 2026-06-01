package es.galeriaapp;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class GaleriaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			/*
			 * La siguiente instrcion le dice que pille el aspecto del sistema operativo que tiene mi ordenador 
			 * 
			 */
			
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		//invokelater inicia Ventana Princiapl en el hilo especial de Swing
		SwingUtilities.invokeLater(()  -> new VentanaPrincipal());

	}

}
