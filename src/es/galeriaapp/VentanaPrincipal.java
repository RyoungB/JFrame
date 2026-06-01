package es.galeriaapp;



import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends JFrame{

	public VentanaPrincipal()  {
		super("Gestor de Imágenes");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//usa gestor de distribuccion borderlayout (5zonas)
		setLayout(new BorderLayout());
		setSize(1000,800);
		
		
		//maximimiza la ventana al abrirla
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		setJMenuBar(crearBarraMenu());
	
		//caraarFavoritosDesdeArchivo();
		setVisible(true);
		
	}
	
	//metodo crearBarraMenu
	
	
	private JMenuBar crearBarraMenu() {
		
		
		JMenuBar barraMenu = new JMenuBar();
		
		
		JMenu menuArchivo = new JMenu("Archivo");
		JMenu menuImagenes = new JMenu("Imágenes");
		JMenu menuAyuda  = new JMenu("Ayuda");
		
		
		
		
		
		
		JMenuItem itemAbrirExplorador = new JMenuItem("Abrir Explorador");
		//itemAbrirExplorador.setIcon(new ImageIcon("img/icons/imagen.png"));
		JMenuItem itemSalir = new JMenuItem("Salir");
		JMenuItem itemAcercaDe = new JMenuItem("Acerca de");
		JMenuItem itemPresentacion  = new JMenuItem("Iniciar Presentación");
		JMenuItem itemFavoritos = new JMenuItem("Ver Favoritas");
		
		
		
		
		
		
		
		itemSalir.addActionListener(e -> System.exit(0));
		itemAcercaDe.addActionListener(e -> mostrarAcercaDe());
		//itemFavoritos.addActionListener( e -> cargarFavortios("./img"));
		
		
		
		
		
				// AGREGAR ÍTEMS A LOS MENÚS
				menuArchivo.add(itemAbrirExplorador);
				menuAyuda.add(itemSalir);
				menuAyuda.add(itemAcercaDe);
				menuArchivo.add(itemFavoritos);
				
				// AGREGAR MENÚS A LA BARRA DE MENÚ
				barraMenu.add(menuArchivo);
				barraMenu.add(menuImagenes);
				barraMenu.add(menuAyuda);
		
		return barraMenu;
		
	}



	private void mostrarAcercaDe() {
		//debes pasarle un numero especifico de argumentos 
		JOptionPane.showMessageDialog(null,
						"Un visor y organizador de imágenes simple\n"
						+"versión 1.0\n"
						+"Creado por Koi \n",
						"Gestor de imagenes"
						,JOptionPane.INFORMATION_MESSAGE);
	}


	
	
	
	

}
