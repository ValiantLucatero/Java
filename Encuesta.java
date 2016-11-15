import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Encuesta extends JFrame implements ActionListener {

    private JLabel etiquetaBienvenida, p1, p2, p3, p4, p5, p6, p7, p8, p9, coment;
    private JRadioButton r1, rUno, r3, rTres, r4, rCuatro, r5, rCinco, r6, rSeis, r7, rSiete, r9, rNueve;
    private JCheckBox r8, rOcho;
    private JTextField comentarios;
    private JButton botonEnviar, botonCerrar;
    private JComboBox candidatos;
    
    String[] candi = { "Hillary Clinton", "Donald Trump", "Gary Johnson", "Jill Stein", "Evan McMullin" };

    public static void main(String[] args) {
        Encuesta demo = new Encuesta ();
        demo.setSize(400,700);
        demo.crearGUI();
        demo.setTitle("Encuesta");
        demo.setVisible(true);
    }

    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new BoxLayout(ventana,BoxLayout.Y_AXIS));

        etiquetaBienvenida = new JLabel("Responde si o no segun consideres:");
        ventana.add(etiquetaBienvenida);
        
        //Pregunta 1
        p1 = new JLabel("¿Estas al tanto de las elecciones en EUA?");
        ventana.add(p1);
        
        r1 = new JRadioButton("Si");
        ventana.add(r1);
        
        rUno = new JRadioButton("No");
		ventana.add(rUno);
		
		//Pregunta 2
        p2 = new JLabel("¿A quien apoyabas?");
        ventana.add(p2);
        
        JComboBox candidatos = new JComboBox(candi);
        ventana.add(candidatos);
        candidatos.addActionListener(this);
        
		
		//Pregunta 3
        p3 = new JLabel("¿Estas conforme con el resultado?");
        ventana.add(p3);
        
        r3 = new JRadioButton("Si");
        ventana.add(r3);
        
        rTres = new JRadioButton("No");
		ventana.add(rTres);
		
		//Pregunta 4
        p4 = new JLabel("¿Tienes familiares en EUA?");
        ventana.add(p4);
        
        r4 = new JRadioButton("Si");
        ventana.add(r4);
        
        rCuatro = new JRadioButton("No");
		ventana.add(rCuatro);
		
		//Pregunta 5
        p5 = new JLabel("¿Crees que Trump tiene la capacidad de dirigir un pais tan poderoso?");
        ventana.add(p5);
        
        r5 = new JRadioButton("Si");
        ventana.add(r5);
        
        rCinco = new JRadioButton("No");
		ventana.add(rCinco);
		
		//Pregunta 6
        p6 = new JLabel("¿Crees que Trump esta en lo corecto con su politica migratoria?");
        ventana.add(p6);
        
        r6 = new JRadioButton("Si");
        ventana.add(r6);
        
        rSeis = new JRadioButton("No");
		ventana.add(rSeis);
		
		//Pregunta 7
        p7 = new JLabel("¿Has viajado a EUA?");
        ventana.add(p7);
        
        r7 = new JRadioButton("Si");
        ventana.add(r7);
        
        rSiete = new JRadioButton("No");
		ventana.add(rSiete);
		
		//Pregunta 8
        p8 = new JLabel("¿Cuantos años tienes?");
        ventana.add(p8);
        
        r8 = new JCheckBox("10-18");
        ventana.add(r8);
        
        rOcho = new JCheckBox("18-25");
		ventana.add(rOcho);
		
		//Pregunta 9
        p9 = new JLabel("¿Ayudaras con el muro?");
        ventana.add(p9);
        
        r9 = new JRadioButton("Si");
        ventana.add(r9);
        
        rNueve = new JRadioButton("No");
		ventana.add(rNueve);
		
        comentarios = new JTextField(8);
        comentarios.setBounds(9, 10, 30, 30);
        ventana.add(comentarios);

        botonEnviar = new JButton("Enviar");
		botonEnviar.setAlignmentX(CENTER_ALIGNMENT);
        ventana.add(botonEnviar);
        botonEnviar.setBounds(2, 20, 30, 30);
        botonEnviar.addActionListener(this);
        
        botonCerrar = new JButton("Salir");
        botonCerrar.setAlignmentX(CENTER_ALIGNMENT);
        botonCerrar.setBounds(2, 50, 30, 30);
        ventana.add(botonCerrar);
        botonCerrar.addActionListener(this);
       
    }

    public void actionPerformed(ActionEvent event) {
    	Object origen= event.getSource(); //permite trabajar con mas de un botón
    	if (origen == botonEnviar)
    	{	
           if (r3.isSelected())
           {
               JOptionPane.showMessageDialog(null,"Conformista!");
           }
           else if(r4.isSelected())
           {
			   JOptionPane.showMessageDialog(null,"Deseales suerte a tus familiares");
		   }
			  else 
              {
				JOptionPane.showMessageDialog(null,"Buscas un cambio");
              }
    	}
    	else if (origen == botonCerrar) {
    		System.exit(0);// Sale del Sistema
    		
    	}
    }
}