import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ejercicio2 extends JFrame
  implements ActionListener
{
  private JButton boton;
  private JPanel panel;

  public static void main(String[] args)
  {
    Ejercicio2 marco = new Ejercicio2();
    marco.setSize(100, 60);
    marco.crearGUI();
    marco.setVisible(true);
  }
  
  private void crearGUI()
  {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container ventana = getContentPane();
    ventana.setLayout(new FlowLayout() );

    boton = new JButton("Haga clic para iniciar");
    ventana.add(boton);
    boton.addActionListener(this);
  }

  public void actionPerformed(ActionEvent event)
  {
	//mesnaje de bienvenida
	JOptionPane.showMessageDialog(null,"Hola, como estas?");
	//declaracion de variables
	double valorPesos, valorDolares, tipoCambio;
	String pesos, tCambioDolar;
	//recepcion de valores
	pesos=JOptionPane.showInputDialog("Indica la cantidad de Pesos a convertir");
	tCambioDolar=JOptionPane.showInputDialog("Indica a como esta el dolar");
	//transformar los valores
	tipoCambio=Double.parseDouble(tCambioDolar);
	valorPesos=Double.parseDouble(pesos);
	//operacion
	valorDolares=valorPesos/tipoCambio;
	//muestra de resultado
	JOptionPane.showMessageDialog(null,"Total:"+Double.toString(valorDolares));
  }
}
