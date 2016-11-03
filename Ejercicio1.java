/***:
*@Programa: Ejercicio1.java
*Autor: José Andrés Lucatero Tenorio
*Fecha: 19/10/16
*Descripcion: Inicia POO Manejo de objetos y eventos
*
***/
/*Bibliotecas*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ejercicio1 extends JFrame
  implements ActionListener
{
  private JButton boton;
  private JPanel panel;

  public static void main(String[] args)
  {
    Ejercicio1 marco = new Ejercicio1();
    marco.setSize(420, 350);
    marco.crearGUI();
    marco.setVisible(true);
  }

  private void crearGUI()
  {
    Color setAzul = new Color(80,80,255);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container ventana = getContentPane();
    ventana.setLayout(new FlowLayout() );

    panel = new JPanel();
    panel.setPreferredSize(new Dimension(500, 500));
    panel.setBackground(setAzul);
    ventana.add(panel);

    boton = new JButton("Haga clic");
    ventana.add(boton);
    boton.addActionListener(this);
  }

  public void actionPerformed(ActionEvent event)
  {
    Graphics papel = panel.getGraphics();

    //Esqueleto
    papel.drawRect(10,10, 100,100);
    papel.drawRect(10,110, 450,100);
    papel.drawRect(350,10, 110,100);
    papel.drawRect(300,60, 50,50);
    papel.drawLine(110,100, 110,210);
    papel.drawLine(350,100, 350,210);
    papel.drawRect(200,10, 50,100);
    papel.drawRect(250,10, 50,100);

    //Escaleras
    for (int y=20;y<=100;y+=10)
    {
      papel.drawLine(200,y, 250,y);
      papel.drawLine(250,y, 300,y);
    }

    //Ovalos
    papel.drawOval(150,140, 30,60);

    //Texto
    papel.drawString("Mi cuarto", 370,60);
    papel.drawString("El cuarto de", 370,155);
    papel.drawString("mi hermano", 370,165);
    papel.drawString("Sala", 230,165);
    papel.drawString("El cuarto de", 20,155);
    papel.drawString("mis padres", 20,165);
    papel.drawString("Sanitario", 20,60);

    //Degradado
    for (int x=1;x<=255;x++ )
    {
      Color col = new Color(x,10,32);
      papel.setColor(col);
      papel.drawLine(x,230, x,330);
    }
  }
}
