import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Botones extends JFrame implements ActionListener
{
	private JPanel panel;              	  //Llama objeto panel
	private JLabel etiquetaBienvenida; 	  //Llama objeto etiqueta
	private JTextField campoCodigo;    	  //Llama objeto Caja de Texto
	private JButton botonAbrir, botonMensaje; //Llama objeto boton
	private JTextField campoTextoResultado;   //Llama objeto Caja de Texto

	public static void main(String[] args)
	{
		Botones demo=new Botones();
		demo.setSize(500,500);
		demo.crearGUI();
		demo.setVisible(true);
	}
	
	private void crearGUI()
	{
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
    		 Container ventana = getContentPane();
    		 ventana.setLayout(new FlowLayout() );

		 etiquetaBienvenida=new JLabel("Escriba el codigo");
		 ventana.add(etiquetaBienvenida);

		 campoCodigo=new JTextField(5);
		 ventana.add(campoCodigo);

		 botonAbrir=new JButton("Abrir");
		 ventana.add(botonAbrir);
		 botonAbrir.addActionListener(this); //para la accion del boton

		 botonMensaje=new JButton ("Mensaje");
		 ventana.add(botonMensaje);
		 botonMensaje.addActionListener(this); //para la accion del boton

		 campoTextoResultado=new JTextField(5);
		 ventana.add(campoTextoResultado);
	}
	public void actionPerformed(ActionEvent event)
	{
		//Graphics papel=panel.getGraphics();
		//Object origen=event.getSource();
		//if(origen==botonAbrir)
		//{
		  	String cadenaCodigo;
			int codigo;
			cadenaCodigo=campoCodigo.getText();
			codigo=Integer.parseInt(cadenaCodigo);
			if(codigo==123)
				campoTextoResultado.setText("abierta");
		//}
	}
}